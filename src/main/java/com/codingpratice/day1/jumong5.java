package com.codingpratice.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class jumong5 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bufferedReader.readLine());
		int M = Integer.parseInt(bufferedReader.readLine());
		
		int [] A = new int[N];
		
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		for(int i=0; i<N; i++) {
			A[i] =  Integer.parseInt(stringTokenizer.nextToken());
		}
		
		Arrays.sort(A);
		
		int count = 0;
		int i = 0;
		int j = N-1;
		
		while(i<j) {
			if(A[i]+A[j]<M) {
				i++;
			}else if(A[i]+A[j]>M) {
				j--;
			}else {
				count++;
				i++;
				j--;
			}
		}
		System.out.println(count);
	}

}
