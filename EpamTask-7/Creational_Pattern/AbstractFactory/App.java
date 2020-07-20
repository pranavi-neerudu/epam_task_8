package net.login.sample1.AbstractFactory;
import java.io.*;
import java.io.InputStreamReader;
import java.io.IOException; 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       // System.out.println( "Hello World!" );
    	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));     	  
	      System.out.println("Enter the name of Bank: ");  
	      String bankName=br.readLine();  	  
	System.out.println("Type of loan: ");  	  
	String loanName=br.readLine();  
	AbstractFactory1 bankFactory = FactoryCreator.getFactory("Bank");  
	Bank b=bankFactory.getBank(bankName);  
	System.out.println("Interest rate for "+b.getBankName()+ ": ");  	  
	double rate=Double.parseDouble(br.readLine());    
	System.out.println("loan amount: ");  	  
	double loanAmount=Double.parseDouble(br.readLine());   
	System.out.println("Number of years to pay entire loan amount: ");  
	int years=Integer.parseInt(br.readLine());    
	System.out.println("you are taking the loan from "+ b.getBankName());  
	  
	AbstractFactory1 loanFactory = FactoryCreator.getFactory("Loan");  
	           Loan l=loanFactory.getLoan(loanName);  
	           l.getInterestRate(rate);  
	           l.calculateLoanPayment(loanAmount,years);  
    }
}
