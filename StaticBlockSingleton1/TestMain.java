class StaticBlockSingleton
{
	private static StaticBlockSingleton instance ;
	
	private StaticBlockSingleton()
	{
	
	}
	static
	{
		try
		{
			if(instance == null)
			{
				instance = new StaticBlockSingleton();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static StaticBlockSingleton getInstance()
	{
		return instance ;
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