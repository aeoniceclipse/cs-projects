public class RandomWalker {
	public static void main(String[] args) {
		int i = 0;
		int r = Math.abs(Integer.parseInt(args[0]));
		int x = 0;
		int y = 0;
		int s = 0;

		System.out.println(x + ", " + y);
		while (i != r) {
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
			i = (Math.abs(x) + Math.abs(y));
			s ++;
			System.out.println(x + ", " + y);
		}

		System.out.println("steps = " + s);
	}
}