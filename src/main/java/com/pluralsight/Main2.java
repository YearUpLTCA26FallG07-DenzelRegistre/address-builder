package com.pluralsight;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");
        System.out.println("Full Name : ");
        String fullName = scanner.nextLine();


        System.out.println("Billing Street : ");
        String bstreet = scanner.nextLine();
        System.out.println("Billing City : ");
        String bcity = scanner.nextLine();
        System.out.println("Billing State : ");
        String bstate = scanner.nextLine();
        System.out.println("Billing Zip : ");
        String bzip = scanner.nextLine();




        System.out.println("Shipping Street : ");
        String sStreet = scanner.nextLine();
        System.out.println("Shipping City : ");
        String sCity = scanner.nextLine();
        System.out.println("Shipping State : ");
        String sState = scanner.nextLine();
        System.out.println("Shipping Zip : ");
        String sZip = scanner.nextLine();

        System.out.println(fullName);
        System.out.println(bstreet);
        System.out.println(bcity + bstate + bzip );

        System.out.println(sStreet);
        System.out.println(sCity + sState + sZip);






        scanner.close();
    }
}

