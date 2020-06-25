public class BandMatrix {
	public static void main(String[] args) {
		int n = Math.abs(Integer.parseInt(args[0]));
		int width = Math.abs(Integer.parseInt(args[1]));
		int x;
		int y;

		for (y = 0; y < n; y ++) {
			for (x = 0; x < n; x ++) {
				if (x == y || x <= y + width && x >= y - width) {
					System.out.print("*");
				} else System.out.print("0");
				System.out.print("  ");
			}
		System.out.println();
		}
	}
}