package beakjoon.algorithm.implementation;
/*
문제
- 바야흐로 지금은 대해적 시대, 밀짚모자 해적단의 선장 교정이는 어린 시절 우연히 잊지 못할 한 마디를 들었다. 
  그것은 바로 해적 왕 골.D.상윤이 자신이 모은 모든 보물인 원피스를 위대한 항로에 놓고 왔다는 것이었다. 
  원피스를 가진 자는 이 세상을 가질 수 있다는 매혹적인 얘기였다.
  모두들 말도 안 된다고 고개를 저었지만 교정이는 동료를 모아 원피스를 찾아 여행을 떠났다. 
  하늘섬을 지나 어인섬도 지나고 사황을 무너뜨린 뒤 교정이와 동료들은 결국 원피스의 위치가 적힌 결정적인 단서를 찾아냈다. 
  이 단서는 한 눈에 봐서는 해독이 어려웠다. 
  왜냐하면 여기에는 그저 알파벳 대문자들이 연속해서 적혀있었기 때문이다.
  하지만 천재적인 두뇌를 가진 교정이의 동료이자 해적단의 항해사 진아는 
  단번에 이 단서에 어떤 특정 문자열이 여러 번 등장한다는 것을 직감했다.
  이 특정 문자열이 어떤 문자열인지는 잘 알 수 없었던 진아는 자신이 생각한 모든 문자열이 
  이 단서에서 총 몇 번 등장하는지 알아보기로 했다. 
  아마도 가장 많이 등장한 문자열이 원피스의 위치를 알려줄 것이라고 생각했기 때문이다.
  진아는 밀짚모자 해적단의 프로그래밍 담당인 당신에게 도움을 요청했다. 
  단서 전체에 진아가 원하는 문자열이 몇 번 등장하는지 알아내는 프로그램을 작성하라.
입력
- 입력의 첫 줄에는 해적단이 획득한 단서의 문자열 H가 주어진다.(0 < |H| ≤ 100,000)
  입력의 두 번째 줄에는 진아가 H에서 등장 횟수를 알고 싶은 문자열 N이 주어진다.(0 < |N| ≤ 10)
  단, N과 H는 공백 없는 문자열로 주어지며, 모두 알파벳 대문자로 이루어져 있다.
출력
- H에서 N이 몇 번 등장하는지 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon12780 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String h = br.readLine();
    String n = br.readLine();

    int count = 0;

    h = h.replaceAll(n, "*");

    for (int i = 0; i < h.length(); i++) {
      if (h.charAt(i) == '*') count++;
    }

    System.out.println(count);
  }
}
