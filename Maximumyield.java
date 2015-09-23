package interview;

public class Maximumyield {
	public int maxYield(int[] strip){
		// use dynamic programming to calculate different conditions
		int[][] matrix=new int[strip.length+1][2];
        	for(int i=1; i<=strip.length;i++){
        		//matrix[i][0] is the max yield of 0 to i-1 square
        		matrix[i][0]=Math.max(matrix[i-1][0], matrix[i-1][1]);
          		//matrix[i][1] is the yield besed on matrix[i-1][0] when we select the ith square to mine
            		matrix[i][1]=strip[i-1]+matrix[i-1][0];
        	}
        	return Math.max(matrix[strip.length][1], matrix[strip.length][0]);
	}

}
