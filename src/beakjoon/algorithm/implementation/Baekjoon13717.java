package beakjoon.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon13717 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    HashMap<String, Integer> map = new HashMap<>();

    int max = -1;
    String poketmon = "";
    int total = 0;
    StringTokenizer st;
    for (int i = 0; i < n; i++) {
      String name = br.readLine();

      st = new StringTokenizer(br.readLine());
      int needed = Integer.parseInt(st.nextToken());
      int owned = Integer.parseInt(st.nextToken());

      int temp = 0;
      int count = 0;
      while (owned >= needed) {
        temp = owned / needed;
        count += temp;
        owned -= temp * needed;

        owned += temp * 2;
      }

      map.put(name, count);
      total += count;

      if (count > max) {
        max = count;
        poketmon = name;
      }
    }

    System.out.println(total);
    System.out.println(poketmon);
  }
}
