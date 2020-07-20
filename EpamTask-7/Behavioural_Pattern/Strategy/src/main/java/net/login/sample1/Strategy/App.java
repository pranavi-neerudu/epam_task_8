package net.login.sample1.Strategy;
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.IOException; 
public class App 
{
    public static void main( String[] args )throws  IOException
    {
    	 BufferedReader b=new BufferedReader(new InputStreamReader(System.in));  
         System.out.print("Enter value1: ");  
         float value1=Float.parseFloat(b.readLine());  
         System.out.print("Enter value2: ");  
         float value2=Float.parseFloat(b.readLine());  
         Context c = new Context(new Addition());          
         System.out.println("Addition = " + c.executeStrategy(value1, value2));  
         c = new Context(new Multiplication());        
         System.out.println("Multiplication = " + c.executeStrategy(value1, value2));  
         c = new Context(new Subtraction());       
         System.out.println("Subtraction = " + c.executeStrategy(value1, value2));  
    }
}
