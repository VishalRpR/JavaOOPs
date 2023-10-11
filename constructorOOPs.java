
public class constructorOOPs {
	
	public static class person{
		int age;
		String name;
		
		void saysHi() {
			System.out.println(name+" ["+age+"] "+"Says Hi");
		}
		
		//java provides our class default constructor
		person(){
			//constructor
		}
		
		//parameterized
		person(int age,String name){
			this.age=age;
			this.name=name;
		}
	}
	
	

	public static void main(String[] args) {
		person p1 = new person(20,"B");
		
		p1.saysHi();
		
		
	}

}
