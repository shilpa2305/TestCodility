package com.codility.tasks;

import java.util.Arrays;

public class Task1 {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int A[]={4,3,2,1,5},B[]={0,1,0,0,0};
		int A[]={434, 543, 2435, 10, 576},B[]={0,1,1,1,1};
		int N=A.length;
		int count = N;
		
		int i=0;
				
		for(;i<=N-1; i++){
			
			if(B[i]==1){
				
				break;
			}
			else continue;
			
			
		}
		
		
		for(int j=i+1;i<=N-2 && j<=N-1;j++){
			System.out.println("Fish --> "+A[i]+" "+A[j]);
			System.out.println("Direction --> "+B[i]+" "+B[j]);
			
			if((Math.abs(B[i]-B[j])==1 && A[i]!=A[j])){ // || (Math.abs(B[i]-B[j])==1 && A[i]<A[j])){
				count--;
			}
			
		}
		
		
		
		System.out.println(count);
	}

}
