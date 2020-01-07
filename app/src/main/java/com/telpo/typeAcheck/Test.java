package com.telpo.typeAcheck;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        //System.out.println(Arrays.toString(unsigned_short_2byte(137)));

        byte a = (byte)234;
        System.out.println(a);
        int i = a&0xff;
        System.out.println(i);

    }

    // short整型转为byte类型的数组
    public static byte[] unsigned_short_2byte(int length) {

        byte[] targets = new byte[2];
        for (int i = 0; i < 2; i++) {
            int offset = (targets.length - 1 - i) * 8;
            targets[i] = (byte) ((length >>> offset) & 0xff);
        }
        return targets;
    }
}
