object Test
{

	val accOne = new BankAccount              //> accOne  : BankAccount = BankAccount@61d22f35
	val accTwo = new BankAccount              //> accTwo  : BankAccount = BankAccount@3e0a1e1f
	
	val consolidator = new Consolidator(List(accOne, accTwo))
                                                  //> consolidator  : Consolidator = Consolidator@43e65667
  consolidator.totalBalance                       //> res0: Int = 0

		accOne deposit 5
		consolidator.totalBalance         //> res1: Int = 5
		accTwo deposit 3
		
		accOne withdraw 1
		
		consolidator.totalBalance         //> res2: Int = 7
}