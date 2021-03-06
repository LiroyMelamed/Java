
import java.util.Arrays;
import java.util.Scanner;

public class TwinPrimes {

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

    public static void DualPrime(int num) {
        for (int i = 3; i < num; i++) {
            if (IsPrime(i) && IsPrime(i + 2)) {
                int[] Dual = { i, i + 2 };
                System.out.println(Arrays.toString(Dual));

            }
        }
    }

    public static void DualPrimeGape(int n, int m) {
        for (int i = 3; i < n; i++) {
            if (IsPrime(i) && IsPrime(i + m)) {
                int[] Dual = { i, i + m };
                System.out.println(Arrays.toString(Dual));
            }
        }
    }

    public static void main(String args[]) {
        System.out.print("Enter a number: ");
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        System.out.println("My number is Prime?");
        if (IsPrime(num))
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("All the DualPrime numbers are:");
        DualPrime(num);

        System.out.print("Enter a number: ");
        Scanner myObj1 = new Scanner(System.in);
        int n = myObj1.nextInt();
        System.out.print("Enter a gape: ");
        Scanner myObj2 = new Scanner(System.in);
        int m = myObj2.nextInt();
        System.out.print("Your numbers are: ");

    }
}