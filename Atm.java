package atm;
import java.util.*;

/*The screen should print out just like the ATMs you've used in real life. It should prompt you to 
 * enter your account number (since we can't insert the card) and enter your PIN.*/

public class Atm {
	public  int acc_num;
	public int acc_pin;
	
	public Account Take_input()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter your account number:");
		acc_num = scn.nextInt();
		System.out.println("Please enter your PIN:");
		acc_pin = scn.nextInt();
		
		Account a=new Account(acc_num,"Adam",2400,acc_pin);
		a.setaccnt_num(acc_num);
		a.setpin_num(acc_pin);
		return a;
		
	}
	
	public boolean validate(int account_num,int pin)
	{
		int accnt_num = 53211235;
		int acc_pin = 3845;
		
		if(accnt_num==account_num && acc_pin==pin)
		{
			return true;
				
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String[] args)
	{
		Atm a = new Atm();
		int i;
		for(i=0; i<=3;i++)
		{
			if(i==3)
			{
				System.out.println("Sorry You can't do transactions");
				break;
			}
			Account a1 = a.Take_input();
			if(a.validate(a1.getaccnt_num(),a1.getpin_num())==true)
			{
				System.out.println("To check balance press 1,To withdraw press 2,To deposit press 3");
				Scanner scn = new Scanner(System.in);
				int check = scn.nextInt();
				if(check==1)
				{
					System.out.println("balance :" +a1.getbalance_num());
				}
				if(check==2)
				{
					System.out.println("input the amount to withdraw");
					int amount = scn.nextInt();
					a1.withdraw(amount);
					System.out.println("balance :" +a1.getbalance_num());
				}
				if(check==3)
				{
					System.out.println("input the amount to deposit");
					int amount = scn.nextInt();
					a1.deposit(amount);
					System.out.println("balance :" +a1.getbalance_num());
				}
				break;
			}
			else
				continue;

			
			
		}
	}

}
