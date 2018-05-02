package com.netease;
import java.util.*;

public class NetEase_1 {
	public static void main(String args[]) {
		int M;
		int N;
		Scanner in = new Scanner(System.in);
		M = in.nextInt();
		N = in.nextInt();
		int[] Di = new int[N];
		int[] Pi = new int[N];
		int[] Ai = new int[M];
		int[]temp = new int[2*N];
		for(int i = 0;i < 2 * N;i++) {
			temp[i] = in.nextInt();
			}
		for(int i = 0;i < N;i++) {
			Di[i] = temp[i*2];
		}
		for(int i = 0;i < N;i++) {
			Pi[i] = temp[i*2 + 1];
		}
		for(int i = 0;i < M;i++) {
			Ai[i] = in.nextInt();
		}
		Method.select(Ai, Di, Pi);
	}
}
