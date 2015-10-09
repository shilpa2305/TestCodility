package com.codlity.tasks;

public class TaskThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int N=13649746;
	        int largest = 0;
	        int shift = 0;
	        int temp = N;
	        //System.out.println(N & 11);
	        for (int i = 1; i <= 30; ++i) {
	            int index = (temp & 1);
	         //   System.out.println(index);
	            temp = ((temp >> 1) | (index << 29));
	          //  System.out.println(temp);
	            if (temp > largest) {
	                largest = temp;
	                shift = i;
	            }
	        }
	        
	       System.out.println(shift);
	    }
	
}