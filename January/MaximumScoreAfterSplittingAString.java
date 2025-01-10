package January;

public class MaximumScoreAfterSplittingAString {

	public static void main(String[] args) 
	{
		String s = "1111";
		System.out.println(maxScore(s));
	}
	
	static int maxScore(String s)
	{
		char[] ch = s.toCharArray();
		int zeros = 0;
		int maxScore = -1;
		
		for(int i=0;i<s.length()-1;i++)
		{
			int ones = 0;
			int count = 0;
			if(ch[i] == '0')
				zeros++;
			
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[j] == '1')
					ones++;
			}
			
			count = zeros + ones;
			
			if(count > maxScore)
				maxScore = count;
		}
		
		return maxScore;
	}

}
