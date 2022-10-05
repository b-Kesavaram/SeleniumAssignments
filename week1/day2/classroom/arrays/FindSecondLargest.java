package week1.day2.classroom.arrays;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};

		
		int arraylength= data.length;
		System.out.println("The given array lenght is" + " " +arraylength);
		System.out.println("Ascending number of the given array");
		for (int i=0;i<arraylength;i++)
		{
			for(int j=i+1;j<arraylength;j++)
			{
				int d = 0;
				if (data[i]>data[j])
				{
					d = data[i];
					data[i]= data[j];
					data[j]=d;
									}
			}
						System.out.println(data[i]);
		}

		
	}

	
}
