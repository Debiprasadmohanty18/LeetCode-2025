package com.tanmay.LeetCodeJanuary;

public class CountPrefixAndSuffixPairsI {

	public static void main(String[] args) {
		
		String[] words = {"abab","ab"};
		System.out.println(countPrefixSuffixPairs(words));

	}
	
	static int countPrefixSuffixPairs(String[] words) 
	{
        int count = 0;
        for(int i=0;i<words.length;i++)
        {
        	for(int j=i+1;j<words.length;j++)
        	{
        		if(words[j].contains(words[i]))
        			count++;
        	}
        }
        
        return count;
    }

}
