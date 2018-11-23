import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TriangleSide {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if (N>=3 && N<=1500) {
            int[][] matrixA = new int[N][2];
            for (int i=0; i<N; i++){
                String []A=reader.readLine().split(" ");
                matrixA[i][0] = Integer.parseInt(A[0]);
                matrixA[i][1] = Integer.parseInt(A[1]);
            }
            double array[] = new double[N];
            int count = 0;
            for (int i=0; i<N; i++) { // для каждой точки
//                System.out.println(i+" точка");
                for (int j=0; j<N; j++) { //каждая точка в пару
                    //расстояние между точками - кв корень((х2-х1)^2+(y2-y1)^2)
                    double x = Math.sqrt(((matrixA[j][0] - matrixA[i][0]) * (matrixA[j][0] - matrixA[i][0])) + ((matrixA[j][1] - matrixA[i][1]) * (matrixA[j][1] - matrixA[i][1])));
                    array[j]=x;
                }
                Arrays.sort(array);
//                for (double anArray : array) {
//                    System.out.print(anArray + " ");
//                }
//                System.out.println();
                //проверяем, есть ли совпадения длинн в массиве
                for (int k=0; k<array.length; k++){
                    for (int h=k+1; h<array.length; h++){
                        if (array[k]==array[h]) {
                            count++;
//                            System.out.println(count+" "+array[k]);
                        }
                    }
                }
            }
//            System.out.println(count);

            int x=0;
            for (int i=0; i<N; i++) {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        if (i!=j && j!=k && k!=i) {
                            double d = Math.sqrt(((matrixA[j][0] - matrixA[i][0]) * (matrixA[j][0] - matrixA[i][0])) + ((matrixA[j][1] - matrixA[i][1]) * (matrixA[j][1] - matrixA[i][1])));
                            double dd = Math.sqrt(((matrixA[k][0] - matrixA[i][0]) * (matrixA[k][0] - matrixA[i][0])) + ((matrixA[k][1] - matrixA[i][1]) * (matrixA[k][1] - matrixA[i][1])));
                            if (d == dd) {
                                double s = 0.5 * Math.abs((matrixA[i][0] - matrixA[k][0]) * (matrixA[j][1] - matrixA[k][1]) - (matrixA[j][0] - matrixA[k][0]) * (matrixA[i][1] - matrixA[k][1]));
                                if (s == 0) {
                                    x++;
                                }
                            }
                        }
                    }
                }
            }
            count= (int) (count-0.5*x);
//            System.out.println(x+" "+count);
            System.out.println(count);
        }
    }
}
