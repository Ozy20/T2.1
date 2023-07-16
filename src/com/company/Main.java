package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("Enter a degree in Celsius:");
     double Celsius=input.nextDouble();
     double Fahrenheit=(9/5)*Celsius+32;
     System.out.print(Celsius+" in celsius is "+Fahrenheit+" in fahrenheit");
    }
}
