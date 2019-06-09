package com.example.RO;

import javax.persistence.*;
import java.io.Serializable;
import lombok.*;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-06-09 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="article" )
public class Article  implements Serializable {

	private static final long serialVersionUID =  8156930364396706694L;

   	@Column(name = "discountoffId" )
	private Long discountoffId;

   	@Column(name = "content" )
	private String content;

   	@Column(name = "coverUrl" )
	private String coverUrl;

   	@Column(name = "description" )
	private String description;

   	@Column(name = "publishDate" )
	private String publishDate;

   	@Column(name = "redirectUrl" )
	private String redirectUrl;

   	@Column(name = "title" )
	private String title;

   	@Column(name = "pc_coverUrl" )
	private String pcCoverUrl;

   	@Column(name = "icon" )
	private String icon;

   	@Column(name = "sort" )
	private Long sort;

   	@Column(name = "appid" )
	private String appid;

}
