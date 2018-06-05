package step4;

public class Matrix_9_Snail {

	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int count = 0;

		for (int i = 0; i < 5; i++) {

			if (i < 3) {
				for (int j = i; j < 5 - i; j++) {
					count++;
					mtx[i][j] = count;
				}
			} else {
				for (int j = i - 1; j > 3 - i; j--) {
					count++;
					mtx[i][j] = count;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			if (i < 2) {
				for (int j = 3 - i; j > i; j--) {
					count++;
					mtx[j][i] = count;
				}
			} else if (i > 2) {
				for (int j = 5 - i; j < i + 1; j++) {
					count++;
					mtx[j][i] = count;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("[" + mtx[i][j] + "]");
			}
			System.out.println();
		}
	}
}
