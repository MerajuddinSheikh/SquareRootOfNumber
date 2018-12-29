package squareroot;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {

        // Taking User Input

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        double num = scan.nextDouble();

        //Using Math method with Square Root

        double num2 = Math.sqrt(num);
        System.out.println("entered number is " + num);
        System.out.println(" Square Root of that Number is " + num2);


    }
}
