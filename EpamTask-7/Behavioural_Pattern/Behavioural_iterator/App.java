package net.login.sample1.Behavioural_iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Collection c = new Collection();  
         
         for(Iterator i = c.getIterator(); i.hasNext();){  
             String name = (String)i.next();  
             System.out.println("Name : " + name);  
          }  
    }
}
