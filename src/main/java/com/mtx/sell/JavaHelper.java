package com.mtx.sell;

import java.util.Date;

public class JavaHelper {

//    private static long  startDate = 1528675200000L;

    public static void main(String[] args){
//        dateAdd(startDate);
//        System.out.println(testStringFormat("test/{%s}", "123"));
//            Integer a = 1;
//            a = null;
//            System.out.println(a+"");
//            System.out.println(a.toString());

          Test test = new Test();
          if(test.getOnLine() != null){
                System.out.println("test");
          }
    }





    public static long dateAdd(long startDate){
        java.util.Calendar Cal=java.util.Calendar.getInstance();
        Date formateDate = new Date(startDate);
        Cal.setTime(formateDate);
        System.out.println(Cal.getTime());
        Cal.add(java.util.Calendar.HOUR_OF_DAY,+ 24);
        System.out.println(Cal.getTime());
        return Cal.getTimeInMillis();
    }

    public static String  testStringFormat(String format, String value){
        return String.format(format, value);
    }



}
