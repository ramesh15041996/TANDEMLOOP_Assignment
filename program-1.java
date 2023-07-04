import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {

    String operation;
    Double a, b, result;

    // create an object of Scanner class
    Scanner sc = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Enter a operation");//Enter the input in this format(addit)
    operation = sc.nextLine(); 
    // ask users to enter numbers
    System.out.println("Enter first number");
    a = sc.nextDouble();

    System.out.println("Enter second number");
    b = sc.nextDouble();
     

    switch (operation.toUpperCase()) {
         
      // performs addition between numbers
      case "ADDITION":
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        break;

      // performs subtraction between numbers
      case "SUBTRACTION":
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        break;

      // performs multiplication between numbers
      case "ULTIPLICATION":
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        break;

      // performs division between numbers
      case "DIVISION":
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        break;

      default:
        System.out.println("Invalid operation selected or entered");
        break;
    }
  }
}