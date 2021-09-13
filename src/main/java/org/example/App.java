/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many people? ");
        String str1 = sc.nextLine();
        System.out.print("How many pizzas do you have? ");
        String str2 = sc.nextLine();
        System.out.print("How many slices per pizza? ");
        String str3 = sc.nextLine();
        int n1 = Integer.parseInt(str1);
        int n2 = Integer.parseInt(str2);
        int n3 = Integer.parseInt(str3);
        int n4 = n2*n3;
        int n5 = n4/n1;
        int n6 = n4%n1;
        System.out.printf("%d people with %d pizzas (%d slices)\n",n1,n2,n4);
        System.out.printf("Each person gets %d pieces of pizza.\n",n5);
        System.out.printf("There are %d left over pieces.",n6);
    }
}
