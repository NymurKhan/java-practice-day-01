package com.newproject;

public class multiple_if_else {
    public static void main(String[] args) {
       //multiple if else statement
        int f = 300;
        if (f > 300) {
            f += f + 300;
        } else if (f > 500){
            f = 300 - 100;
        }
        else {
            f = 300 - 200;
        }

        System.out.println(f);
    }
}
