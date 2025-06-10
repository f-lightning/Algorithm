import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10998 {

//    두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int b = Integer.parseInt(a.split(" ")[0]);
        int c = Integer.parseInt(a.split(" ")[1]);
        System.out.println(b*c);
    }
}
