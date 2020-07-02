public class Birthday_old {
	public static void main(String[] args) {
		int it = 0;
		int count = 1;
		int days = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);
		int matched[] = new int[(trials * days)];
		double frac[] = new double[(trials * days)];

		while (frac[count] < 0.5) {
			matched[count] += matched[count - 1];

			for (it = 0; it < trials; it ++) {
				boolean entered[] = new boolean[(trials * days)];
				int r = (int) (Math.random() * (days - 1));

				if (entered[r]) {
					matched[count] ++;
					continue;
				} else entered[r] = true;
			}
			
			frac[count] = (matched[count] + (frac[count - 1] * trials)) / trials;
			count ++;
		}

		for (it = 0; it <= count; it ++) {
			System.out.println((it + 1) + "	" + matched[it] + "	" + frac[it]);
		}
	}
}