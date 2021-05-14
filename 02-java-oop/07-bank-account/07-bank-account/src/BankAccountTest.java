public class BankAccountTest {
    public static void main(String[] args){
        System.out.println("\n------------Account1-Summary:--------------\n");
        
        BankAccount accnt1 = new BankAccount();
        
        accnt1.deposit(500.27, "savings");
        accnt1.deposit(2500.38, "checking");
        accnt1.withdraw(2800, "checking");
        accnt1.totalInAccnts();
        accnt1.deposit(3000.98, "checking");
        accnt1.getCheckingAccntBal();
        accnt1.getSavingsAccntBal();

        System.out.println("\n-------------Account2-Summary:--------------\n");
        
        BankAccount accnt2 = new BankAccount();

        accnt2.deposit(5135.72, "checking");
        accnt2.deposit(872.21, "savings");
        accnt2.totalInAccnts();
        accnt2.withdraw(8041.17, "checking");
        accnt2.withdraw(804.17, "checking");
        accnt2.getCheckingAccntBal();
        accnt2.getSavingsAccntBal();

        System.out.println("\n-----------------Accounts:------------------\n");
        BankAccount.numOfAccnts();

    
    }
}