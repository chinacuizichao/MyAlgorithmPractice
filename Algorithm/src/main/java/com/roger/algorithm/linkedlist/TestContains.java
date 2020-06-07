package com.roger.algorithm.linkedlist;

import java.util.LinkedList;
import java.util.List;

import jdk.nashorn.internal.parser.JSONParser;

public class TestContains {

    public static void main(String[] args) {
//        List<String> list = new LinkedList<>();
//        list.add("AAA");
//        list.add("BBB");
//        list.add("CCC");
//        list.add("DDD");
//
//        System.out.println(list.contains("A"));

//        String content = "\"{\\\"accessToken\\\":\\\"2.003135514c480552922098787d0bc3f4f3\\\",\\\"appName\\\":\\\"贝壳找房\\\",\\\"appVersion\\\":\\\"2.31.0\\\",\\\"deviceId\\\":\\\"822713ef3d8b6271\\\",\\\"deviceInfo\\\":{\\\"duid\\\":\\\"DuwTLstkVX8/TUcWQcG1KHfjHxLfNgf/9WPZ91T0S6qBHEmXED8GnTrR6/hqI+jvU9bsuQe8Age3N8kcJnj/+iVQ\\\",\\\"ssid\\\":\\\"5f1e0b36-5b01-4b7a-b67f-b48507b9179f\\\",\\\"udid\\\":\\\"822713ef3d8b6271\\\",\\\"uuid\\\":\\\"e5ee77b4-89f5-4abf-a531-f993ad6659cc\\\"},\\\"extraData\\\":{\\\"cityId\\\":\\\"110000\\\",\\\"cityName\\\":\\\"北京\\\",\\\"latitude\\\":\\\"39.897677\\\",\\\"locationCityId\\\":\\\"110000\\\",\\\"locationCityName\\\":\\\"北京\\\",\\\"longitude\\\":\\\"116.424883\\\",\\\"wifiName\\\":\\\"%F0%9F%87%A8%F0%9F%87%B3\\\"},\\\"network\\\":\\\"WIFI\\\",\\\"scheme\\\":\\\"lianjiabeike\\\",\\\"sysModel\\\":\\\"android\\\",\\\"sysVersion\\\":\\\"Android 10\\\",\\\"userInfo\\\":{\\\"userId\\\":\\\"2000000010055218\\\",\\\"userName\\\":\\\"13****08\\\"}}\";";
        String content = "{\"accessToken\":\"2.000cfebc431e141d921d5702f04474bb1f\",\"appVersion\":\"4.6.5\",\"deviceId\":\"\",\"extraData\":{\"cityAbbr\":\"tj\",\"cityId\":\"120000\"},\"network\":\"WIFI\",\"scheme\":\"lianjiaatom\",\"sysModel\":\"SM-N9600\",\"sysVersion\":\"10\",\"userInfo\":{\"agentId\":\"2100419519\",\"nickName\":\"小刘\",\"phoneNumber\":\"\",\"userId\":\"1000002100419519\",\"userName\":\"\"}}";

        content = content.replaceAll("\\\\", "");

        String[] split = content.split(",");


        for (String s : split) {
            if (s.contains("deviceId")) {
                String[] strings = s.split(":");
                String s1 = strings[1].replaceAll("[\\p{P}\\p{Punct}]","");
                System.out.println(s1);
                System.out.println(s1 == null);
            }
        }
    }

    public static String deleteCharString0(String sourceString, char chElemData) {
        String deleteString = "";
        for (int i = 0; i < sourceString.length(); i++) {
            if (sourceString.charAt(i) != chElemData) {
                deleteString += sourceString.charAt(i);
            }
        }
        return deleteString;
    }
}
