package entities;

public class BankCustomer {
	
	private int idCustomer;
	private String name;
	private double initialDeposit;
	private double accountBalance;
	
	public BankCustomer(int idCustomer, String name, double initialDeposit) {
		this.idCustomer = idCustomer;
		this.name = name;
		this.initialDeposit = initialDeposit;
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

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	
	public 

}