package com.kholood;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {
            int counter, num, target, arr[];

            Scanner input = new Scanner(System.in);
            System.out.println("Enter number of elements:");
            num = input.nextInt();

            arr = new int[num];
            System.out.println("Enter " + num + " integers");

            for (counter = 0; counter < num; counter++)
                arr[counter] = input.nextInt();

            System.out.println("Enter the search value:");
            target = input.nextInt();

            for (counter = 0; counter < num; counter++)
            {
                if (arr[counter] == target)
                {
                    System.out.println(target+" is present at location "+(counter+1));

                    break;
                }
            }
            if (counter == num)
                System.out.println(target+ " doesn't exist in array.");
        }
    }
}
