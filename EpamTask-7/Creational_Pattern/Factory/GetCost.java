package net.login.sample1.Factory;

public class GetCost {
	public plan getStationery(String Type){  
        if(Type == null){  
         return null;  
        }  
      if(Type.equalsIgnoreCase("Pen")) {  
             return new Pen();  
           }   
       else if(Type.equalsIgnoreCase("Eraser")){  
            return new Eraser();  
        }   
      else if(Type.equalsIgnoreCase("Scale")) {  
            return new Scale();  
      }  
  return null;  
}  
}
