package com.leetcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        LongestSubstring ls = new LongestSubstring();
        System.out.println(ls.lengthOfLongestSubstring(s));

    }
}
