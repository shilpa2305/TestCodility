package com.codlity.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch,ch_sub;
		String S="aobb";
		int count_case=0,count_case_sub=0,count_valid_passwords=0;
		boolean digits;
	    String sub;
		int i,j,k,c;
		Pattern p;Matcher m;
		p=Pattern.compile("([0-9])");
		for( i=0;i<S.length();i++)
		{
			ch=S.charAt(i);
			count_case=Character.isUpperCase(ch)?count_case+1:count_case;	
		}
		if(count_case!=0)
		{
		    for(c=0;c<S.length();c++)
			{
			    for(i=1;i<=S.length()-c;i++)
				{
				    sub=S.substring(c,c+i);
				  System.out.println("Substring "+sub);
				  m=p.matcher(sub);
	                if(m.find()){
	                	System.out.println("Contains digits");
	                	continue;
	                }
				    for( k=0;k<sub.length();k++)
					{
		                ch_sub=sub.charAt(k);
		                
		               // System.out.println(ch_sub);
						count_case_sub=Character.isUpperCase(ch_sub)?count_case_sub+1:count_case_sub;
						//System.out.println("Alteast 1 uuper   "+count_case_sub);
						
		            }
		           if(count_case_sub!=0)
		            {
		            	
		                count_valid_passwords++;
		               System.out.println("valid    "+ count_valid_passwords);
		            }
		            count_case_sub=0;
				}
			}
			 
		}
		
		
		
		
		if(count_valid_passwords>0)
		{
		    System.out.println(count_valid_passwords);
		}
		else System.out.println(-1);
		
	}

}
