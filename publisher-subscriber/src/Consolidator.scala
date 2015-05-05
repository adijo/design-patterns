class Consolidator(observed : List[BankAccount]) extends Subscriber
{
      private var total : Int = _
      observed.foreach { _.subscribe(this) } 
      compute
      
      def handle(pub : Publisher) = compute()
      
      private def compute() : Unit = {
          total = observed.map(_.currBalance).sum
      }
      
      def totalBalance = total
}