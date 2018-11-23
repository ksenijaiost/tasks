import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Perimeter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if (N >= 1 && N <= 1000) {
            int err[]=new int[1];
            err[0]=0;
            double[][] matrixA = new double[N][2];
            for (int l = 0; l < N; l++) {
                String[] A = reader.readLine().split(" ");
                matrixA[l][0] = Integer.parseInt(A[0]);
                matrixA[l][1] = Integer.parseInt(A[1]);
                if (Math.abs(matrixA[l][0]) > Math.pow(10, 5) && Math.abs(matrixA[l][1]) > Math.pow(10, 5)) {
                    err[0]=1;
                    return;
                }
            }
            if (err[0]==0) {
                double[] perim = new double[10000];
                int h = 0;
                for (int i = 0; i < N - 2; i++) {
                    for (int j = i + 1; j < N - 1; j++) {
                        double ji = Math.sqrt(((matrixA[j][0] - matrixA[i][0]) * (matrixA[j][0] - matrixA[i][0])) + ((matrixA[j][1] - matrixA[i][1]) * (matrixA[j][1] - matrixA[i][1])));
                        for (int k = j + 1; k < N; k++) {
                            double ki = Math.sqrt(((matrixA[k][0] - matrixA[i][0]) * (matrixA[k][0] - matrixA[i][0])) + ((matrixA[k][1] - matrixA[i][1]) * (matrixA[k][1] - matrixA[i][1])));
                            double jk = Math.sqrt(((matrixA[j][0] - matrixA[k][0]) * (matrixA[j][0] - matrixA[k][0])) + ((matrixA[j][1] - matrixA[k][1]) * (matrixA[j][1] - matrixA[k][1])));
                            perim[h] = ji + ki + jk;
                            h++;
                        }
                    }
                }
                Arrays.sort(perim);
                System.out.printf("%.15f", perim[perim.length - 1]);
            }
        }
    }
}
