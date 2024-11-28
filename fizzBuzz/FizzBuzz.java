package FuzzBuzz.fizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = number.nextInt();

        if(num % 5 == 0 && num % 3 == 0)
            System.out.println("FizzBuzz");
        else if(num % 5 == 0) 
            System.out.println("Fizz");
        else if(num % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(num);

        }
}