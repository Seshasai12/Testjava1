
public class MethodOverLoading2 {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			private static final int i = 0;
			private static final String n = null;
			private int id;
			private String name;
			private int age;


			public MethodOverloading() {
				// TODO Auto-generated constructor stub
				 int id;  
				    String name;  
				    int age;
			}
			MethodOverloading(int id,String name){
				 id = i;  
				    name = n;  
				    }  
				    
			MethodOverloading(int i,String n,int a){  
				    id = i;  
				    name = n;  
				    age=a;  
				    }  
				
						
			
			void display() {System.out.println(id+" "+name+" "+age);}
			

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				MethodOverloading m1=new MethodOverloading(101,"sai",21);
				MethodOverloading m2=new MethodOverloading(103,"sesha");
				MethodOverloading m3=new MethodOverloading(21,"NagSai",28);
				m1.display();
				m2.display();
				m3.display();

			}


		}

	}


}
