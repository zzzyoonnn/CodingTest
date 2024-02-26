package beakjoon.algorithm.implementation;
/*
문제
- 프로야구단 다숌 자이언츠에서는 야구장에 오는 손님에게 티켓을 나누어준다. 
  그리고 나서 그 티켓 중에 다음과 같은 규칙을 가진 티켓을 행운의 티켓이라고 하며, 
  그 티켓을 가진 사람들에게 상품을 나누어준다.
  행운의 티켓은 정확하게 2N자리로 이루어진 티켓이다. 
  왼쪽 N자리의 합과 오른쪽 N자리의 합이 일치하면 그 티켓은 행운의 티켓이라고 한다.
  숌은 티켓 번호를 조작하려고 한다. 
  어떤 문자열이 주어지면, 
  그 문자열의 연속된 부분 문자열중 행운의 티켓 규칙을 만족하는 최대 부분 문자열의 길이를 출력하는 프로그램을 작성하시오. 
입력
- 첫째 줄에 문자열 S가 주어진다. 
  문자열 S는 1보다 크거나 같고, 9보다 작거나 같은 수로만 이루어져 있고, 
  길이는 50보다 작거나 같은 자연수이다.
출력
- 첫째 줄에 주어진 입력의 연속된 부분 문자열 중 
  행운의 티켓 규칙을 만족하는 부분 문자열의 최대 길이를 출력하시오. 
  찾을 수 없다면 0을 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1639 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int[] arr = new int[str.length()];
    for (int i = 0; i < str.length(); i++) {
      arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
    }

    int start, mid, end;
    int s, e;
    int left, right;

    end = str.length() % 2 == 0 ? str.length() : str.length() - 1;

    end += 2;   // while문 처음에 바로 -2해주기 때문에 +2

    while (end > 2) {
      start = 0;
      end -= 2;
      e = end;
      s = start;

      while (e <= str.length()) {
        mid = (s + e) / 2;
        left = 0;
        right = 0;

        for (int l = s; l < mid; l++) {
          left += arr[l];
        }

        for (int r = mid; r < e; r++) {
          right += arr[r];
        }

        if (left == right) {
          System.out.println(end);
          return;
        }
        s++;
        e++;
      }
    }
    System.out.println(0);
  }
}
