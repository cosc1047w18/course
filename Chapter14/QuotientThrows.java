package javaapplication;

import java.util.Scanner; 

public class QuotientThrows {
    
  public static int quotient(int number1, int number2) {
    if (number2 == 0)
      throw new ArithmeticException("Divisor cannot be zero");
    return number1 / number2;
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter two integers
    System.out.print("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    
    System.out.println(quotient(number1, number2));
  }
}

