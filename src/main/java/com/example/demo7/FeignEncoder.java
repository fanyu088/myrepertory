package com.example.demo7;

import feign.RequestTemplate;
import feign.codec.EncodeException;
import feign.codec.Encoder;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *  * @author lxl
 *  
 */
public class FeignEncoder implements Encoder {


    private final List<HttpMessageConverter<?>> converters = new RestTemplate().getMessageConverters();
    private final HttpHeaders multipartHeaders = new HttpHeaders();
    private final HttpHeaders jsonHeaders = new HttpHeaders();

    public static final Charset UTF_8 = Charset.forName("UTF-8");

    public FeignEncoder() {
        multipartHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
        jsonHeaders.setContentType(MediaType.APPLICATION_JSON);
    }


    public static boolean isFormRequest(Type type) {
        return MAP_STRING_WILDCARD.equals(type);
    }

    @Override
    public void encode(Object object, Type bodyType, RequestTemplate template) throws EncodeException {
        if (isFormRequest(bodyType)) {
            encodeMultipartFormRequest((Map<String, ?>) object, template);
        } else {
            encodeRequest(object, jsonHeaders, template);
        }
    }


    private void encodeMultipartFormRequest(Map<String, ?> formMap, RequestTemplate template) throws EncodeException {
        if (CollectionUtils.isEmpty(formMap)) {
            throw new EncodeException("参数不能为空.");
        }
        LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        for (Entry<String, ?> entry : formMap.entrySet()) {
            Object value = entry.getValue();
            if (isMultipartFile(value)) {
                map.add(entry.getKey(), encodeMultipartFile((MultipartFile) value));
            } else if (isMultipartFileArray(value)) {
                encodeMultipartFiles(map, entry.getKey(), Arrays.asList((MultipartFile[]) value));
            } else {
                map.add(entry.getKey(), encodeJsonObject(value));
            }
        }
        encodeRequest(map, multipartHeaders, template);
    }


    private boolean isMultipartFile(Object object) {
        return object instanceof MultipartFile;
    }


    private boolean isMultipartFileArray(Object o) {
        return o != null && o.getClass().isArray() && MultipartFile.class.isAssignableFrom(o.getClass().getComponentType());
    }


    /**
     *      * 设置头
     *      * @param file
     *      * @return
     *     
     */

    private HttpEntity<?> encodeMultipartFile(MultipartFile file) {


        try {
            HttpHeaders filePartHeaders = new HttpHeaders();
            filePartHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            Resource multipartFileResource = new MultipartFileResource(file.getOriginalFilename(), file.getSize(), file.getInputStream());
            return new HttpEntity<>(multipartFileResource, filePartHeaders);
        } catch (IOException ex) {
            throw new EncodeException("Cannot encode request.", ex);
        }
    }


    /**
     *      * 映射
     *      * @param map
     *      * @param name
     *      * @param files
     *     
     */

    private void encodeMultipartFiles(LinkedMultiValueMap<String, Object> map, String name, List<? extends MultipartFile> files) {
        HttpHeaders filePartHeaders = new HttpHeaders();
        filePartHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        try {
            for (MultipartFile file : files) {
                Resource multipartFileResource = new MultipartFileResource(file.getOriginalFilename(), file.getSize(), file.getInputStream());
                map.add(name, new HttpEntity<>(multipartFileResource, filePartHeaders));
            }
        } catch (IOException ex) {
            throw new EncodeException("Cannot encode request.", ex);
        }
    }


    /**
     *      * {@link HttpEntity} {@code Content-type}
     *      * {@code application/json}
     *      *
     *      * @param o
     *      * @return
     *     
     */


    private HttpEntity<?> encodeJsonObject(Object o) {
        HttpHeaders jsonPartHeaders = new HttpHeaders();
        jsonPartHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<>(o, jsonPartHeaders);
    }


    /**
     *      * {@link org.springframework.web.client.RestTemplate}
     *      *
     *      * @param value
     *      * @param requestHeaders
     *      * @param template
     *      * @throws EncodeException
     *     
     */


    private void encodeRequest(Object value, HttpHeaders requestHeaders, RequestTemplate template) throws
            EncodeException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        HttpOutputMessage dummyRequest = new HttpOutputMessageImpl(outputStream, requestHeaders);
        try {
            Class<?> requestType = value.getClass();
            MediaType requestContentType = requestHeaders.getContentType();
            for (HttpMessageConverter<?> messageConverter : converters) {
                if (messageConverter.canWrite(requestType, requestContentType)) {
                    ((HttpMessageConverter<Object>) messageConverter).write(value, requestContentType, dummyRequest);
                    break;
                }
            }
        } catch (IOException ex) {
            throw new EncodeException("Cannot encode request.", ex);
        }
        HttpHeaders headers = dummyRequest.getHeaders();
        if (headers != null) {
            for (Entry<String, List<String>> entry : headers.entrySet()) {
                template.header(entry.getKey(), entry.getValue());
            }
        }
        /*
        使用bytearray方式传输
         */
        template.body(outputStream.toByteArray(), UTF_8);
    }

}
