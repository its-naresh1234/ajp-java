
public class Atmapp{
//	
//	Transactions t;
//	int withdrawAmount;
//	int depositAmount;
//	public Atmapp(Transactions t,int withdrawAmount,int depositAmount ) {
//		super();
//		this.t=t;
//		this.depositAmount=depositAmount;
//		this.withdrawAmount=withdrawAmount;
//	}
//	public void run() {
//		t.withdraw(withdrawAmount);
//		t.deposit(depositAmount);
//	}

	public static void main(String[] args) {
		Transactions ts=new Transactions(22222,2000);
		System.out.println("with account id:"+ts.acc_id);
		Thread t1= new Thread() {
		public void run() {
			ts.withdraw(1000);
			
		}
		};
		t1.start();
		Thread t2= new Thread() {
			public void run() {
				ts.deposit(2000);
				
			}
			};
			t2.start();
		//Atmapp atm=new Atmapp(ts,5000,2000);

	}

}
