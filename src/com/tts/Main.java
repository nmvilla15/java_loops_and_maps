package com.tts;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        System.out.println("Hi! I'm going to ask you to please enter 5 random numbers.Please hit enter after you type each number");

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> myArrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int myNum = scan.nextInt();
            myArrayList.add(myNum);
        }
        //the sum
        int sum = 0;
        for (int num : myArrayList) {
            sum = sum + num;
        }
        System.out.println("Your sum is: " + sum);


        //the product of list
        int product = 1;
        for (int num : myArrayList) {
            product *= num;
        }
        System.out.println("The product of your list is: " + product);


        //the largest number on list
        int max = Integer.MIN_VALUE;
        for (int num : myArrayList) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Your largest number is: " + max);


        //the smallest number on list
        int min = Integer.MAX_VALUE;
        for (int num : myArrayList) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Your smallest number: " + min);

    }
}

