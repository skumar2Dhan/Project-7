/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistlab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class ArrayListLab {

    public static void reverse(ArrayList<Integer> List) {
        int temp = 0;
        int n = 0, f = 0, s = 0;
        for (int i = 0; i < List.size()/2; i++) {
            //n=List.size()-1;
            //s=n-i;
            //f=List.get(s);
            //List.add(i,f);
            //List.add(i, List.get(List.size() - 1 ));

            temp = List.get(i);
            f=List.get(List.size()-1-i);
            List.set(i,f);
            List.set(9-i,temp);
        }
        //List.removeRange(10,20);

    }

    public static double mean(ArrayList<Integer> List) {
        double total = 0;

        for (int i = 0; i < List.size(); i++) {
            int currentNum = List.get(i);
            total += currentNum;
        }
        return total / List.size();
    }

    public static double StandardDeviation(ArrayList<Integer> List) {
        double mean = mean(List);
        double temp = 0;
        for (int i = 0; i < List.size(); i++) {
            
            temp += Math.pow((List.get(i) - mean), 2);
        }

        return Math.sqrt(temp/9);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(10);
        System.out.println("Please Enter 10 Integers of Choice: ");
        Scanner Key = new Scanner(System.in);
        int n = 0;

        for (int i = 0; i < 10; i++) {
            list.add(Key.nextInt());
        }
        System.out.println("The contents of ArrayList are: ");

        for (Integer y : list) {
            System.out.print(y + ",");
        }

        System.out.println();
        System.out.println("The mean is: " + mean(list));
        System.out.println("The Standard Deviation is: " + StandardDeviation(list));

        
        
        
        System.out.println();
        reverse(list);
        System.out.println("Here is the reversed array: ");
        for (Integer z : list) {
            System.out.print(z + ",");
        }
        //for (Integer z : list) {
            //System.out.print(z + ",");
        //}
        System.out.println();

    }

}
