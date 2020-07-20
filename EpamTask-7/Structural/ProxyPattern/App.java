package net.login.sample1.ProxyPattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	 OfficeInternetAccess access = new ProxyInternetAccess("Sai Pranavi");  
         access.grantInternetAccess();  
    }
}
