class EgerLoadingSingleton
{
	private static final EgerLoadingSingleton INSTANCE = new EgerLoadingSingleton();
	
	private EgerLoadingSingleton()
	{
		
	}

	public static EgerLoadingSingleton getInstance()
	{
		return INSTANCE ;
	}
}
class TestMain
{
	public static void main(String args[])
	{
		EgerLoadingSingleton instance1 = EgerLoadingSingleton.getInstance();
		EgerLoadingSingleton instance2 = EgerLoadingSingleton.getInstance();
		System.out.println(instance1.hashCode());

		System.out.println(instance1.hashCode());
	}
}