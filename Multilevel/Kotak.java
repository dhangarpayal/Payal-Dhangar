package Multilevel;

	public class Kotak extends Banks {

		
		void Banklocation()			//override
		{
			System.out.println("The Bank Location is titwala");
		}
		void Bank_client_name()
		{
			super.Bank_client_name();
			System.out.println("Adarsh, Gaurav, Aditya, Masud");
		}
		

	}

