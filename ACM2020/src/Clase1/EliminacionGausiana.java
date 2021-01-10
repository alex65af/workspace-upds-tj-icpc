package Clase1;

class AugmentedMatrix {
	public double[][] mat = new double[3][4]; // ajuste este valor según sea necesario

	public AugmentedMatrix() {
	}
}

class ColumnVector {
	public double[] vec = new double[3];// ajuste este valor según sea necesario

	public ColumnVector() {
	}
}

class EliminacionGausiana {
	public static ColumnVector GE(int N, AugmentedMatrix Aug) {
		// input: N, Augmented Matrix Aug,
		// output: Column vecto X, respuesta
		int i, j, k, l;
		double t;

		for (i = 0; i < N - 1; i++) { //
			l = i;
			for (j = i + 1; j < N; j++)
				if (Math.abs(Aug.mat[j][i]) > Math.abs(Aug.mat[l][i]))
					l = j;
			for (k = i; k <= N; k++) {
				t = Aug.mat[i][k];
				Aug.mat[i][k] = Aug.mat[l][k];
				Aug.mat[l][k] = t;
			}
			for (j = i + 1; j < N; j++)
				for (k = N; k >= i; k--)
					Aug.mat[j][k] -= Aug.mat[i][k] * Aug.mat[j][i] / Aug.mat[i][i];
		}
		
		ColumnVector Ans = new ColumnVector();
		for (j = N - 1; j >= 0; j--) {
			for (t = 0.0, k = j + 1; k < N; k++)
				t += Aug.mat[j][k] * Ans.vec[k];
			Ans.vec[j] = (Aug.mat[j][N] - t) / Aug.mat[j][j];
		}
		return Ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AugmentedMatrix Aug = new AugmentedMatrix();
		Aug.mat[0][0] = 1;	Aug.mat[0][1] = 1;	Aug.mat[0][2] = 1;	Aug.mat[0][3] = 2;
		Aug.mat[1][0] = 5;	Aug.mat[1][1] = 1;	Aug.mat[1][2] = -4;	Aug.mat[1][3] = 1;
		Aug.mat[2][0] = -7;	Aug.mat[2][1] = 2;	Aug.mat[2][2] = -5;	Aug.mat[2][3] = 3;
		ColumnVector X = GE(3, Aug);
		System.out.printf("X = %.2f; Y = %.2f; Z = %.2f", X.vec[0], X.vec[1], X.vec[2]);

	}

}
