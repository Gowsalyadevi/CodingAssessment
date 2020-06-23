package com.reverse.data;
import java.util.Collections;
import java.util.*;
import java.util.regex.Pattern;

public class reverseparagraph {
	private static String reverseWords(String str) {
		
        Pattern pattern = Pattern.compile("\\s"); 
        String[] temp = pattern.split(str); 
        String result = ""; 
        
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
	}
	


	public static void main(String[] args) {
		String str = "As part of the evaluation for the developer role, we are requesting you to take this coding assessment for evaluation and assessment.";
        System.out.println("Input String-->"+str); 

		
		reverseWords(str);
        System.out.println("Outpot String-->"+reverseWords(str)); 

        List<String> list = Arrays.asList(str.split(" "));
   	 
        Set<String> uniqueWords = new HashSet<String>(list);
        
        System.out.println("uniqueWords-->"+uniqueWords); 

            for (String word : uniqueWords) {
            int count =Collections.frequency(list, word);
            if(count!=1)
            {
                System.out.println("DublicateWords are-->"+ word +" Occurances "+count); 
	
            }
        }


	}

}
