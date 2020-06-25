public class RandomWalkers {
	public static void main(String[] args) {
		int ed = Math.abs(Integer.parseInt(args[0]));
		int et = Math.abs(Integer.parseInt(args[1]));
		int s = 0;

		for (int it = 0; it < et; it ++) {
			int id = 0;
			int x = 0;
			int y = 0;
			
			while (id != ed) {
				double d = Math.random();
				if (d < .25) {
					y ++;
				} else if (d >= .25 && d < .5) {
					x ++;
				} else if (d >= .5 && d < .75) {
					y --;
				} else if (d >= .75) {
					x --;
				}
				s ++;
				id = (Math.abs(x) + Math.abs(y));
			}
		}

		double sa = (double) s / et;
		System.out.println("average number of steps = " + sa);
	}
}