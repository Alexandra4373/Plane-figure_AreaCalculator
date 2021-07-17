package com.company;
import java.util.Scanner;



public class Main {



    public static double AreaOfTrapezium(double length, double height, double base){
        double area = height*(base + length)/2;
        return area;
    }

    public static void displayInstructionForTrapezium(){
        Scanner input = new Scanner(System.in);

        System.out.println("**************************************************************\n");
        System.out.println("A trapezium is a quadrilateral with one pair of sides parallel\n");
        System.out.println("The formula for calculating the area of a trapezium is given as : height*(base + length)/2");
        //prompting user to enter the height,length and base of the trapezium
        System.out.println("Enter the height:");
        double height = input.nextDouble();

        System.out.println("Enter the length:");
        double length= input.nextDouble();

        System.out.println("Enter base:");
        double base = input.nextDouble();

        System.out.println("The area for Trapezium = " + AreaOfTrapezium(length, height, base) + " meters squared");
    }




    public static double AreaOfCircle(double radius){
        final  double PI = Math.PI;
        double area = PI * Math.pow(radius, 2);
        return area;

    }

    public static double displayInstructionForCircle(){
        Scanner input = new Scanner(System.in);

        System.out.println("******************************************************************************************************\n");
        System.out.println("A circle is a round plane figure whose circumference consists of points equidistant from a fixed point\n");
        System.out.println("The formula for calculating area of a circle is given as : pi*radius*radius, where pi is a math constant ");
        //prompting user to enter the radius  of the circle

        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();
        System.out.println("The area for circle = " + AreaOfCircle(radius)+ " meters squared"  );

        double area = AreaOfCircle(radius);
        return area;




    }

    public static double AreaOfRectangle(double length, double width){
        double area = length * width;
        return area;

    }


    public static void displayInstructionForRectangle(){
        Scanner input = new Scanner(System.in);

        System.out.println("***********************************************************\n");
        //prompting user to enter the length and width of the rectangle
        System.out.println("A rectangle is a plane figure with two adjacent sides equal\n");
        System.out.println("The formula for calculating the area of a Rectangle is given as: l*w,where l is length and w is width");
        System.out.println("Please enter the length:");
        double length = input.nextDouble();
        System.out.println("Enter the width:");
        double width = input.nextDouble();
        System.out.println("The area for Rectangle  is = " + AreaOfRectangle(length, width) + " meters squared" );



    }

    public static double AreaOfSquare(double length){
        double area = length*length;
        return area;

    }

    public static void displayInstructionForSquare(){
        Scanner input = new Scanner(System.in);

        System.out.println("*********************************************************\n");
        System.out.println("A Square is a plane figure with four equal straight sides\n");
        System.out.println("The formula for calculating the area of a square is given as: length * length");
        //prompting user to enter the length of the square
        System.out.println("Enter the length of the Square");
        double length = input.nextDouble();
        System.out.println("The area for square is = " + AreaOfSquare(length) +" meters squared");
    }


    public static double AreaOfTriangle( double h, double b){
        double area = 1/2 * b* h;
        return area;

    }


    public static void displayInstructionForTriangle(){
        Scanner input = new Scanner(System.in);

        System.out.println("**************************************************************\n");
        System.out.println("A triangle is a plane figure with three sides and three angles\n");
        System.out.println("The formula for calculating the area of the triangle is given as: 1/2*b*h, where b is base and h is height");
        // prompting the user to enter the base and height of the triangle
        System.out.println("Enter the base of the triangle");
        double b = input.nextDouble();

        System.out.println("Enter the height of the triangle");
        double h = input.nextDouble();
        System.out.println("The area of the triangle  = " + AreaOfTriangle( h,  b) + " metres squared");
    }

    public static void displayMenu(){
        String[] planeFigures = new String[]{"Trapezium","Circle", "Rectangle", "Square",  "Triangle"};
        // Displaying plane figure options

        System.out.println("*******************************************************\n");
        System.out.println("Enter an options to make a choice of the plane figures ");
        for(int i =0; i< planeFigures.length; i++)
            System.out.println(i + " = " + planeFigures[i]);

        // prompting user to accept inputs
        Scanner input = new Scanner(System.in);
        System.out.println("***********************************\n");
        System.out.println("Enter a plane figure of your choice");
        int choice = input.nextInt();
        if(choice == 0){
            displayInstructionForTrapezium();
        } else if (choice == 1){
            displayInstructionForCircle();
        }
        else if (choice == 2){
            displayInstructionForRectangle();

        }
        else if (choice == 3){
            displayInstructionForSquare();
        }
        else if(choice==4){
            displayInstructionForTriangle();
        }
            else{
            System.out.println("Error");

        }




    }

    public static void main(String[] args) {
        displayMenu();
        System.out.println();

    }

}
