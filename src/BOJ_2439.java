import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2439 {

//    첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//    하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i<a; i++){
            for (int j = 0; j<a-(i+1); j++){
                System.out.print(" ");
            }
            for (int k = 0; k<(i+1); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}