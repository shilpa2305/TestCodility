package com.codility.tasks;

import java.util.Arrays;

public class Task1 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int P[]={2, 5, 0 },Q[]={4, 5, 6 };
		int M=P.length;int[] minValResult={};int result[]=new int[M];
		
		String S="CAGCCTA";
		String[] subArray=new String[M];
		
		S=S.replaceAll(Character.toString('A'),Character.toString('1'));
		S=S.replaceAll(Character.toString('C'),Character.toString('2'));
		S=S.replaceAll(Character.toString('G'),Character.toString('3'));
		S=S.replaceAll(Character.toString('T'),Character.toString('4'));
				
		for(int i = 0; i <= P.length-1; i++)
		{
			if(P[i]==Q[i])
			{ 
				subArray[i]=Character.toString(S.charAt(P[i]));
			}
			else {
				subArray[i]=S.substring(P[i], Q[i]+1);
				}
			//System.out.println(subArray[i]);

		}
		
		System.out.println("Printing Values of String array");
		for(int i = 0; i <= subArray.length-1; i++)
		{
			System.out.println("SubArray "+subArray[i]);
			minValResult=new int[subArray[i].length()];
			System.out.println("minValResult created "+minValResult.length);
			for(int z=0; z <= (subArray[i].length())-1;z++)
			{
				//System.out.println(Integer.parseInt(Character.toString(subArray[i].charAt(z))));
				minValResult[z]=Integer.parseInt(Character.toString(subArray[i].charAt(z)));
			}
			
			Arrays.sort(minValResult);
			result[i]=minValResult[0];
		}
		
		System.out.println("Final Result");
		for(int i=0;i<=P.length-1;i++)
		{
			System.out.print(result[i]);
		}
		
	}
}