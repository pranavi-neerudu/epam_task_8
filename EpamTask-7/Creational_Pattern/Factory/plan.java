package net.login.sample1.Factory;

public abstract class plan {
	protected double price;  
    abstract void getCost();  

    public void calculateBill(int n)
    {  
         System.out.println(n*price);  
    }
}

