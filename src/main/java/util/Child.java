package util;

public class Child extends Parent {
	
	@Override
	public SavingAccount getAccount() {
		return new SavingAccount();
	}

}

/*Override condition
1. Modifier: should be same or higher visibility.
2. Return type: should be same or child class of parent return type
3. Method name: should be same.
4. args: should be same.
*/
