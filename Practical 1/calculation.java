package practical_4;

public class calculation {

	public static void main(String[] args) {
		
	    java.util.Scanner sc = new java.util.Scanner(System.in);
	    System.out.print("Enter first number:");
	        int x = sc.nextInt();
	    System.out.print("Enter second number:");
	        int y = sc.nextInt();
	    
	        
	            System.out.println("Enter 1 to add");
	            System.out.println("Enter 2 to subtract");
	            System.out.println("Enter 3 to multiply");
	            System.out.println("Enter 4 to divide");
	            
	            int z = sc.nextInt();
	            
	            System.out.println();
	            
	            System.out.println("Answer is :");
	            switch(z)
	            {
	                case 1:
	                System.out.println(x+y);
	                break;
	 
	                case 2:
	                System.out.println(x-y);
	                break;
	 
	                case 3:
	                System.out.println(x*y);
	                break;
	 
	                case 4:
	                System.out.println(x/y);
	                break;    
	 
	              
	            }
	        }
	}