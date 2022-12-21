package keyWords;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String college_name="AV";  
	        int department_id=4;  
	          
	        switch(college_name)  
	          
	        {  
	        case "BIT":   
	            System.out.println("BIT");  
	            switch(department_id)  
	            {  
	            case 101:  
	                System.out.println("Mechanical Department");  
	                break;  
	            case 102:  
	                System.out.println("Computer Department");  
	                break;  
	            case 103:  
	                System.out.println("Civil Department");  
	                break;  
	            }  
	            break;  
	        case "ITS":  
	            System.out.println("ITS");  
	            switch(department_id)  
	            {  
	            case 101:  
	                System.out.println("Mechanical Department");  
	                break;  
	            case 102:  
	                System.out.println("Computer Department");  
	                break;  
	            case 103:  
	                System.out.println("Civil Department");  
	                break;  
	            }  
	            break;  
	        case "ABS":  
	            System.out.println("ABS");  
	            switch(department_id)  
	            {  
	            case 101:  
	                System.out.println("Mechanical Department");  
	                break;  
	            case 102:  
	                System.out.println("Computer Department");  
	                break;  
	            case 103:  
	                System.out.println("Civil Department");  
	                break;  
	            }  
	            break;  
	      
	        default :  
	            System.out.println("default:--------Check your College Details Gone Wrong--------");  
	     System.out.println(" "+college_name+" "+department_id);
	    College c=new College(department_id,"college_name");
	    System.out.println(c.college_name+"  "+c.department_id);

	}

}}
