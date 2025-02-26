class BankAccount
{
   String n;
    double bal;
    int acno;
  BankAccount(String a, int b) //constructor
  {
      n=a;
      acno=b;
      bal=500;
  }
  public void Deposit(double   amount)
    {
        if (amount > 0)
            bal += amount;
    } // end of Deposit()
  public void Withdraw(double   amount)
    {
        if (amount > 0 && amount <= bal)
            bal -=   amount;
            else
            System.out.println("Sorry, not enough balance");
    } // end of withdraw()
  public void Balance()
    {
        System.out.println(" Account Number = "+acno);
        System.out.println(" name = "+n);
        System.out.println(" Balance = " + bal ) ;
    } // end of Balance()
}//end of class


/*  BankAccount(String a)
    {
        n=a;
        bal=500;
    } */
