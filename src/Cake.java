import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Cake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        if (N >= 1 && N <= 1000){
            sumrecurs(N,0);

        }
    }

    private static void sumrecurs(int max, int min){
        int x=0;
        x++;
        int j=max-1;
        for (int i=1; i<max; i++){
            sumrecurs(i,j);
            if (i==j) return;
            j--;
        }
        if (min==0){
            System.out.println(x);
        }
    }
}