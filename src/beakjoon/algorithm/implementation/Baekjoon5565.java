package beakjoon.algorithm.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5565 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int total = Integer.parseInt(br.readLine());

    for (int i = 0; i < 9; i++) {
      total -= Integer.parseInt(br.readLine());
    }

    System.out.println(total);
  }
}
