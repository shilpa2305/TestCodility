package com.codility.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={1,5,3,4,3,4,1,2,3,4,6,2};
		List<Integer> list=new ArrayList<Integer>();
		int N=A.length,flags=0;;
	
			
		for(int i=1;i<=N-2;i++)
		{
			if(A[i]> A[i-1] && A[i] > A[i+1])
			{
				list.add(new Integer(i));
				flags++;
			}
			
		}
				
		
		for(int i=0;i<list.size()-1;i++)
		{
			int abs=Math.abs(list.get(i)-list.get(i+1));
			if(abs<flags)
			{
				list.remove(i+1);
			}	
		}
		flags=list.size();
		System.out.println(flags);
	}

}
