import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2475 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] ar = str.split(" ");
        int sum = 0;

        for (int i = 0; i < ar.length; i++){
            double a = Double.parseDouble(ar[i]);
            int b =(int)Math.pow(a,2);
            sum = sum + b;
        }

        System.out.println(sum%10);
    }
}
