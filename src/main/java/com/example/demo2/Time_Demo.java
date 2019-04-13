package com.example.demo2;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Time_Demo {
    private static final Map<LocalTime, String> DRAW_TIME;

    static {
        DRAW_TIME = new HashMap();
        DRAW_TIME.put(LocalTime.parse("10:20:50"), "001");
        DRAW_TIME.put(LocalTime.parse("10:40:50"), "002");
        DRAW_TIME.put(LocalTime.parse("11:00:50"), "003");
        DRAW_TIME.put(LocalTime.parse("11:20:50"), "004");
        DRAW_TIME.put(LocalTime.parse("11:40:50"), "005");
        DRAW_TIME.put(LocalTime.parse("12:00:50"), "006");
        DRAW_TIME.put(LocalTime.parse("12:20:50"), "007");
        DRAW_TIME.put(LocalTime.parse("12:40:50"), "008");
        DRAW_TIME.put(LocalTime.parse("13:00:50"), "009");
        DRAW_TIME.put(LocalTime.parse("13:20:50"), "010");
        DRAW_TIME.put(LocalTime.parse("13:40:50"), "011");
        DRAW_TIME.put(LocalTime.parse("14:00:50"), "012");
        DRAW_TIME.put(LocalTime.parse("14:20:50"), "013");
        DRAW_TIME.put(LocalTime.parse("14:40:50"), "014");
        DRAW_TIME.put(LocalTime.parse("15:00:50"), "015");
        DRAW_TIME.put(LocalTime.parse("15:20:50"), "016");
        DRAW_TIME.put(LocalTime.parse("15:40:50"), "017");
        DRAW_TIME.put(LocalTime.parse("16:00:50"), "018");
        DRAW_TIME.put(LocalTime.parse("16:20:50"), "019");
        DRAW_TIME.put(LocalTime.parse("16:40:50"), "020");
        DRAW_TIME.put(LocalTime.parse("17:00:50"), "021");
        DRAW_TIME.put(LocalTime.parse("17:20:50"), "022");
        DRAW_TIME.put(LocalTime.parse("17:40:50"), "023");
        DRAW_TIME.put(LocalTime.parse("18:00:50"), "024");
        DRAW_TIME.put(LocalTime.parse("18:20:50"), "025");
        DRAW_TIME.put(LocalTime.parse("18:40:50"), "026");
        DRAW_TIME.put(LocalTime.parse("19:00:50"), "027");
        DRAW_TIME.put(LocalTime.parse("19:20:50"), "028");
        DRAW_TIME.put(LocalTime.parse("19:40:50"), "029");
        DRAW_TIME.put(LocalTime.parse("20:00:50"), "030");
        DRAW_TIME.put(LocalTime.parse("20:20:50"), "031");
        DRAW_TIME.put(LocalTime.parse("20:40:50"), "032");
        DRAW_TIME.put(LocalTime.parse("21:00:50"), "033");
        DRAW_TIME.put(LocalTime.parse("21:20:50"), "034");
        DRAW_TIME.put(LocalTime.parse("21:40:50"), "035");
        DRAW_TIME.put(LocalTime.parse("22:00:50"), "036");
        DRAW_TIME.put(LocalTime.parse("22:20:50"), "037");
        DRAW_TIME.put(LocalTime.parse("22:40:50"), "038");
        DRAW_TIME.put(LocalTime.parse("23:00:50"), "039");
        DRAW_TIME.put(LocalTime.parse("23:20:50"), "040");
        DRAW_TIME.put(LocalTime.parse("23:40:50"), "041");
        DRAW_TIME.put(LocalTime.parse("00:00:50"), "042");
        DRAW_TIME.put(LocalTime.parse("00:20:50"), "043");
        DRAW_TIME.put(LocalTime.parse("00:40:50"), "044");
        DRAW_TIME.put(LocalTime.parse("01:00:50"), "045");
        DRAW_TIME.put(LocalTime.parse("01:20:50"), "046");
        DRAW_TIME.put(LocalTime.parse("01:40:50"), "047");
        DRAW_TIME.put(LocalTime.parse("02:00:50"), "048");
    }

    public static void main(String[] args) {


        LocalTime nextIssueTime =
                DRAW_TIME.keySet().stream()
                        .sorted()
                        .filter(
                                s -> s.isAfter(/*LocalTime.now()*/LocalTime.parse("00:00:30").plusSeconds(140))
                        )
                        .findFirst()
                        .orElse(LocalTime.parse("00:00:50"));

        Set<LocalTime> localTimes = DRAW_TIME.keySet();
        Stream<LocalTime> stream = localTimes.stream();
        Stream<LocalTime> sorted = stream.sorted();
        Optional<LocalTime> first = sorted.filter(a -> a.isAfter(LocalTime.parse("23:50:30"))).findFirst();
        LocalTime localTime = first.orElse(LocalTime.parse("00:10:00"));
        System.out.println(localTime);


        System.out.println(nextIssueTime);

    }
}
