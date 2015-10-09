package com.codility.practice;

import java.util.Scanner;

public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={1,-2,0,9,-1,-2};
		int N=A.length;
		
		int sum=A[0],pebble=0;
		
		Scanner s;
		System.out.println(sum);
		while(pebble<N-1)
		{
			System.out.println("Enter die value:");
			s=new Scanner(System.in);
			int K=s.nextInt();
			System.out.println("Value of K "+K);
			if((pebble+K)<=N-1)
			{
				System.out.println("YES!!");
				pebble=pebble+K;
				System.out.println("Pebble current loc "+pebble);
				sum+=A[pebble];
				System.out.println(sum);
			}
			else {
				System.out.println("NO!!");
				System.out.println("Enter valid value less than "+N);
			}
			
		}
		System.out.println(sum);
	}

}
