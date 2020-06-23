public class rng_sort {
	public static void main(String[] args) {
		int mlt = Integer.parseInt(args[0]);
		int a = (int) Math.round(Math.random() * mlt);
		int b = (int) Math.round(Math.random() * mlt);
		int c = (int) Math.round(Math.random() * mlt);
		int d = (int) Math.round(Math.random() * mlt);
		int e = (int) Math.round(Math.random() * mlt);

		System.out.println("The numbers are: " + a + " " + b + " " + c + " " + d + " " + e);

		int min = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
		int avg = (a + b + c + d + e) / 5;
		int rem = (a + b + c + d + e) % 5;
		int max = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);

		System.out.println("The min is: " + min + ", the avg is: " + avg + "r" + rem + ", the max is: " + max);
	}
}