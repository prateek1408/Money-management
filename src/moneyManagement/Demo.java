package moneyManagement;

public class Demo {
	private String demoName;
	public void startUp() {
		System.out.print("Please enter your E-mail id : ");
		demoName = Alpha.sc.nextLine();
		
		//here some code that will search the database that the user is 
		//present in the database or not..
		//after that it will ask for password if the user is present, else 
		//it will ask to create a new account
		
		//some code........
		
		/*System.out.println("Enter number of members in your family");
		Alpha.sc.nextInt();
		...................................
		*/
		
	}
	public void menu(Person obj) {
		System.out.println("Menu : ------ ");
		System.out.println("1. Add an expense");
		System.out.println("2. Delete an expense");
		System.out.println("3. Show Your monthly expense");
		System.out.println("4. Show total monthly expense");
		System.out.println("Enter your choice : ");
		int ch = Alpha.sc.nextInt();
		switch(ch) {
		case 1  :		
		case 2  : 
		case 3  :
		case 4  :
			Expense.expMenu(obj);
		default :
			System.out.println("Please choose from the available options..");
			System.out.println("Why not You take one more try to choose...");
			menu(obj);
		}
	}
	public static void main(String[] args) {
		new Demo().startUp();
		
		
		
		//int choice = menu();
		
		
		/*Person me = new Person();
		Expense.mobile(me);
		Expense.food(me);
		Expense.petrol(me);
		me.showDetails();
		System.out.println("---------------------------------------------------------");
		
		Person someone0 = new Person("Piyush", 20);
		Expense.mobile(someone0);
		Expense.petrol(someone0);
		Expense.misc(someone0);
		someone0.showDetails();
		System.out.println("---------------------------------------------------------");
		
		Person someone1 = new Person();
		Expense.mobile(someone1);
		Expense.food(someone1);
		Expense.misc(someone1);
		someone1.showDetails();
		Expense.total_exp();
	*/
	}

}
