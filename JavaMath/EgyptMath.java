package JavaBeginners;

import java.util.Scanner;

class EgyptMath {

    public static int EgyptSum(int n, int m) {
        int sum = 0;
        if (n % 2 != 0)
            sum = sum + m;
        while (n != 1) {
            n = n / 2;
            m = m * 2;
            if (n % 2 != 0)
                sum = sum + m;
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.print("Enter a number: ");
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        System.out.print("Enter a 2nd number: ");
        Scanner myObj1 = new Scanner(System.in);
        int m = myObj1.nextInt();
        System.out.println(EgyptSum(n, m));
    }

}