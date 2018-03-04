package com.apach;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;

public class MainApach {
    public static void main(String[] args) {
        String stringExample0 = "Using ";
        stringExample0 += "String ";
        stringExample0 += "Utils:";
        System.out.println(stringExample0);

        //stringUtils
        String stringUtils1 = "elloH";
        String stringUtils2 = StringUtils.rotate(stringUtils1,1);
        System.out.println(stringUtils2);

        String stringUtils3 = StringUtils.getDigits("sadfKM6asdf98237kjdf9sadf#");
        System.out.println(stringUtils3);

        //RandomStringUtils
        String stringRandom1 = RandomStringUtils.randomAlphabetic(7) ;
        System.out.println("Using Random String Utils: \n" + stringRandom1);

        //RandomUtils
        int randomUtils1 = RandomUtils.nextInt();
        int randomUtils2 = RandomUtils.nextInt();
        System.out.println("Using Random Utils: \n 1: " + randomUtils1 + "\n 2: " +randomUtils2);

        //StringEscapeUtils
        System.out.println(StringEscapeUtils.escapeJava("Using StringEscapeUtils: \n 1: " + randomUtils1 + "\n 2: " +randomUtils2));

    }
}
