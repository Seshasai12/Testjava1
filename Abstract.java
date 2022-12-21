package keyWords;
abstract class Vehicle  
{  
      
        abstract void display();  
        abstract void display(String msg);  
      
}  
class Honda extends Vehicle  
{  
  
    @Override  
    void display() {  
          
        System.out.println("abstract method is invoked");  
    }  
  
    @Override  
    void display(String msg) {  
          
        System.out.println(msg);  
    }  
      
}   


public class Abstract extends Honda {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Abstract abs=new Abstract();
		System.out.println("sd");
		abs.display();
		abs.display("Thismsg is Invoked");

	}

	

	
		
	}


