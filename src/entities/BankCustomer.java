package entities;

public class BankCustomer {
	
	private int idCustomer;
	private String name;
	private double accountBalance;
	
	public BankCustomer() {
		
	}
	
	public BankCustomer(int idCustomer, String name, double accountBalance) {
		this.idCustomer = idCustomer;
		this.name = name;
		this.accountBalance = accountBalance;
	}
	
	public BankCustomer(int idCustomer, String name) {
		this.idCustomer = idCustomer;
		this.name = name;
	}
	
	public int getIdCustomer() {
		return idCustomer;
	}
	
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public double increaseValue(double valueToIncrease) {
		return accountBalance += valueToIncrease;
	}
	
	public double decreaseValue(double valueToDecrease) {
		return accountBalance -= valueToDecrease - 5.00;
	}
	
	public String toString() {
		return "ID Customer = " + idCustomer 
				+ ", Name = " + name 
				+ ", Account Balance = " + String.format("%.2f", accountBalance);
				
	}

}
