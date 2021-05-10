package JavaBeginners;

import java.util.Scanner;

class GeussNumber {
 public static void geussNumber(int N) {
  boolean c = true;
  int max = 100;
  int min = 0;
  int number = 50;
  int MC = 1;
  while (c) {
   System.out.println(number);
   System.out.println("Is it your number?");
   System.out.println("1)Yes");
   System.out.println("2)My number is bigger");
   System.out.println("3)My number is smaller");
   Scanner myObj = new Scanner(System.in);
   int n = myObj.nextInt();
   if (n == 1) {
    c = false;
    System.out.println("Win!");
    System.out.println(MC);
   }
   if (n == 2) {
    min=number;
    number = (max + min)/2;
    MC++;
   }
   if (n == 3) {
    max = number;
    number = (max + min) / 2;
    MC++;
   }
  }

 }

 public static void main(String[] args) {
  System.out.println("Do you want us to guess a number between 1-100?");
  System.out.println("1)Yes");
  System.out.println("2)No");
  Scanner myObj = new Scanner(System.in);
  int n = myObj.nextInt();
  if (n == 1) {
   geussNumber(1000);
  }
  if (n == 2) {
   System.out.println("Your lost");
  }
  }

 }