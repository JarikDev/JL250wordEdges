package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // \b \bword\b \B \w \W
        // \b\w+\b
        Pattern p = Pattern.compile("\\bis\\b");
        //   Pattern p = Pattern.compile("\\bis+.*");
        Matcher m = p.matcher("This island is beautiful");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }
}
