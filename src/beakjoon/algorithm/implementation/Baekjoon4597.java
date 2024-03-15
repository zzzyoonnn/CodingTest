package beakjoon.algorithm.implementation;
/*
문제
- 1의 개수가 홀수개인 비트스트링을 "홀수 패리티"를 가지고 있다고 한다. 
  또, 짝수개인 경우에는 "짝수 패리티"를 가지고 있다고 한다. 또, 0도 짝수로 간주한다. 
  따라서, 1이 없는 비트 스트링은 짝수 패리티를 가지고 있다.
  마지막 숫자가 지워진 비트 스트링이 주어지고, 이 비트 스트링의 패리티가 주어졌을 때, 
  마지막 숫자를 올바르게 구하는 프로그램을 작성하시오.
입력
- 입력은 여러 개의 비트 스트링으로 이루어져 있다. 
  각 비트 스트링은 한 줄로 이루어져 있고, 길이는 1~31비트이다. 
  또, 비트 스트링의 마지막 문자는 e 또는 o이다. (e: 짝수 패리티, o: 홀수 패리티) 
  마지막 줄에는 '#'이 주어진다.
출력
- 입력으로 주어진 각각의 비트 스트링에 대해서, 마지막 문자를 올바른 비트로 바꾼 비트 스트링을 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon4597 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s;
    StringBuilder sb;

    while (true) {
      s = br.readLine();

      if (s.equals("#")) break;

      int one = 0;
      sb = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '1') one++;

        if (i != s.length() - 1) sb.append(s.charAt(i));
      }

      boolean odd = false;  // 홀수 패리티 확인용

      if (s.charAt(s.length() - 1) == 'o') odd = true;

      if (odd && one % 2 == 1) sb.append(0);
      else if (odd && one % 2 != 1) sb.append(1);
      else if (!odd && one % 2 == 0) sb.append(0);
      else if (!odd && one % 2 != 0) sb.append(1);

      System.out.println(sb);
    }
  }
}
