/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_4;

import static java.lang.Math.abs;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import static java.lang.Math.toRadians;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MathApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        {
            System.out.println("Java Loop Laboratory Activity 5 \n\nof \n\nMarcelo Jr L. Depalubos\n\nPlease input a number to start.\n");

            int choice;

            do {
                System.out.println("\n==Math App Menu==");
                System.out.println("1. Addition of two numbers.");
                System.out.println("2. Subtraction of three numbers.");
                System.out.println("3. Multiplication of two numbers.");
                System.out.println("4. Division of two numbers.");
                System.out.println("5. The Factorial of an Integer.");
                System.out.println("6. The Odds and Evens of within an Integer.");
                System.out.println("7. The reverse of an Integer.");
                System.out.println("8. Converting Degrees to Radian");
                System.out.println("9. Close");
                System.out.println("\nPlease input a number to choose an activity.");
                choice = input.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.println("Please input your first addend.");
                        int x = input.nextInt();
                        System.out.println("Please input your second addend.");
                        int y = input.nextInt();
                        int z = x + y;
                        System.out.println("The Sum is " + z);
                        String A = input.nextLine();
                        boolean continueProgram = true;
                        while (continueProgram) {
                            System.out.println("Do you want to run another computation?");
                            A = input.nextLine();

                            if (A.equals("yes")) {
                                System.out.println("Continuing program...");
                                continueProgram = true;
                                break;

                            } else if (A.equals("no")) {
                                System.out.println("Exiting the program.");
                                continueProgram = false;
                                System.exit(0);

                            } else {
                                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("Please input your minuend.");
                        int x = input.nextInt();
                        System.out.println("Please input your first subtrahend.");
                        int y = input.nextInt();
                        System.out.println("Please input your second subtrahend.");
                        int z = input.nextInt();
                        int xyz = x - y - z;
                        System.out.println("The Overall Differnece is " + xyz);
                        String A = input.nextLine();
                        boolean continueProgram = true;
                        while (continueProgram) {
                            System.out.println("Do you want to run another computation?");
                            A = input.nextLine();

                            if (A.equals("yes")) {
                                System.out.println("Continuing program...");
                                continueProgram = true;
                                break;

                            } else if (A.equals("no")) {
                                System.out.println("Exiting the program.");
                                continueProgram = false;
                                System.exit(0);

                            } else {
                                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("Please input your multiplicand.");
                        int x = input.nextInt();
                        System.out.println("Please input your Multiplier.");
                        int y = input.nextInt();
                        int z = x * y;
                        System.out.println("The Product is " + z);
                        String A = input.nextLine();
                        boolean continueProgram = true;
                        while (continueProgram) {
                            System.out.println("Do you want to run another computation?");
                            A = input.nextLine();

                            if (A.equals("yes")) {
                                System.out.println("Continuing program...");
                                continueProgram = true;
                                break;

                            } else if (A.equals("no")) {
                                System.out.println("Exiting the program.");
                                continueProgram = false;
                                System.exit(0);

                            } else {
                                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println("Please input your Dividend.");
                        int x = input.nextInt();
                        System.out.println("Please input your Divisor.");
                        int y = input.nextInt();
                        int z = x / y;
                        System.out.println("The Quotient is " + z);
                        String A = input.nextLine();
                        boolean continueProgram = true;
                        while (continueProgram) {
                            System.out.println("Do you want to run another computation?");
                            A = input.nextLine();

                            if (A.equals("yes")) {
                                System.out.println("Continuing program...");
                                continueProgram = true;
                                break;

                            } else if (A.equals("no")) {
                                System.out.println("Exiting the program.");
                                continueProgram = false;
                                System.exit(0);

                            } else {
                                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                            }
                        }
                    }
                    case 5 -> {
                        System.out.println("Please input a positive Integer(x).");
                        boolean validInput = false;
                        int x = input.nextInt();
                        int factorial = 1;

                        do {
                            if (x >= 0) {

                                validInput = true;

                            } else {
                                System.out.println("Invalid Input.");break;
                            }

                            for (int i = 1; i <= x; i++) {
                                factorial = factorial * i;
                            }
                            System.out.println("Factorial " + factorial);

                            String A = input.nextLine();
                            boolean continueProgram = true;
                            while (continueProgram) {
                                System.out.println("Do you want to run another computation?");
                                A = input.nextLine();

                                if (A.equals("yes")) {
                                    System.out.println("Continuing program...");
                                    continueProgram = true;
                                    break;

                                } else if (A.equals("no")) {
                                    System.out.println("Exiting the program.");
                                    continueProgram = false;
                                    System.exit(0);

                                } else {
                                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                                }
                            }

                        } while (!validInput);
                    }

                    case 6 -> {
                        System.out.println("Please input an Integer.");
                        int Integer = input.nextInt();

                        System.out.println("Even numbers: ");
                        for (int i = 0; i <= Integer; i += 2) {
                            System.out.println(i);
                        }
                        System.out.println("Odd numbers: ");
                        for (int i = 1; i <= Integer; i += 2) {
                            System.out.println(i);
                        }
                        String A = input.nextLine();
                        boolean continueProgram = true;
                        while (continueProgram) {
                            System.out.println("Do you want to run another computation?");
                            A = input.nextLine();

                            if (A.equals("yes")) {
                                System.out.println("Continuing program...");
                                continueProgram = true;
                                break;

                            } else if (A.equals("no")) {
                                System.out.println("Exiting the program.");
                                continueProgram = false;
                                System.exit(0);

                            } else {
                                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                            }
                        }

                    }
                    case 7 -> {
                        int Numberreversi = 0;
                        System.out.println("Please input an Integer");
                        int Integer = input.nextInt();

                        System.out.println("Reversed of the Integer: ");
                        for (int i = Integer; i != 0; i /= 10) {
                            int digit = i % 10;
                            Numberreversi = Numberreversi * 10 + digit;
                        }
                        System.out.println(Numberreversi);

                        String A = input.nextLine();
                        boolean continueProgram = true;
                        while (continueProgram) {
                            System.out.println("Do you want to run another computation?");
                            A = input.nextLine();

                            if (A.equals("yes")) {
                                System.out.println("Continuing program...");
                                continueProgram = true;
                                break;

                            } else if (A.equals("no")) {
                                System.out.println("Exiting the program.");
                                continueProgram = false;
                                System.exit(0);

                            } else {
                                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                            }
                        }
                    }
                    case 8 -> {
                        System.out.println("Enter angle in Degrees: ");
                        double deg = input.nextDouble();
                        double rad = toRadians(deg);

                        System.out.println("Choose a function");
                        System.out.println("1. Sine n/ 2. Cosine /n 3. Tangent /n 4. All");
                        int ch = input.nextInt();

                        if (ch == 1 || ch == 4) {
                            System.out.printf("sin(%.2f deg) = %.4f%n", deg, sin(rad));
                        }
                        if (ch == 2 || ch == 4) {
                            System.out.printf("cos(%.2f deg) = %.4f%n", deg, cos(rad));
                        }
                        if (ch == 3 || ch == 4) {
                            if (abs(cos(rad)) < 1e-10) {
                                System.out.println("tan unidentified at this angle.");
                            } else {
                                System.out.printf("tan(%.2f deg) = %.4f%n", deg, tan(rad));
                            }
                        }
                        String A = input.nextLine();
                        boolean continueProgram = true;
                        while (continueProgram) {
                            System.out.println("Do you want to run another computation?");
                            A = input.nextLine();

                            if (A.equals("yes")) {
                                System.out.println("Continuing program...");
                                continueProgram = true;
                                break;

                            } else if (A.equals("no")) {
                                System.out.println("Exiting the program.");
                                continueProgram = false;
                                System.exit(0);

                            } else {
                                System.out.println("Invalid input. Please enter 'yes' or 'no'.");

                            }

                        }
                    }
                    case 9 -> {
                        System.out.println("Thank You And Goodbye.");
                        System.exit(0);
                    }
                    default ->
                        System.out.println("\nInvalid Choice");
                }

            } while (choice != 0);

        }
    }

}
