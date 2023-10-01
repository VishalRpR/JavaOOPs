
public class classAndObject {
	
	public static class person{
		int age;
		String name;
		
		void saysHi() {
			System.out.println(name+" ["+age+"] "+"Says Hi");
		}
	}

	public static void main(String[] args) {
		person p1 = new person();
		p1.name="A";
		p1.age=10;
		
		
		person p2= new person();
		p2.name="B";
		p2.age=20;
	
		
//		person p3=p1;
//		p3.age =30;
//		p1.saysHi();
//		p3.saysHi();
		
		p1.saysHi();
		p2.saysHi();
		swap1(p1,p2);
		p1.saysHi();
		p2.saysHi();

	}
	
	public static void swap1(person psn1,person psn2){
		person temp=psn1;
		psn1=psn2;
		psn2=temp;
		
		
	}
	
	

}
