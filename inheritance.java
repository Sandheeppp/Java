package courseUd;

class account{
	private int accNum;
	private String name;
	private String address;
	private long phNum;
	private String dob;
	protected double balance;
	

	public int getAccNum() {
		return accNum;
	}


	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhNum() {
		return phNum;
	}


	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public double getBalance() {
		return balance;
	}

	public account() {
	}
	
	public account(int accNum, String name, double balance) {
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
	}
	
	public void getDetails() {
		System.out.println("Account number : "+accNum);
		System.out.println("Name : "+name);
		System.out.println("Bbalance :"+balance);
	}
}

class savingsAcc extends account{
	private double balance;
	
	public savingsAcc(double openingBalance) {
		this.balance = openingBalance;
	}
	
	public void deposit(double amt) {
		balance += amt;
		System.out.println("Deposited : "+balance);
	}
	
	public void withdraw(double amt) {
		if(amt<=balance)
		{
			balance -= amt;
			System.out.println("Withdrawn : "+amt);
	}else {
			System.out.println("Insufficent Balance. ");
		}
	}
	public double checkBalance() {
		return balance;
	}
 
    public double calculateInterest(double rate) {
        return (balance * rate) / 100;
    }
}

class loanAcc extends account{
	private double loanAmt;
	
	public loanAcc(double loanAmt){
		this.loanAmt = loanAmt;
	}
    public double interestDue(double rate) {
        return (loanAmt * rate) / 100;
    }
    public double loanBalance() {
        return loanAmt;
    }
    public void payEmi(double amt) {
        loanAmt -= amt;
        System.out.println("EMI Paid: " + amt);
    }
	
}

public class inheritance {

	public static void main(String[] args) {
        savingsAcc s = new savingsAcc(5000);
        s.setAccNum(101);
        s.setName("Arjun");
        s.setAddress("Bangalore");
        s.setPhNum(9876543210L);

        s.getDetails();
        s.deposit(1500);
        s.withdraw(2000);
        System.out.println("Balance: " + s.getBalance());

        loanAcc l = new loanAcc(200000);
        l.setAccNum(202);
        l.setName("Rahul");

        l.getDetails();
        l.payEmi(5000);
        System.out.println("Loan Balance: " + l.loanBalance());
  
	}

}
