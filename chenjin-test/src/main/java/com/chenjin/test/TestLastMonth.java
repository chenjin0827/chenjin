package com.chenjin.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestLastMonth {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse("2019-03-31");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,-1);
        Date time = calendar.getTime();
        String format = simpleDateFormat.format(time);
        System.out.println("format====="+format);
    }
}