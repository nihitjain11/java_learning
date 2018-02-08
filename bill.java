class Main {
	public static void main(String args[]){
		Bill a = new Bill(250);
		a.receipt(50);
		a.receipt(300);
		a.receipt(123456789012L,1234); 
		//need to add L explicitly in card_no to pass value as long and not as int
		System.out.println("");
	}
}
class Bill{
	double bill_amount, amount, balance;
	
	public void receipt(double amount){
		if (amount<bill_amount){
			System.out.println("\nInsufficient Amount\nAmount Paid = Rs."+amount);
			System.out.println("Bill Amount = Rs."+bill_amount);
		}
		else{
			System.out.println("\n**Bill Receipt**");
			System.out.println("Mode of Payment: Cash");
			balance = amount-bill_amount;
			System.out.println("Bill Amount: Rs."+bill_amount);
			System.out.println("Amount Paid: Rs."+amount);
			System.out.println("Amount Returned: Rs."+balance);
		}
	}
	public void receipt(long card_no,int pin){
		System.out.println("\n**Bill Receipt**");
		System.out.println("Mode of Payment: Debit Card");
		System.out.println("Card No.: "+card_no);
		System.out.println("Bill Amount: Rs."+bill_amount);
		System.out.println("Amount Paid: Rs."+bill_amount);
	}
	Bill(double a){
		bill_amount = a;
	}
}