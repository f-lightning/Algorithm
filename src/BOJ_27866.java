import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_27866 {

//    단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<2; i++){
            list.add(br.readLine());
        }
        char chr = list.get(0).charAt(Integer.parseInt(list.get(1))-1);
        System.out.println(chr);
    }
}
