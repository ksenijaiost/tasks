import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CipherHello {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        if (str.length()<=Math.pow(10,3)) {
            for (int i = 0; i < str.length(); i++){
                if (Character.isDigit(str.charAt(i))) {
                str = str.replace(str.charAt(i), str.charAt(i+1));
                }
            }
            System.out.println(str);
        }
    }
}
