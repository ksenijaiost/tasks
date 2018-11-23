import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransportEmployee {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if (N>=1 && N<=100) {
            int[][] matrixA = new int[N][N];
            for (int i=0; i<N; i++) {
                String []A=reader.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    matrixA[i][j] = Integer.parseInt(A[j]);
                }
            }
//            //заменяем все 1 на цифру пункта назначения
//            for (int i=0; i<N; i++) for (int j = 0; j < N; j++) if (matrixA[i][j] == 1) matrixA[i][j] = j;
            //проверяем пути
            int i=0;
            for (int j=1; j<N; j++)
                if (matrixA[i][j] == 1) {
                    i=j;
                }
        }
    }
}
