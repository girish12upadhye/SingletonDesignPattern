class EgerLoadingSingleton
{
/*	1). In Eager Initialization The Instance Of Class Will Be Created At Time Of Classloading ItSelf,
	2). As We Know Static Variable Always Instantiated At Classloading Time Itself , 
	3). This Is The Easiest Method To Create Singleton Class ,
	4). But It Has A Drawback That Singleton Is Created Even Though Client Application Might Not Be Using It . 
	5). In Most Of Scinario Singleton Is Created For File System , Database Connection etc. 
	6). In This Method We Cann't Handle Exception */

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
		System.out.println(instance2.hashCode());
	}
}