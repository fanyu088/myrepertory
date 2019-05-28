package com.example.demo12Stream;

import com.example.RO.Obj;
import com.example.RO.UserRO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_sorted {


    public static void main(String[] args) {

        List<UserRO> list = Arrays.asList(new UserRO("ddf", "dfds", 23, true),
                new UserRO("dsdfdsdf", "dftrhds", 9, true),
                new UserRO("ddf", "rth", 456, false),
                new UserRO("dtrsdf", "dfd45s", 7, true)

        );
        List<UserRO> collect = list.stream().sorted(Comparator.comparing(UserRO::getFlag).reversed().thenComparing(UserRO::getId)).collect(Collectors.toList());

        System.out.println(collect);


    }

    private static void method1() {
        List<Obj> objs = Arrays.asList(new Obj("bhe", 2),
                new Obj("anni", 1),
                new Obj("bul", 2),
                new Obj("cry", 3)
                /*,new Obj(null, 3),
                new Obj("cc", null),
                new Obj(null, null)*/);

        List<Integer> list = Arrays.asList(3, 1, 2);

        objs.stream().sorted(Comparator.comparing(Obj::getScope, (x, y) -> {
           /* if (x == null && y != null) {
                return 1;
            } else if (x != null && y == null) {
                return -1;
            } else if (x == null && y == null) {
                return -1;
            } else {*/
            //按照读取的list顺序排序
            for (int sort : list) {
                if (sort == x || sort == y) {
                    if (x.equals(y)) {
                        return 0;
                    } else if (sort == x) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }
            return 0;
//            }
        })).collect(Collectors.toList()).forEach(System.out::println);
    }


    private void method() {
        List<Obj> objs = Arrays.asList(new Obj("bhe", 2),
                new Obj("anni", 1),
                new Obj("bul", 2),
                new Obj("cry", 3),
                new Obj(null, 3),
                new Obj("cc", null),
                new Obj(null, null));

        List<Integer> list = Arrays.asList(2, 1, 3);

        objs.stream().sorted(Comparator.comparing(Obj::getScope, (x, y) -> {
            if (x == null && y != null) {
                return 1;
            } else if (x != null && y == null) {
                return -1;
            } else if (x == null && y == null) {
                return -1;
            } else {
                //按照读取的list顺序排序
                for (int sort : list) {
                    if (sort == x || sort == y) {
                        if (x.equals(y)) {
                            return 0;
                        } else if (sort == x) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                }
                return 0;
            }
        }).reversed()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
