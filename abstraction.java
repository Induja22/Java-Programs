class abstraction{
        public static void main(String args[])
        {
            sample o = new sample();
            System.out.println("Balance: " + o.getBalance());
            o.deposit(5000);
            System.out.println("Balance: " + o.getBalance());
        }
}
class sample{
    private double balance = 1000.0;
    double getBalance()
    {
        return balance;
    }
    void deposit(double amount)
    {
        balance += amount;
    }
}