package keyWords;
class collegeDetails{//Declare two classes
	int department_id;
	String college_name;
	public collegeDetails(int department_id,String college_name) {
		Super();
		this.college_name=college_name;
		this.department_id=department_id;
	}
	private void Super() {
		// TODO Auto-generated method stub
		
	}
}

public class College extends collegeDetails {
	public College(int department_id, String college_name) {
		super(department_id, college_name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		
		College d=new College(101,"AV");
		System.out.println(d.department_id+" "+d.college_name);
		
	}
	
	
		
	

}
