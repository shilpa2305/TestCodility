package com.codility.tasks;

public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={0,1,0,1,1};
		int N=A.length;
		int cars=0;
		int i,j;
		for(i=0,j=i+1;i<N && j<N;i++,j++){
			
				System.out.println(A[i]+"   "+A[j]);
			
				
					
					cars = (A[i]==0 && A[j] >A[i]) ? cars+1 : cars;
					
					System.out.println("-----------");
				
			
		}
		System.out.println(cars);
		//System.out.println();
	}
}

