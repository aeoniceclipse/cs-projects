public class data_types {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int sum = a + b;
		int sub = a - b;
		int mlt = a * b;
		int div = a / b;
		int rem = a % b;

		String c = args[2];
		String d = args[3];

		System.out.println("The addition is " + sum);
		System.out.println("The subtraction iss " + sub);
		System.out.println("The multiplcation is " + mlt);
		System.out.println("The division is " + div);
		System.out.println("The remainder is " + rem);

		System.out.println(c + " " + d);

		if ((a < 0) || (b < 0)) {
			System.out.println("Negative input");
		}
	}
}