package com.codlity.tasks;

public class TaskOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="1000111110001101010101";
		long L=Integer.parseInt(S,2);
		//System.out.println("Output: "+Integer.parseInt(S,2));
		System.out.println(L);
		int counter=0;
		while(L!=0)
		{
			if(L%2==0)
			{
				L=L/2;
			}
			else L=L-1;
			counter++;
		}
		System.out.println(counter);
	}

}
