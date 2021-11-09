package org.sample;

public class CourseDetails extends Company {

	private void childOne() {
		// TODO Auto-generated method stub
		System.out.println("childOne");
	}
	private void childTwo() {
		// TODO Auto-generated method stub
		System.out.println("childTwo");
	}
	public void parentThree() {
		System.out.println("Overrided child");
	}
	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		//List li = new ArrayList();
		
		
		CourseDetails a = new CourseDetails();
		//all methods in child and parent i can access, overrided logic will execute
//		a.parentOne();
//		a.parentTwo();
//		a.parentThree();
//		a.childOne();
//		a.childTwo();
		Company b = new Company();
		//parent class obj can access only parent class methods
		// child class methods cannot be accessed
		//even though overrided parent class logic only executed
		b.parentOne();
		b.parentTwo();
		b.parentThree();		
		//CourseDetails c = new Company();
		// from child to parent class you cannot ccreate object
		Company d = new CourseDetails();
		//parent to child class i can only access parent class methods
		//child class methods cannot be accessed
		//if overrided child class logic will execute
		d.parentOne();
		d.parentTwo();
		d.parentThree();
	
		
	}

}
