
public class Transactions {
	 int acc_id;
	 int balance;
	 public Transactions(int acc_id,int balance) {
		 super();
		 this.acc_id=acc_id;
		 this.balance=balance;
		 
	 }
	 synchronized  void withdraw(int amount) {
		 if(amount>balance) {
			 try {
				 wait();
				 
			 }catch(InterruptedException e) {
				 System.out.println(e);
			 }
		 }
		 balance-=amount;
			 System.out.println("amount withdraw success now balance :"+balance);
      }
	 synchronized  void deposit(int amount) {
		 balance+=amount;
		 System.out.println("deposit success:"+amount);
		 System.out.println("total balance:"+balance);
		 notify();
    	  
      }
}
