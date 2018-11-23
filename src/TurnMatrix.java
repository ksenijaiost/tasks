import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TurnMatrix {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String []A=reader.readLine().split(" ");
        int N = Integer.parseInt(A[0]);
        int M = Integer.parseInt(A[1]);

        int[][] matrixA = new int[N][M];
        for (int i=0; i<N; i++) {
            A=reader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = Integer.parseInt(A[j]);
            }
        }

        int[][] matrixB = new int[M][N];
        if (N<=100 && M<=100 && Math.abs(M)<=Math.pow(10,9)) {
           for (int i=0; i<M; i++){
               for (int j=0; j<N; j++){
                   matrixB[i][j]=matrixA[N-j-1][i];

               }
           }

            System.out.println(M+" "+N);
            for (int i=0; i<M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(matrixB[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
