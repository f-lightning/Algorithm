import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1008 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String a = str.split(" ")[0];
        String b = str.split(" ")[1];
        divide(Double.parseDouble(a), Double.parseDouble(b));
    }

    public static void divide(double a, double b){
        System.out.println(a/b);
    }
}