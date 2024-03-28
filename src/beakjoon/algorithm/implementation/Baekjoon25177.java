package beakjoon.algorithm.implementation;
/*
문제
- 성현이(dart)가 신입생이었을 때의 학교는 지금과 많이 다른 모습이었다. 
  예를 들어 학식은 우정관뿐 아니라 엠마오관에도 있었다. 
  서강식객 자리에는 파파이스가 있었고, 
  김대건관(K관) 건너편에 있는 멋들어진 게페르트 남덕우 경제관(GN관)은 다 쓰러져 가는 학생회관(C관)이었다. 
  학교가 더 넓어지지는 않았지만 학교에 존재하는 여러 시설들이 바뀐 것이다.
  그런데 성현이는 지금 학교에 있는 장소들 중 예전보다 더 좋은 시설이 들어선 장소도 많지만 더 안 좋은 시설이 들어선 장소도 있다고 생각했다.
  그런 성현이는 학교에 있는 몇몇 장소의 시설들을 자신이 신입생이었을 때 그 장소에 있었던 시설로 다시 되돌릴 수 있었으면 하고 바랐다. 
  그래서 성현이는 학교에 있는 서강대학교 설립자 게페르트 신부님의 동상 앞에서, 
  학교의 몇몇 장소들에 있는 시설을 자신이 신입생이었을 때 거기 있었던 시설로 되돌려 달라고 기도드렸다.
  그렇게 기도한 지 30일째 되는 날 갑자기 게페르트 신부님이 신기루처럼 나타나셨다. 
  그리고 성현이가 학교에 있는 장소들 중 최대 하나를 고르면 성현이가 신입생이었을 때 그 장소에 있었던 시설을 되돌려 주겠다고 말씀하셨다. 
  만약 성현이가 지금 시설이 있는 장소를 고르면 그 시설은 성현이가 신입생이었을 때 거기 있었던 시설로 바꾸어 준다고 하셨다.
  성현이는 이럴 것을 대비해서, 학교의 각 장소에 있는 시설들에 대해 
  현재 있는 장소에 대한 점수와 자신이 신입생이었을 때 그 장소에 있던 시설에 대한 점수를 매겨 놓았다. 
  그 덕분에 성현이는 자신이 학교에서 어떤 장소를 예전 상태로 되돌리고 싶은지, 
  단 1초도 망설이지 않고 게페르트 신부님께 말씀드릴 수 있었다.
  성현이는 최대 하나의 장소를 예전으로 되돌림으로써 학교의 모든 장소들의 점수 합을 최대한 증가시키는 선택을 했다. 
  이때 점수 합의 증가량을 구해보자.
입력
- 첫째 줄에 학교 내에 지금 시설이 있는 장소의 수 N과 예전에 시설이 있었던 장소들의 수 M이 각각 주어진다. (1 <= N,M <= 1,000)
  두 번째 줄에는 지금 시설이 있는 N개의 장소들에 대해 성현이가 매긴 점수 a1, a2, ... , aN 이 차례대로 주어진다. (1 <= ai <= 1,000)
  세 번째 줄에는 예전에 시설이 있었던 M개의 장소들에 대해 성현이가 매긴 점수 b1, b2, ... , bM 이 차례대로 주어진다. (1 <= bi <= 1,000)
  i번째 장소의 현재 점수는 i <= N일 경우 ai이고, 아닐 경우 시설이 없어서 0점이다. 
  마찬가지로, i번째 장소의 신입생 시절 점수는 i <=q M일 경우 bi이고, 아닐 경우 시설이 없었어서 0점이다.
출력
- 첫째 줄에 성현이의 선택으로 인한 점수 합의 증가량을 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon25177 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());       // 지금 시설이 있는 장소의 수
    int m = Integer.parseInt(st.nextToken());       // 예전에 시설이 있었던 장소의 수

    int l = 0;
    if (n < m) l = m;
    else l = n;

    int[] now = new int[l];
    int[] before = new int[l];

    Arrays.fill(now, 0);
    Arrays.fill(before, 0);

    st = new StringTokenizer(br.readLine());        // 지금 시설이 있는 장소들에 대한 점수
    for (int i = 0; i < n; i++) {
      now[i] = Integer.parseInt(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());        // 예전에 시설이 있었던 장소들에 대한 점수
    for (int i = 0; i < m; i++) {
      before[i] = Integer.parseInt(st.nextToken());
    }

    int max = -1;

    for (int i = 0; i < m; i++) {
      int temp = before[i] - now[i];

      if (temp > max) max = temp;
    }

    System.out.println(max);
  }
}
