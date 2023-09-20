
public class Main {
    public static void main(String[] args) {
        Personal Account pa = new PersonalAccount(650000,"Aizirek Ibraimova");
        pa.deposit(25000);
        pa.deposit(10000);
        pa.withdraw(4000);
        pa.withdraw(1000);
        System.out.println(pa.getBalance());
        pa.printTransactionHistory();
    }
}