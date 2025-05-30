import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1330 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String a = str.split(" ")[0];
        String b = str.split(" ")[1];
        comp(Integer.parseInt(a), Integer.parseInt(b));
    }

    public static void comp(int a, int b){
        if(a>b){
            System.out.println(">");
        } else if (a==b) {
            System.out.println("==");
        } else {
            System.out.println("<");
        }
    }
}
