package com.codility.practice;

public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 56, Y = 1356,D = 36,jumps=0,distance=X;
		/*while(distance<Y)
		{
			distance=distance+D;
			System.out.println(X+" + "+D+" = "+distance);
			jumps++;
		}*/
		
		if(Y%X==0)
	        System.out.println((Y-X)/D);
	    else System.out.println((int)(Y-X)/D+1);
	
	}

}
