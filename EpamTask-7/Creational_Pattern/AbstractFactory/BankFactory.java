package net.login.sample1.AbstractFactory;

class BankFactory  extends AbstractFactory1{  
	   public Bank getBank(String bank){  
		      if(bank == null){  
		         return null;  
		      }  
		      if(bank.equalsIgnoreCase("HDFC")){  
		         return new HDFC();  
		      }  
		      else if(bank.equalsIgnoreCase("SBI")){  
		         return new SBI();  
		      }  
		      return null;  
		   }  
		  public Loan getLoan(String loan) {  
		      return null;  
		   }  
		}

