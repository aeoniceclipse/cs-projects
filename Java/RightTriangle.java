public class RightTriangle {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		boolean tri;

		tri = (a >= 0) && (b >= 0) && (c >= 0);
		tri = tri && ((a * a) + (b * b) == (c * c));
		tri = tri || ((a * a) + (c * c) == (b * b));
		tri = tri || ((b * b) + (c * c) == (a * a));

		System.out.println(tri);
	}
}