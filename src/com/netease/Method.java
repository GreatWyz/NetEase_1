package com.netease;

public class Method {
	public static void select(int[] a,int[] b,int[] c) {
		//a数组是Ai,b数组是Di,c数组是Pi
		int temp = 0;
		int temp1 = 0;
		int temp2 = 0;
		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j < b.length;j++) {
			if(a[i] >= b[j]) {
				temp2 =  c[j];
			}
			if(temp2 > temp1) {
				temp = temp2;
			}
			else {
				temp = temp1;
			}
			temp1 = temp;
		}
			System.out.println(temp);
		}
	}
}
