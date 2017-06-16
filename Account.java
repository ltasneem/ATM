package atm;

/*
 * contains the account number, user name, balance,PIN. Deposits and withdraws must update the balance.
 */
public class Account {
	private int account_num;
	private String username;
	private double balance;
	private int pin;
	
	public Account(int accnt_num,String usrname,double balnce, int pn)
	{
		account_num = accnt_num;
		username= usrname;
		balance=balnce;
		pin=pn;
		
	}
	
	public int getaccnt_num()
	{
		return account_num;
	}
	
	public int getpin_num()
	{
		return pin;
	}
	
	public double getbalance_num()
	{
		return balance;
	}
	
	public void setaccnt_num(int acc)
	{
		account_num=acc;
	}
	
	public void setpin_num(int pn)
	{
		pin=pn;
	}
	
	public void setbalance_num(double bl)
	{
		balance=bl;
	}
	
	public void deposit (int amount)
	{
		balance += amount;
	}
	
	
	
	public void withdraw (int amount)
	{
		balance -= amount;
	}
	
}
