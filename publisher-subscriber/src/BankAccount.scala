class BankAccount extends Publisher
{
  
  private var balance = 0
  
  def deposit(amt : Int) : Unit = {
      if(amt > 0) {
        balance = balance + amt
      }
      publish()
  }
  
  def withdraw(amt : Int) : Unit = {
      if(0 < amt && amt <= balance) {
          balance = balance - amt
          publish()
      }
      else throw new Error("Insufficient funds.")
      
  }
  
  def currBalance = balance

}