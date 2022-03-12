package com.newproject;

import java.util.Scanner;

public class larger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        int max = c;
//        if(c > max){
//            max = c;
//        }
//        if(a > max){
//            max = a;
//        }
//        System.out.println(max);
        int max = Math.max(a, Math.max(c, b));
        System.out.println(max);
    }
    }

