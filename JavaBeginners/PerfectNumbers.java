import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumbers {
 
 public static boolean isPerfect(int n){
  int sum = 0;
  for (int i = 1; i < n; i++) {
   if(n%i == 0){
    sum+=i;
   }
  }
  if(sum==n) return true;
  else return false;
 }

 public static int[] perfectNumbers(int p){
  ArrayList<Integer> help = new ArrayList<>();
   for (int i = 1; i < p; i++) {
    if (isPerfect(i)) {
     help.add(i);
    }
   }
   int[] PerfectNumbers = new int[help.size()];
   for (int i = 0; i < PerfectNumbers.length; i++) {
    PerfectNumbers[i] = help.get(i).intValue();
   }
   return PerfectNumbers;
  }

 public static void main(String[] args) {
  System.out.print("Enter a number: ");
  Scanner myObj = new Scanner(System.in);
  int n = myObj.nextInt();
  System.out.println(isPerfect(n));
  int [] a = perfectNumbers(n);
  for (int i = 0; i < a.length; i++) {
   System.out.print(a[i]+ " ");
  }

 }
}
