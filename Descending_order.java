/* Descending of order
 name:payal Dhangar
 date:20/10/2022
*/


package array;
import java.util.Collection;
import java.util.Scanner;
public class Descending_order {

private static final String Collection = null;

public static void main(String[] args, String Arrays) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of element in array ");
		int a = sc.nextInt();
		Integer array[] = new Integer[a];
				
		System.out.println("Enter elements ");
		
		for(int i=0;i<a;i++)	
		{
			array[i] = sc.nextInt();
		}
		//Print original array
		System.out.println("Original array "+ Arrays+"toString(array)");
		
		
		//sort the array in descending order
		array.sort(array,Collection.reverseOrder());
		System.out.println("Soreted array is" +Arrays+"toString(array)");

	}

}
