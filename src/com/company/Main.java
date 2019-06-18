package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the type of product received: ");
        String productType = scan.nextLine();
        System.out.println("Please enter the cost to us for each " + productType + ":");
        int Cost = scan.nextInt();
        System.out.println("Please enter the brand of the product: ");
        String brandName = scan.next();
        System.out.println("Please enter the number of " + productType + " in shipment: ");
        int numberofproductinShipment = scan.nextInt();
        int totalcostofShipment = Cost * numberofproductinShipment /10;

        System.out.println("Shipment Summary: ");
        System.out.println("The new product is: " + productType);
        System.out.println("The shipment included: " + numberofproductinShipment + " from " + brandName);
        System.out.println("The total value of shipment was: ");
        System.out.println("With GST: " + Math.round(totalcostofShipment * 1.05f));






    }
}
