package moneyManagement;

public class Expense {
	public static void mobile(Person person, int ...x) {
		if(x.length == 0) getAmt();
	}
	public static void food(Person person, int ...x) {
		if(x.length == 0) getAmt();
	}
	public static void petrol(Person person, int ...x) {
		if(x.length == 0) getAmt();
	}
	public static void misc(Person person, int ...x) {
		if(x.length == 0) getAmt();
	}
	public static double total_exp() {
		System.out.println("Total House Expense Is : "  + exp);
		return exp;
	}
	private static double exp;
	private static void getAmt(){
		double temp;
		System.out.println("Enter the amount spend : ");
		temp = Alpha.sc.nextDouble();
		Alpha.sc.nextLine();
		exp += temp;
	}
}
