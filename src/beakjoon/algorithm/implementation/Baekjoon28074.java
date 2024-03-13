package beakjoon.algorithm.implementation;
/*
문제
- Innovations for Humanity, Mobility for Tomorrow
  현대 모비스의 MOBIS는 어떤 뜻을 가지고 있을까?
  MOBIS는 기존에는 Mobile + System의 합성어에서 시작되었지만, 
  현재는 "Mobility Beyond Integrated Solution" 라는 의미로 재정의 되었다.
  이는 사용자의 경험을 혁신하고, 고객의 요구에 최적화된 통합 솔루션, 
  그 이상의 가치를 전달하는 모빌리티 플랫폼 프로바이더로 도약하겠다는 뜻을 가지고 있다.
  이 뜻에 매료된 진익이는 스티커 용지에 인쇄되어 있는 문자들 중 'M', 'O', 'B', 'I', 'S' 만을 오리고 
  적절히 배치하여 노트북에 MOBIS를 붙여놓고자 한다.
  스티커 용지에 인쇄되어 있는 문자열이 주어진다. 
  이 문자들을 이용해 MOBIS를 만들 수 있을까?
입력
- 첫째 줄에 문자열이 주어진다.
출력
- 주어진 문자열에 포함된 알파벳 대문자들을 이용해 MOBIS를 만들 수 있으면 "YES", 그렇지 않으면 "NO"를 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon28074 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    boolean[] arr = new boolean[5];

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'M') arr[0] = true;
      else if (s.charAt(i) == 'O') arr[1] = true;
      else if (s.charAt(i) == 'B') arr[2] = true;
      else if (s.charAt(i) == 'I') arr[3] = true;
      else if (s.charAt(i) == 'S') arr[4] = true;
    }

    for (boolean b : arr) {
      if (!b) {
        System.out.println("NO");
        System.exit(0);
      }
    }
    System.out.println("YES");
  }
}
