package beakjoon.algorithm.implementation;
/*
문제
- 숫자 맞추기 게임은 초등학교 학생들 사이에서 유행하는 게임이다. 
  선생님은 학생들의 연산 실력과 논리적인 사고력을 기르기위해 학생들에게 이 게임을 권유하고 있다.
  이 게임을 시작할 때는 친구가 숫자 하나를 머리속에 생각해야 한다. 
  이 숫자를 n0이라고 하자. 
  그러고 나서 다음과 같이 게임을 진행한다.
    1. 친구에게 n1 = 3*n0 계산을 하라고 한 뒤, n1이 짝수인지 홀수인지를 말해달라고 한다.
    2. n1이 짝수라면, n2 = n1/2를, 홀수라면 n2 = (n1+1)/2를 계산해달라고 한다.
    3. n3 = 3*n2의 계산을 부탁한다.
    4. 친구에게 n4 = n3/9를 계산한 뒤, 그 값을 말해달라고 한다. (n4는 나눗셈의 몫이다)
    5. 자 이제, n1이 짝수였다면, n0 = 2*n4로, 홀수였다면, n0 = 2*n4+1로 처음 친구가 생각한 숫자를 맞출 수 있다.
  예를 들어,  친구가 생각한 수가 n0=37이었다면, n1 = 111이 되고 홀수이다. 
  그 다음 n2 = 56, n3 = 168, n4 = 18이 된다. 친구는 n4를 알려주게 된다. 
  그럼 2*n4+1 = 37이기 때문에, 친구가 제일 처음 생각한 숫자를 맞출 수 있다.
  n0이 주어졌을 때, n1이 홀수인지 짝수인지와 n4를 구하는 프로그램을 작성하시오.
입력
- 입력은 여러 개의 테스트 케이스로 이루어져 있다. 
  각 테스트 케이스는 한 줄로 이루어져 있고, n0으로 이루어져 있다. (0 < n0 < 1,000,000) 
  입력의 마지막 줄에는 0이 하나 주어진다.
출력
- 각 테스트 케이스에 대해서, 케이스 번호를 출력하고 n1이 짝수라면 'even', 홀수라면 'odd'를 출력하고, n4를 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon4892 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = 1;
    StringBuilder sb;

    while (true) {
      int n = Integer.parseInt(br.readLine());
      if (n == 0) break;

      sb = new StringBuilder();
      sb.append(count).append(". ");
      if (n % 2 == 0) {
        n = 3 * ((3 * n) / 2) / 9;
        sb.append("odd ").append(n);
      }
      else {
        n = 3 * (((3 * n) + 1) / 2) / 9;
        sb.append("even ").append(n);
      }

      System.out.println(sb);
      count++;
    }
  }
}
