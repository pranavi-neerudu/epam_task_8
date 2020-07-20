package net.login.sample1.Behavioural_iterator;
public class Collection implements Conatiner{  
public String name[]={"Pranavi", "Smrithi","Nishisha","Taruni","Meghana"};   
       
    public Iterator getIterator() {  
        return new CollectionIterate() ;  
    }  
    private class CollectionIterate implements Iterator{  
        int i;   
        public boolean hasNext() {  
            if (i<name.length){  
                return true;  
            }  
            return false;  
        }   
        public Object next() {  
            if(this.hasNext()){  
                return name[i++];  
            }  
            return null;      
        }  
    }  
}  
  

