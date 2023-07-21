class ThreadSafeSingleton
{
	private static ThreadSafeSingleton INSTANCE ;
	private ThreadSafeSingleton()
	{ 
	}
	public static ThreadSafeSingleton getInstance()
	{
		if(INSTANCE == null)
		{
			synchronized(ThreadSafeSingleton.class)
			{
				if(INSTANCE == null)
				{
					INSTANCE = new ThreadSafeSingleton() ;
				}
			}
		}
		return INSTANCE ;
	}
}
class TestMain
{
	public static void main(String args[])
	{
		ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}