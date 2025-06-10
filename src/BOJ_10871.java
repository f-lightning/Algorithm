import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10871 {
    public static void main(String[] args) throws IOException {

    //정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nx = br.readLine();
        String ar = br.readLine();
        int num = Integer.parseInt(nx.split(" ")[1]);

        String[] arr = ar.split(" ");
        String ans = "";
        for (int i=0; i<arr.length; i++){
            if (Integer.parseInt(arr[i])<num){
                ans = ans + " " + arr[i];
            }
        }
        System.out.println(ans.trim());
    }
}
