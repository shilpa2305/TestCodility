package com.codility.practice;

import java.util.EmptyStackException;
import java.util.Stack;

public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="()(()))()";
		Stack<String> stk=new Stack<String>();
		int flag_invalid=0;
		try{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				System.out.println("( found");
				stk.push("(");
				System.out.println("( pushed");
			}
			else if(s.charAt(i)==')')
			{
				System.out.println(") found");
				if(stk.peek()=="(")
				{
					stk.pop();
					System.out.println("Match found.. "+ "("+s.charAt(i));
				} 
				
			}	
		}	
		}
		catch(EmptyStackException e){
			flag_invalid++;
			System.out.println(e.getMessage());
		}
		
		if(flag_invalid==0 && stk.empty())
		{
			System.out.println("Valid String");
		}
		else if(flag_invalid>0 || !stk.empty())
		{
			System.out.println("Invalid String");
		}
	}

}
