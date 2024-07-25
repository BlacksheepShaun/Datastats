// Author(s): Shun Lae Thawtar Khaing  
// Date of Last Modification: 07/03/2024
// Course: CS111B 
// Instructor: C. Conner 
// Assignment # 5 part- 1 of 2
// File Name: DataStats.java
//  user-entered numbers, displaying the minimum, maximum, mean, palindrome check, median, mode, and normalized values

import java.util.Scanner;
import java.util.Arrays;
public class DataStats
{
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		
      // Step 1: Ask user for how count of data and fill array with user input
		System.out.print("Enter length of array: " );
		int count = scnr.nextInt();
		int[] nums = new int[count];
		int userNum;
		
		System.out.print("Enter " + count + " numbers on one line: ");
		
		for(int i = 0; i < count; i++){
		    nums[i] = scnr.nextInt();
		}
		
	    // Step 2: Find minimum and maximum values
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for(int i = 0; i < count; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
            
            sum+= nums[i];
            
            
        }
        
        // Step 3: Calculate mean
        double mean = (double) sum/count;
        
        // Step 4: Check if palindrome
        boolean palindrome = true;
        if(count == 0 || count == 1){
            palindrome = true;
        }else{int i = 0;
            while((i < (count) /2) && palindrome == true){
               if(nums[i] != nums[count-1-i]){
               palindrome = false;
               }
               i++;
            }
        }
      // Step 5:
      // Sort array
      // Find and output median
        double median;
        Arrays.sort(nums);

            if((count % 2) == 0){
               median = ((double)nums[(count/2)] + (double)nums[(count/2)-1])/2;
            }
            else median = nums[((count)/2)];
            
        // Step 6: Find and output mode
        int mode = 0;
        int maxCnt = 0;
        
        for(int i = 0; i < count; i++){
            int cnt = 0;
            for(int j = 0; j < count; j++){
               if(nums[i] == nums[j]){
                  cnt++;
               }
               
               if(cnt > maxCnt){
                  maxCnt = cnt;
                  mode = nums[i];
               }
            }
        }
        
        // Step 7: normalize
        double[] normalizedNums = new double[count];
        
        for(int i = 0; i < count; i++){
            normalizedNums[i] = (double) nums[i]/max;
        }
        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.printf("Mean: %.1f\n", mean);
        System.out.println("Palindrome: " + palindrome);
        System.out.printf("Median: %.1f\n", median);
        System.out.println("Mode: " + mode);
        System.out.print("Normalized: ");
        for(double value: normalizedNums){
        System.out.printf("%.2f ", value);
        }
        
    
        
        
        
        		
	}
}