package beakjoon.step01;
/*
문제
- 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다.
  이제 A + B + C를 계산할 차례이다!
입력
- 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10의 12승)이 공백을 사이에 두고 주어진다.
출력
- A+B+C의 값을 출력한다.
ex 1)
입력			출력
- 77 77 7777	- 7931

*/
import java.io.*;
import java.util.*;

public class Baekjoon11382 {
	public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        
        System.out.println(a + b + c);
    }
}
