class Consolidator(observed : List[BankAccount]) extends Subscriber
{
      private var total : Int = _
      observed.foreach { _.subscribe(this) } 
      
    
}