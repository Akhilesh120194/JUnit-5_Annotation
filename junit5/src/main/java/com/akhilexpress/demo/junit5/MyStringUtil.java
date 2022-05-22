package com.akhilexpress.demo.junit5;

public class MyStringUtil {
	
	public String reverseString(String str)
	{
		if(str==null || str=="")
		{
			throw new IllegalArgumentException("Please pass a valid string");
		}
		StringBuilder sb=new StringBuilder(str);
		StringBuilder reverse = sb.reverse();
		return reverse.toString();
		
	}
	
	public boolean isStringPallindrome(String str)
	{
		
		
		StringBuilder sb=new StringBuilder(str);
		StringBuilder reverse = sb.reverse();
		String str2 = reverse.toString();
		
		if(str.equals(str2))
		{
			return true;
		}
		
		return false;
		
	}

}
