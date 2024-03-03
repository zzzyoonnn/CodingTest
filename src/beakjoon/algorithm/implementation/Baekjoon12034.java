package beakjoon.algorithm.implementation;
/*
문제
- 전설적인 인천 식료품가게의 주인인 김인천 씨는 대대적인 할인행사를 계획하고 있습니다. 
  계산을 단순하게하기 위해 그는 25% 할인된 가격으로 상점의 모든 품목을 판매하기로 결정했습니다. 
  즉, 각 품목의 판매 가격은 정상 가격의 정확히 75 %입니다. 
  우연하게도 인천 식료품가게에서 판매하는 모든 물건의 정상가는 4의 배수인 정수이고, 할인된 가격 역시 편리하게도 모두 정수입니다.
  김인천씨는 이 할인행사를 준비하기위해서 먼저 모든 판매물품의 할인된 판매가격을 프린터로 출력을 실행했고, 
  또한 할인행사 종료후 다시 쓸 모든 품목에 정상가격표 역시 출력을 실행하였습니다.
  손님이 찾아와 잠깐 자리를 비웠던 김인천씨가 다시 가격표의 출력을 확인하기 위해서 프린터로 돌아와보니, 
  공교롭게 프린터는 모든 물품의 할인가격과 정상가격을 따로 구분하지 않고 
  오름차순으로 정렬한 뒤 순서대로 출력하여 하나의 출력물 더미를 만들었습니다. 
  각 품목의 할인가격표와 정상가격표 모두가 출력물 더미의 어딘가에 있습니다. 
  그러나 두 유형(할인가격, 정상가격)의 가격표는 비슷하게 보이고, 모든 품목의 가격을 기억하지 못하기 때문에 
  김인천씨는 어느 가격표가 할인가격표인지 확신할 수 없습니다. 
  이 상황에서 김인천씨는 무엇이 할인가격표인지 구분해낼 수 있을까요?
  예를 들어, 정상가격이 20, 80, 100 인 경우 할인가격은 15, 60, 75이며 
  프린터의 인쇄출력더미는 오름차순으로 정렬된 15, 20, 60, 75, 80, 100 가격표들로 구성됩니다.
입력
- 입력의 첫 번째 라인(줄)은 테스트 사례의 케이스의 수 T를 나타냅니다. 
  이후의 라인은 T개의 테스트 케이스가 이어집니다. 
  각 테스트 케이스는 두 줄로 구성됩니다. 
  첫 번째 줄에는 INU 식료품가게에 존재하는 상품수인 단일 정수 N이 포함됩니다. 
  두 번째 줄에는 프린터에서 가격의 오름차순으로 인쇄한 2N개의 정수 P1, P2, ..., P2N이 주어집니다.
  입력값의 제한은 아래와 같습니다
    1 ≤ T ≤ 100.
    모든 i에 대해서 1 ≤ Pi ≤ 109.
    모든 i에 대해서 Pi ≤ Pi+1. (가격은 오름차순으로 존재)
    정답은 단 하나만 존재하는것이 보장되어 있음.
    1 ≤ N ≤ 100
출력
- 개별 테스트 케이스에 대해서 출력라인은 “Case #x: y” 형식(큰 따옴표는 제외)으로 출력하며,  
  x는 1부터 시작하는 테스트 케이스의 번호 (인덱스)이며, y는 할인가격에 해당하는 오름차순으로 정렬된 N개의 정수들이다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon12034 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuilder sb;

    for (int tc = 1; tc <= t; tc++) {
      sb = new StringBuilder();
      sb.append("Case #").append(tc).append(": ");
      int n = Integer.parseInt(br.readLine());
      int[] price = new int[n * 2];
      boolean[] check = new boolean[n * 2];

      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < price.length; i++) {
        price[i] = Integer.parseInt(st.nextToken());
      }

      for (int i = 0; i < price.length; i++) {
        if (!check[i]) {
          check[i] = true;
          int temp = price[i] * 4 / 3;
          for (int j = i + 1; j < price.length; j++) {
            if (check[j]) continue;
            if (temp == price[j]) {
              check[j] = true;
              sb.append(price[i]).append(' ');
              break;
            }
          }
        }
      }
      System.out.println(sb);
    }
  }
}
