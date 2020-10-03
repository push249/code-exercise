package io.aguru.exercise;

public class JumpingOnClouds {
	public int jumpingOnClouds(int[] c) {
		int jumps = 0;
		int n = c.length;
		int i = 0;
		while (i < n - 1) {
			if (i + 2 < n && c[i + 2] == 0) {
				jumps++;
				i = i + 2;
				System.out.println(jumps);
			} else if (i + 1 < n && c[i + 1] == 0) {
				jumps++;
				i = i + 1;
				System.out.println(jumps);
			}
		}
		return jumps;
	}
}
