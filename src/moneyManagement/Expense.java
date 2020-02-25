package moneyManagement;

public class Expense {
	public static void expMenu(Person obj) {			// User can choose what type of expense is this and 
														//after determining it will transfer to the respected method
		System.out.println("Menu : ------ ");
		System.out.println("1. Mobile Expense");
		System.out.println("2. Food Expense");
		System.out.println("3. Petrol Expense");
		System.out.println("4. Miscellaneous Expense");
		System.out.println("Enter your choice : ");
		int ch = Alpha.sc.nextInt();
		switch(ch) {
		case 1  :		mobile(obj);
		case 2  : 		food(obj);
		case 3  :		petrol(obj);
		case 4  :		misc(obj);
		default :
			System.out.println("Please choose from the available options..");
			System.out.println("Why not You take one more try to choose...");
			expMenu(obj);
		}
	}
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
