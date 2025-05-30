import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1001 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String a = str.split(" ")[0];
        String b = str.split(" ")[1];
        minus(Integer.parseInt(a), Integer.parseInt(b));
    }

    public static void minus (int a, int b){
        System.out.println(a-b);
    }
}
