package com.example.demo12Stream;

import com.example.RO.UserRO;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_test {
    public static void main(String[] args) {

        UserRO aa = new UserRO("张三", "南京", 23);
        UserRO bb = new UserRO("李四", "天津", 55);
        UserRO cc = new UserRO("王五", "上海", 17);
        UserRO dd = new UserRO("马二", "无锡", 18);
        UserRO ee = new UserRO("赵一", "无锡", 18);

        ArrayList<UserRO> userROS = new ArrayList<>();

        userROS.add(aa);
        userROS.add(bb);
        userROS.add(cc);
        userROS.add(dd);
        userROS.add(ee);

        method6(userROS);

    }

    // 输出转换map，自身id，对象，重复键覆盖
    private static void method6(ArrayList<UserRO> userROS) {
        Map<Integer, UserRO> collect = userROS.parallelStream().collect(Collectors.toMap((UserRO::getId), Function.identity(), (a, b) -> b));
        System.out.println(collect);
    }

    // 流的输出转换，注意Terminal操作一次流就终止了
    private static void method5(ArrayList<UserRO> userROS) {
        Stream<String> stringStream = userROS.parallelStream()
                .filter(s -> s.getId() > 17)
                .sorted(Comparator.comparing(UserRO::getId).reversed())
                .map(UserRO::getName);

        String[] strings = stringStream.toArray(String[]::new);
        System.out.println(Arrays.toString(strings));

        List<String> collect = stringStream.collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("-------------------------");

        Set<String> collect1 = stringStream.collect(Collectors.toSet());
        System.out.println(collect1);
        System.out.println("-------------------------");

        Stack<String> collect2 = stringStream.collect(Collectors.toCollection(Stack::new));
        System.out.println(collect2);
        System.out.println("-------------------------");

        String string = stringStream.collect(Collectors.joining()).toString();
        System.out.println(string);
    }


    // 数值流构造
    private static void method4() {
        IntStream.of(1, 2, 3, 4).forEach(System.out::println);
        System.out.println("-----------------------------------");
        IntStream.range(1, 5).forEach(System.out::println);
        System.out.println("-----------------------------------");
        IntStream.rangeClosed(1, 6).forEach(System.out::println);
    }

    // 获取流方式
    private static void method3() {
        Stream stream = Stream.of("a", "b", "c");
        System.out.println(stream.collect(Collectors.toList()));
        System.out.println("----------------------------------");

        String[] strings = {"a", "b", "c"};
        stream = Stream.of(strings);
        System.out.println(stream.collect(Collectors.toList()));
        System.out.println("----------------------------------");

        stream = Arrays.stream(strings);
        System.out.println(stream.collect(Collectors.toList()));
        System.out.println("----------------------------------");

        List<String> list = new ArrayList<>(Arrays.asList(strings));
        stream = list.stream();
        System.out.println(stream.collect(Collectors.toList()));
        System.out.println("----------------------------------");
    }


    // 求和
    private static void method2(ArrayList<UserRO> userROS) {
        int sum = userROS.stream()
                .filter(s -> !s.getAdress().equals("上海"))
                .mapToInt(UserRO::getId)
                .sum();
        System.out.println(sum);
    }

    // 排序(parallelStream多管道效率高)
    private static void method1(ArrayList<UserRO> userROS) {
        List<String> list = userROS.parallelStream()
                .filter(s -> s.getId() > 17)
                .sorted(Comparator.comparing(UserRO::getId).reversed())
                .map(UserRO::getName)
                .collect(Collectors.toList());


        System.out.println(list);
    }

}
