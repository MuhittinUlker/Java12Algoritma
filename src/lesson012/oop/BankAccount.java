package lesson012.oop;

/*
 * bir interestrate accountnumber bir de balance özelliklerimiz var
 * 
 * bu sınıfı soyutladıktan sonra bir bankamız için bir faiz oranı belirliyoruz: 0,05
 * 
 * daha sonra faiz getirini hesaplayan bir metod yazalım 
 * 
 * birde getInfo metodu yazalım
 * 
 */
public class BankAccount {

	static final private double INTEREST_RATE=0.05;
	private String accountNumber;
	private double balance;

	
	public BankAccount(String accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public BankAccount(String accountNumber) {
		this();
		this.accountNumber=accountNumber;
	}
	
	public BankAccount() {
		this.balance=100;
	}
	
	
	public double getInteresetRate() {
		return INTEREST_RATE;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double faizGetirisi() {
		return balance * INTEREST_RATE;
	}
	
	public void getInfo() {
		
		System.out.println("=====Hesap Bilgileri=====");
		System.out.println("Hesap Numarası: "+accountNumber);
		System.out.println("Hesap Bakiyesi: "+balance);
		System.out.println("Faiz Oranı: "+INTEREST_RATE);
		System.out.println("1 günlük faiz getirisi: "+ faizGetirisi());
		System.out.println("=========================");
	}

	@Override
	public String toString() {
		return "Banka Hesabı Bilgileri:\nFaiz Oranı=" + INTEREST_RATE + "\nHesap Numarası=" + accountNumber
				+ "\nBakiye=" + balance;
	}

}
