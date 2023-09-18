public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("1", "Will", 5000);
        Account acc2 = new Account("2", "Michael", 4000);

        System.out.println("Account 1 balance:" + acc1.getBalance());
        System.out.println("Account 2 balance:" + acc2.getBalance());
        System.out.println("");
        acc1.transferTo(acc2, 1000);
        System.out.println("Account 1 new balance:" + acc1.getBalance());
        System.out.println("Account 2 new balance:" + acc2.getBalance());
    }
}