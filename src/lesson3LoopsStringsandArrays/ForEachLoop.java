package lesson3LoopsStringsandArrays;

public class ForEachLoop {

	public static void main(String[] args) {
		// Starts with the keyword 'for' like a normal for-loop
		
		/*Syntax:
		 * for (type var : array)
		 * {
		 * 		statements using var;
		 * 
		 */
		int[] points = { 2, 5, 3, 1, 9 };
		
		int highest_points = maximum(points);
		System.out.println("Highest amount of points: " + highest_points);
	}


public static int maximum(int[] values)
{
	int maxSoFar = values[0];
	
	for (int num : values)
	{
		if (num > maxSoFar)
		{
			maxSoFar = num;
		}
}
	return maxSoFar;
}
}