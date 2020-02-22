package moneyManagement;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person me = new Person();
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
	
	}

}
