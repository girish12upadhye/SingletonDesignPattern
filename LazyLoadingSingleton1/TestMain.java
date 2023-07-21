class LazyLoadingSingleton
{
	private static LazyLoadingSingleton instance ;

	private LazyLoadingSingleton()
	{
	
	}
	
	public static LazyLoadingSingleton getInstance()
	{
		if(instance == null)
		{
			instance = new LazyLoadingSingleton();
		}
		return instance ;
	}
}
class TestMain
{
	public static void main(String args[])
	{
		LazyLoadingSingleton instance1 = LazyLoadingSingleton.getInstance();	
		LazyLoadingSingleton instance2 = LazyLoadingSingleton.getInstance();
		System.out.println(instance1.hashCode());

		System.out.println(instance2.hashCode());
	}
}