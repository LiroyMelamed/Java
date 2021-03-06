
class Parabola {

	public static void Para(double a, double b, double c){
		if (b * b < 4 * a * c) {
			System.out.println(a + "X^2" + b + "X" + c + "= 0");
			System.out.println("Error, no real answers");
		} else if (b * b == 4 * a * c) {
			double x = -b / (2 * a);
			System.out.println(a + "X^2" + b + "X" + c + "= 0");
			System.out.println("X = " + x);
		} else {
			double q = Math.sqrt(b * b - 4 * a * c);
			double x1 = (-b + q) / (2 * a);
			double x2 = (-b - q) / (2 * a);
			System.out.println(a + "X^2" + b + "X" + c + "= 0");
			System.out.println("X1 = " + x1);
			System.out.println("X2 = " + x2);
		}
	}

	public static void main(String[] args) {
		System.out.println("0) Exit\n1) Try again ");
		int menu = MyConsole.readInt("What is your choice:  ");
		while (menu == 1) {
			System.out.println("aX^2 + bX + c = 0");
			double a = MyConsole.readDouble("Please enter a= ");
			double b = MyConsole.readDouble("Please enter b= ");
			double c = MyConsole.readDouble("Please enter c= ");
			Para(a, b, c);
		}
	}
}