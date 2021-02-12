package com.xworkz.collections;

public class StringToChar {
	public static void main(String[] args){
		String str="Welcome to xworkz";
		char[] ch=str.toCharArray();
		int len=ch.length;
		System.out.println("Char Array Elements:");
		for(int i=0;i<len;i++){
		System.out.println(ch[i]);
		}
		}
	

}
