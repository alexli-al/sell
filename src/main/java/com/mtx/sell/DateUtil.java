package com.mtx.sell;

import java.util.Date;

public class DateUtil {

    public static void main(String[] args){
        dateAdd(startDate);
    }

    private static long  startDate = 1528675200000L;

    public static long dateAdd(long startDate){
        java.util.Calendar Cal=java.util.Calendar.getInstance();
        Date formateDate = new Date(startDate);
        Cal.setTime(formateDate);
        System.out.println(Cal.getTime());
        Cal.add(java.util.Calendar.HOUR_OF_DAY,+ 24);
        System.out.println(Cal.getTime());
        return Cal.getTimeInMillis();
    }



}
