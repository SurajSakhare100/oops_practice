package oops_day1;
// inhertance
class poly{
	String name;
	double age;
	public void info(String name) {
		System.out.println(name);
	}
	public void info(double age) {
		System.out.println(age);
	}
	public void info(String name,double age) {
		System.out.println(name+" "+ age);
	}
	public double info() {
		double c=age+1;
		return c;
	}
}

	class shape {
		public void area() {
			System.out.println("display area:");
		}
	}
	class Triangle extends shape {
		public void area() {
			System.out.println("HELLO");
		}
	}

public class constructor {

public static void main(String[] args) {
		
		//polymorphism
//		poly p1=new poly();
//		p1.name="suraj";
//		p1.age=12.0;
//		p1.info(p1.age);
//		p1.info(p1.name);
//		p1.info(p1.name,p1.age);
//		System.out.println(p1.info());
		
//.........................................................//
		
		//inheritance
//		inheritance i1=new inheritance();
//		Triangle t1 =new Triangle();
//		t1.area();
    
	}

}
