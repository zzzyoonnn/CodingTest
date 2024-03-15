package beakjoon.algorithm.implementation;
/*
문제
- 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
입력
- 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
출력
- 첫째 줄에 A+B를 출력한다.
ex 1)
입력		출력
- 1 2   - 3
*/
import java.io.*;
import java.util.*;

public class Baekjoon16199 {
	public static void main(String[] agrs) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());
       
       System.out.println(a + b);
	}
}
