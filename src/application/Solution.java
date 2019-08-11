package application;

public class Solution {

	public static void main(String[] args) {
		
		int n = 5;
		int [] arr = {2,3,4,1,5};
		
		
		   int count = 0;
	        int i = 0;
	        while (i<arr.length){
	             if (arr[i]!=i+1){
	                    int temp = arr[i];
	                    arr[i] = arr[arr[i]-1];
	                    arr[temp-1] = temp;
	                    count ++;
	             }else i++;
	        }     
	        System.out.println(count); 
	    }
		
}	


	


