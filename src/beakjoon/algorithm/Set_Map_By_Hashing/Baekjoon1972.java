package beakjoon.algorithm.Set_Map_By_Hashing;
/*
문제
- 대문자 알파벳으로만 이루어져 있는 문자열이 있다. 
  이 문자열에 대해서 ‘D-쌍’이라는 것을 정의할 수 있는데, 
  이 문자열에 포함되어 있는, 거리가 D인 두 문자를 순서대로 나열한 것을 이 문자열의 D-쌍이라고 한다. 
  예를 들어 문자열이 ZGBG라고 하자. 이 문자열의 0-쌍은 ZG, GB, BG가 되고, 
  이 문자열의 1-쌍은 ZB, GG가 되며, 이 문자열의 2-쌍은 ZG가 된다. 
  문자열의 길이가 N이라고 할 때, 0-쌍부터 (N-2)-쌍까지가 정의됨을 알 수 있다.
  만일 정의되는 D에 대해, 어떤 문자열의 모든 D-쌍들이 서로 다를 때, 이 문자열을 D-유일하다고 한다. 
  위의 예를 보면, 0-쌍들은 ZG, GB, BG로 모두 다르다. 
  따라서 이 문자열은 0-유일하며, 마찬가지로 1-유일하고, 2-유일하다. 
  하지만 만일 문자열이 AAA라고 하자. 
  이 문자열은 0-유일하지 않으며, 다만 1-유일하다.
  만일 어떤 문자열이 정의되는 모든 D에 대해 D-유일하면, 이 문자열을 정말이지 ‘놀라운 문자열’이라고 한다. 
  문자열이 주어질 때, 이 문자열이 놀라운 문자열인지 아닌지를 구하는 프로그램을 작성하시오.
입력
- 입력의 각 줄에는 알파벳 대문자로만 구성된 문자열이 주어진다. 
  모든 문자열의 길이는 80을 넘지 않으며, 입력의 마지막 줄에는 마지막을 나타내는 *가 주어진다. 
  입력은 마지막 줄을 포함해서 101줄을 넘지 않는다.
출력
- 각 줄에 이 문자열이 놀라운(surprising) 문자열인지 아닌지를 아래의 예제와 같이 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Baekjoon1972 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    boolean check = true;

    while (true) {

      String s = br.readLine();
      if (s.equals("*")) break;

      for (int i = 0; i < s.length() - 2; i++) {
        HashSet<String> set = new HashSet<>();
        for (int j = 0; j < s.length() - i - 1; j++) {
          String str = s.charAt(j) + "" + s.charAt(i + j + 1);
          set.add(str);
        }

        if (set.size() == (s.length() - i - 1)) continue;
        else {
          check = false;
          break;
        }
      }

      if (check) sb.append(s).append(" is surprising.").append('\n');
      else sb.append(s).append(" is NOT surprising.").append('\n');

      check = true;
    }
    System.out.println(sb);
  }
}
