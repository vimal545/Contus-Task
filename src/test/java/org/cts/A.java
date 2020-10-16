package org.cts;

import java.util.Map;
import java.util.TreeMap;

public class A {
public static void main(String[] args) {
	
	String word="Programs written in a language more like English is converted by a compiler";
	Map<Character,Integer> mp=new TreeMap();
	
	
	for(int i=0;i<word.length();i++) {
		
char ch = word.charAt(i);		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
		
		if(mp.containsKey(ch)) {
			Integer i1 = mp.get(ch);
			mp.put(ch, i1+1);
		}
		else {
			mp.put(ch, 1);
			
		}
	}
	
}
	System.out.println(mp);
}}
