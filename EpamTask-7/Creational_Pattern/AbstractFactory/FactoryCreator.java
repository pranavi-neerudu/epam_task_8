package net.login.sample1.AbstractFactory;

class FactoryCreator {
	public static AbstractFactory1 getFactory(String choice){  
	     if(choice.equalsIgnoreCase("Bank")){  
	        return new BankFactory();  
	     } else if(choice.equalsIgnoreCase("Loan")){  
	        return new LoanFactory();  
	     }  
	     return null;  
	  }  

}
