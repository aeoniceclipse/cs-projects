public class DiscreteDistribution {
	public static void main(String[] args) {
		int in;
		int[] a = new int[args.length];
		int[] s = new int[args.length];
		int it;
		int m = Integer.parseInt(args[0]);

		a[0] = 0;
		s[0] = 0;
		for (in = 1; in < args.length; in ++) {
			a[in] = Integer.parseInt(args[in]);
			s[in] = a[in] + s[in - 1];
		}

		for (it = 1; it <= m; it ++) {
			int r = (int) (Math.random() * (s[s.length - 1] - 1));
			
			for (in = 1; in < s.length; in ++) {
				if (r >= s[in - 1] && r < s[in]) {
					System.out.print(in + " ");
				}
			}

			if (it % 25 == 0) {
				System.out.println();
			}
		}

			System.out.println();
	}
}