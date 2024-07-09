package java_basics;

import java.util.Scanner;


class ATM {
	
	float Balance ;
	
	int PIN = 2345;
	
	public void checkPin() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your PIN:");
	    int enteredPin = sc.nextInt();
	    
	    if (enteredPin == PIN) {
	    	menu();
	    }else {
	    	System.out.println("Invalid Pin!,Please enter a valid Pin.");
	    }
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==============MENU===============");
		System.out.println("1. CHECK YOUR A/C BALANCE");
		System.out.println("2. DEPOSIT MONEY");
		System.out.println("3. WITHDRAW MONEY");
		System.out.println("4. EXIT");
		
		int option = sc.nextInt();
		
		
		if(option == 1) {
			checkBalance();
		} else if (option == 2) {
			depositMoney();
		}else if (option == 3) {
			withdrawMoney();
		}else if (option == 4) {
			return;
		}else {
			System.out.println("Invalid Option!, Please enter an Valid Option");
		}
		
	}
	
	public void checkBalance() {
		System.out.println("Your current Balance:" + Balance);
		menu();
	}
	
	public void depositMoney() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Amount To Be Deposited:");
		float amount = sc.nextFloat();
		
		Balance = Balance +amount;
		
		System.out.println("Money has deposited succesfully :)");
		
		menu();
	}
	
	public void withdrawMoney() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Amount to Be Withdrawn:");
		float amount = sc.nextFloat();
		
		if (amount > Balance) {
			System.out.println("Insufficent funds :(");
		}else {
			Balance = Balance - amount ;
			
			System.out.println("Money has withdrawn succesfully ");
		}
		menu();
		}
	
	public void EXIT() {
		
	}
	
	public class ATMachine {
		
		public static void main(String args []) {
			
			ATM obj = new ATM ();
			
			obj.checkPin();
		}
	}
}