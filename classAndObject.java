
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
//		swap2(p1,p2);
		swap3(p1,p2);
		p1.saysHi();
		p2.saysHi();

	}
	
	public static void swap1(person psn1,person psn2){
		person temp=psn1;
		psn1=psn2;
		psn2=temp;
		
		
	}
	
	public static void swap2(person psn1,person psn2){
		int age=psn1.age;
		psn1.age=psn2.age;
		psn2.age=age;
		
		String name=psn1.name;
		psn1.name=psn2.name;
		psn2.name=name;
		
		
	}
	
	public static void swap3(person psn1,person psn2) {
		psn1=new person();
		int age=psn1.age;
		psn1.age=psn2.age;
		psn2.age=age;
		
		psn2=new person();
		
		String name =psn1.name;
		psn1.name=psn2.name;
		psn2.name=name;
		
	}
	
	
	
	

}
