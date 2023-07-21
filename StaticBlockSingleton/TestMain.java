class StaticBlockSingleton
{
/*	Static Block Initialization Implementation Is Similar To Eager Initialization Except That Instance Of Class Is Created Inside Static Block And Provide Option For Exception Handling . */
	private static StaticBlockSingleton INSTANCE;
	
	private StaticBlockSingleton()
	{}
	
	static
	{
		try
		{
			if(INSTANCE == null)
			{
				INSTANCE = new StaticBlockSingleton();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static StaticBlockSingleton getInstance()
	{
		return INSTANCE ;
	}
}
class TestMain
{
	public static void main(String args[])
	{
	 	StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}