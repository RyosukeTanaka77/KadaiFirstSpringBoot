package com.techacademy;

import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class KadaiFirstController {
	@GetMapping("/")
    public String index() {
        return "Hello SpringBoot!";
    }

    public static void main(String[] args) {

        String yyyymmdd = "20230414";

        int yyyy    = Integer.parseInt(yyyymmdd.substring(0, 4));
        int mm      = Integer.parseInt(yyyymmdd.substring(4, 6));
        int dd      = Integer.parseInt(yyyymmdd.substring(6));

        LocalDate date = LocalDate.of( yyyy, mm, dd );

        String week = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.println(yyyymmdd + "の曜日は" + week);
    }


        @GetMapping("/plus/{val1}/{val2}")
        public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 + val2;
            return "計算結果：" + res;
        }

        @GetMapping("/plus/{val1}/{val2}")
        public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
                int res = 0;
                res = val1 + val2;
                return "計算結果：" + res;

        }

        @GetMapping("/plus/{val1}/{val2}")
        public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 + val2;
            return "計算結果：" + res;
        }

        @GetMapping("/plus/{val1}/{val2}")
        public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 + val2;
            return "計算結果：" + res;
        }

}