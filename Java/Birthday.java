public class Birthday {
	public static void main(String[] args) {
		int it;
		int r;
		int trial;
		int days = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);
		int matched[] = new int[trials + 1];
		double frac[] = new double[trials + 1];

		for (trial = 1; trial <= trials; trial ++) {
			boolean entered[] = new boolean[days];
			for (it = 1; it < trials; it ++) {
				r = (int) (Math.random() * (days - 1));
				if (entered[r]) {
					matched[it] ++;
					break;
				} else entered[r] = true;
			}
		}

		for (it = 1; it <= trials; it ++) {
			frac[it] = (matched[it] + (frac[it - 1] * trials)) / trials;
			System.out.println(it + "	" + matched[it] + "	" + frac[it]);
			if (frac[it] >= 0.5) {
				break;
			}
		}
	}
}