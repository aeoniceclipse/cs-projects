public class Minesweeper {
	public static void main(String[] args) {
		int it = 0;
		int ix;
		int x = Integer.parseInt(args[0]);
		int iy;
		int y = Integer.parseInt(args[1]);
		int[][] xy = new int[x + 2][y + 2];
		int m = Integer.parseInt(args[2]);
		boolean[][] r = new boolean[x + 2][y + 2];

		do {
			int rx = (int) ((Math.random() * x) + 1);
			int ry = (int) ((Math.random() * y) + 1);

			if (!r[rx][ry]) {
				r[rx][ry] = true;
				xy[rx][ry] = 10;
				it ++;
			} else continue;
		} while (it < m);

		for (iy = 1; iy <= y; iy ++) {
			for (ix = 1; ix <= x; ix ++) {
				if (xy[ix][iy] == 10) {
					continue;
				}
				if (xy[ix - 1][iy - 1] == 10) {
					xy[ix][iy] ++;
				}
				if (xy[ix - 1][iy] == 10) {
					xy[ix][iy] ++;
				}
				if (xy[ix - 1][iy + 1] == 10) {
					xy[ix][iy] ++;
				}
				if (xy[ix][iy - 1] == 10) {
					xy[ix][iy] ++;
				}
				if (xy[ix][iy + 1] == 10) {
					xy[ix][iy] ++;
				}
				if (xy[ix + 1][iy - 1] == 10) {
					xy[ix][iy] ++;
				}
				if (xy[ix + 1][iy] == 10) {
					xy[ix][iy] ++;
				}
				if (xy[ix + 1][iy + 1] == 10) {
					xy[ix][iy] ++;
				}
			}
		}

		for (iy = 1; iy <= y; iy ++) {
			for (ix = 1; ix <= x; ix ++) {
				if (xy[ix][iy] == 10) {
					System.out.print("*  ");
				} else System.out.print(xy[ix][iy] + "  ");
			}
			System.out.println();
		}
	}
}