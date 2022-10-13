//3)WAP to print sum of 10 natural numbers using While loop
//PAYAL DHANGAR
//13-OCT-22



package loop;

public class Loop3 {

	public static void main(String[] args) {
	
		int num = 100, i = 1, sum = 0;  
		//executes until the condition returns true  
		while(i <= num)  
		{  
		//adding the value of i into sum variable  
		sum = sum + i;  
		//increments the value of i by 1  
		i++;  
		}  
		//prints the sum   
		System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
		}  

	}


