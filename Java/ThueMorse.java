public class ThueMorse {
	public static void main(String[] args) {
		int it = 0;
		int ix = 0;
		int iy = 0;
		int xy = Integer.parseInt(args[0]);
		int x = 1;
		int y = 1;
		boolean[][] tm = new boolean[xy + 1][xy + 1];

		do {
			if (ix >= (int) Math.pow(2, it)) {
				ix = 0;
				it ++;
				continue;
			}
			tm[x][0] = !tm[ix][0];
			ix ++;
			x ++;			
		} while (x < xy);

		it = 0;
		do {
			if (iy >= (int) Math.pow(2, it)) {
				iy = 0;
				it ++;
				continue;
			}
			for (x = 0; x < xy; x ++) {
				tm[x][y] = !tm[x][iy];
			}
			iy ++;
			y ++;			
		} while (y < xy);

		for (y = 0; y < xy; y ++) {
			for (x = 0; x < xy; x ++) {
				if (tm[x][y]) {
					System.out.print("-  ");
				} else System.out.print("+  ");
			}
			System.out.println();
		}
	}
}