package week1day2;

import java.util.Arrays;

public class findminmax {

	public static void main(String[] args) {
	int[] numbers= {22,3981,-19,822,0,45,37};
	
	 
	Arrays.sort(numbers);
	System.out.println("The sorted array is:");
	for(int num : numbers) {
		System.out.println(num + " ");
	}
	 	int min=numbers[0];
		int max=numbers[0];
	for(int i=0;i<numbers.length;i++)
	{
		if(numbers[i]>1)max=numbers[i];
		else if (numbers[i]<min) min=numbers[i];
		}
	System.out.println("maximum number is:" +max);
	System.out.println("minimum number is:" +min);
	}
		}
	


