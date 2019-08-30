public class Main {

	public static void main(String[] args) {
		int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		System.out.println(new Solution().solution(triangle));
	}

}
class Solution {
    public int solution(int[][] triangle) {
        for (int i = 1; i < triangle.length; i++) {
        	for (int j = 0; j < triangle[i].length; j++) {
        		if (j == 0) // 1 choice only from right parent
        			triangle[i][j] += triangle[i-1][j];
        		else if (j == triangle[i].length-1) // 1 choice only from left parent
        			triangle[i][j] += triangle[i-1][j-1];
        		else { // 2 choice (from left and right parents)
        			triangle[i][j] += 
        					triangle[i-1][j-1] > triangle[i-1][j] ? triangle[i-1][j-1] : triangle[i-1][j];
        		}
        	}
        }
        
        return findMax(triangle[triangle.length-1]);
    }
    private int findMax(int[] arr) {
    	int max = 0;
    	for (int i = 0; i < arr.length; i++)
    		if (max < arr[i])
    			max = arr[i];
    	return max;
    			
    }
}