package oops;
abstract class Animal{
	abstract void walk();
}
class Horse extends Animal{
    public void walk(){
		System.out.println("walk on 4 legs");
	}
}
class Shaturmurg extends Animal{
    public void walk(){
		System.out.println("walk on 2 legs");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
