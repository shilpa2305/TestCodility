package com.codlity.tasks;

public class TaskFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={-8,3,0,5,-3,12};
		int slice1,slice2,sum=0,highest=0;
		for(slice1=0;slice1<A.length;slice1++)
		{
			for(slice2=0;slice2<A.length;slice2++)
			{
				if(slice2>slice1 && A[slice1]>=0 && A[slice2] >=0)
				{	
					System.out.print(slice1 +" + "+ slice2 +" = " );
				
					sum=A[slice1]+A[slice2];
					System.out.println(sum);
					
				}
				 if(slice1==slice2 && A[slice1]>=0 && A[slice2] >=0)
				{
					System.out.print(slice1 +" + "+ slice2 +" = " );
					sum=A[slice1];
					System.out.println(sum);
				}
				
				if(sum>=0 && (slice2==slice1 || slice2==slice1+1) && sum>=highest )
				{
					highest=sum;
					System.out.println("Highest assigned  " +highest);
				}
			}
		
			
		}
		System.out.println(highest);
	}

}
