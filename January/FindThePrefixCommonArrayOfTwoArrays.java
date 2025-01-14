package January;

import java.util.Arrays;

public class FindThePrefixCommonArrayOfTwoArrays {

	public static void main(String[] args) 
	{
		int[] A = {2,3,1};
		int[] B = {3,1,2};
		System.out.println(Arrays.toString(findThePrefixCommonArray(A, B)));
	}
	
	static int[] findThePrefixCommonArray(int[] A, int[] B) 
	{
        int[] C = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
        	int count = 0;
        	for(int j=0;j<=i;j++)
        	{
        		for(int k=0;k<=i;k++)
        		{
        			if(A[j] == B[k])
            		{
            			count++;
            		}
        		}
        	}
        	C[i] = count;
        		
        }
        return C;
    }

}
