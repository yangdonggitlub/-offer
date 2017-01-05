package 剑指offer;
public class Two_dimensional_array_lookup {
	 public static boolean Find(int target, int [][] array) {
	        int length = array.length-1;
	        if(length == 0)
	        	return false;
	        for(int i = 0;i <= length; i++)
	        {
	        	if(array[i][array[0].length-1]==target)
	        	{
	        		return true;
	        	}
	        	else if(array[i][array[0].length-1]>target)
	        	{
	        		for(int j = 0;j < array[0].length-1;j++)
	        		{
	        			if(array[i][j] == target)
	        			{
	        				return true;
	        			}
	        		}
	        	}
	        		
	        }
			return false;
	        }
	 public static void main(String[] args) {
		 int[][] sample = new int[][] { { 1, 2, 8, 9 },    
	            { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
	     //Two_dimensional_array_lookup test = new Two_dimensional_array_lookup();
	     System.out.print(Find(10,sample));
	 }

}
