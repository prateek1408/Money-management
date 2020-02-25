package moneyManagement;

public class Person {
	public Person(){
		System.out.print("Enter your shubh name : ");
		this.name = Alpha.sc.nextLine();
		System.out.print("Enter how old are you : ");
		this.age = Alpha.sc.nextByte();
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void showDetails() {
		System.out.println("Your name is : "+this.name);
		System.out.println("Your age is : "+this.age);
		}
	private String name;
	private int age;
}
