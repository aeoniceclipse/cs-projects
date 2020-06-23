public class conversion {
	public static void main(String[] args) {
		Double a = Double.parseDouble(args[0]);
		Double b = Math.random();
		int c = (int) Math.round(a * b);
		
		System.out.println(c);
	}
}