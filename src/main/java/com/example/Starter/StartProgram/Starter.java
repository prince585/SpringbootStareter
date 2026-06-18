package com.example.Starter.StartProgram;

import com.example.Starter.OrderDetails.CategoryOne;
import com.example.Starter.OrderDetails.CategoryTwo;
import com.example.Starter.OrderDetails.OrderDetails;

import java.util.Objects;
import java.util.Scanner;

public class Starter {
    public void start(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Currently We Have Two Categories For Food Order :");
        System.out.println("1. Fast Food \n 2. Vegan Food");
        System.out.println("Select Any One :");
        System.out.println("One for Fast Food \n Two For Healthy Food");
        String choice = sc.next();

        if(Objects.equals(choice, "one")) {
            OrderDetails ordering = new CategoryOne();
            ordering.OrderInfo();
        } else if (Objects.equals(choice, "Two") {
            OrderDetails ordering = new CategoryTwo();
            ordering.OrderInfo();
        }
    }
}
