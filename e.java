package com.company;
import java.util.Scanner;

public class practices {
    public static void main(String [] args){
        //1
        int a= 2;
        int b = 3;
        int c = 5;
        int sum = a+b+c;
        System.out.print("The sum is: ");
        System.out.println(sum);
        //2
        int eng = 89;
        int maths = 100;
        int science = 94;
        int cgpa = eng+maths+science/3;
        System.out.print("CGPA is: ");
        System.out.println(cgpa);
        //3
        Scanner x = new Scanner(System.in);
        System.out.println("What is your name?");
        String str = x.nextLine();
        System.out.print("Hello ");
        System.out.print(str);
        System.out.println(" ,have a good day");
        //4
        System.out.println("Enter your value(in km)");
        float km = x . nextInt();
        float y =  km * 0.62f;
        System.out.print(y);
        System.out.println(" mi");
        //5
        System.out.println("Enter the number");
        boolean b1 = x.hasNextInt();
        System.out.println(b1);

    }
}
