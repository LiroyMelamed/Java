import java.util.ArrayList;

public class PrimeDivide {

 public static int[] primeDividers(int n){
   ArrayList<Integer> help = new ArrayList<>();
  for (int i = 0; i <= n; i++) {
   if (IsPrime(i)){
    while(n%i == 0){
     n = n/i;
     help.add(i);
    }
   }
  }
  int [] dividers = new int [help.size()];
  for (int j = 0; j < dividers.length; j++) {
   dividers[j] = help.get(j).intValue();
  }
  return dividers;
  }
 
 public static boolean IsPrime(int num) {
  boolean Prime = true;
  if (num <= 1)
   return false;
  if (num == 2 || num == 3)
   return true;
  if (num % 2 == 0 || num % 3 == 0)
   return false;
  for (int i = 5; i <= Math.sqrt(num); i = i + 6) {
   if (num % i == 0 || num % (i + 2) == 0)
    return false;
  }
  return Prime;
 }

 public static void main(String[] args) {
  int [] a = primeDividers(72);
  for (int i = 0; i < a.length; i++) {
    System.out.print(a[i]+ " ");
  }
 }
 
}
