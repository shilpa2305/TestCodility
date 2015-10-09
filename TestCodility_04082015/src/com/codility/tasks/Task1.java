package com.codility.tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={1,4,5,8},B[]={4,5,9,10},C[]={1,5,8,2,4,9,3,7,20,21,58,6};
		int nails=-1;
		int i=0,j=0;
		
		Map<Integer, String> mapA= new HashMap<Integer,String>();
		Map<Integer, String> mapB= new HashMap<Integer,String>();
		Set<Integer> set=new HashSet<Integer>();
		
		for(j=0;j<=A.length-1;j++)
		{
			mapA.put(A[j], "unmarked");
			mapB.put(B[j], "unmarked");
		}
		
		System.out.println("Initial A");
		Iterator iterator=mapA.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> entry=(Map.Entry<Integer, String>)iterator.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("Initial B");
		iterator=mapB.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> entry=(Map.Entry<Integer, String>)iterator.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		for(i=0;i<=C.length-1;i++)
		{
			for(j=0;j<=A.length-1;j++)
			{
				if(A[j]<=C[i]&& C[i]<=B[j] && (mapA.containsValue("unmarked") && mapB.containsValue("unmarked")))
				{
					System.out.println("Nail "+C[i]);
					System.out.println("["+A[j]+","+B[j]+"]"+" Can be nailed by "+C[i]);
					//(Map.Entry<Integer, String>)(mapA.entrySet().iterator()).next().getValue()
					mapA.put(A[j],"marked");
					mapB.put(B[j],"marked");
					set.add(C[i]);	
				}
				
			}
			 
			//check if all planks are nailed or not. 
			//If yes, the break out of the loop
			System.out.println("Lets Check the maps!!!!!!!!!!!!");
			System.out.println("Checking Map A");
			System.out.println(mapA.keySet());
			System.out.println(mapA.values());
			System.out.println("Checking Map B");
			System.out.println(mapB.keySet());
			System.out.println(mapB.values());
			
			
			
			System.out.println("before c "+set.size());
			System.out.println("Task 1 pushed!!");
		}
		if(!set.isEmpty() && !(mapA.containsValue("unmarked") && mapB.containsValue("unmarked")))
	    {
	        nails=set.size();
	    }
		
		System.out.println("Nails required "+set.size());
	}

}
