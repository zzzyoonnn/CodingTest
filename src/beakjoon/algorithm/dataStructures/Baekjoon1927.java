package beakjoon.algorithm.dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon1927 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());    // 연산의 개수

    int input;
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for(int index = 1; index <= N; index++) {
      input = Integer.parseInt(br.readLine());

      if (input == 0) {
        if (pq.isEmpty()) {
          System.out.println(0);
        } else {
          System.out.println(pq.poll());
        }
      } else {
        pq.add(input);
      }
    }
  }
}
