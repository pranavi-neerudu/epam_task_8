package net.login.sample1.Factory;
import java.io.BufferedReader; 
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
    	 GetCost Factory = new GetCost();    
	      System.out.print("Enter the name of the Stationery you would like to buy ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	      String Name=br.readLine();  
	      System.out.print("Enter the Quantity ");  
	      int n=Integer.parseInt(br.readLine());  
	      plan p = Factory.getStationery(Name);  
	  
	  
	       System.out.print("Bill amount for "+n+" "+Name+" is: ");  
	           p.getCost();  
	           p.calculateBill(n);  
    }
}
