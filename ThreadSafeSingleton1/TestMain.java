class ThreadSafeSingleton
{
	private static ThreadSafeSingleton instance ;

	private ThreadSafeSingleton()
	{
	}

	public static ThreadSafeSingleton getInstance()
	{
		if(instance == null)
		{
			synchronized(ThreadSafeSingleton.class)
			{
				if(instance == null)
				{
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance ;
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