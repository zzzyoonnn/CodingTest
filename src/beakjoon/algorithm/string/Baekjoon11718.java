package beakjoon.algorithm.string;
/*
문제
- 입력 받은 대로 출력하는 프로그램을 작성하시오.
입력
- 입력이 주어진다.
  입력은 최대 100줄로 이루어져 있고, 
  알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
  각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 
  또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
출력
- 입력받은 그대로 출력한다.
ex 1)
입력				출력
- Hello				- Hello
  Baekjoon			  Baekjoon
  Online Judge		  Online Judge
*/
import java.io.*;
import java.util.*;

public class Baekjoon11718 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
    }
}
