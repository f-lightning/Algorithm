import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720 {

//    N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String[] arr = b.split("");
        int sum = 0;
        for(int i = 0; i < Integer.parseInt(a); i++){
            sum = sum + Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}
