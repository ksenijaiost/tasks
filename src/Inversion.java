import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inversion {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String []A=reader.readLine().split(" ");
        int N = Integer.parseInt(A[0]);
        int k = Integer.parseInt(A[1]);
        int arr[] = new int[N];
        for (int i=0; i<N; i++) arr[i] = i + 1;
        if (k==0) {
            for (int anArr : arr) System.out.print(anArr + " ");
        } else {
            int z=0;
            for (int i=0; i<arr.length; i++)
                for (int j=0; j<arr.length-1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                    for (int q=0; q<arr.length-1; q++) if (arr[q] > arr[q + 1]) z++;
                    if (z==k) {
                        for (int anArr : arr) System.out.print(anArr + " ");
                        System.out.println();
                        return;
                    } else z=0;
                }
            System.out.println("-1");
        }
    }
}