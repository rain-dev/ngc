public class NGC2CPPFactory 
{
	public static String INCLUDE = " #include <type_traits> ";
	public static String FORWARD = " template <unsigned long, bool> struct __ngc_container__; ";
	
	private static NGC2CPPFactory instance = null;
   
	private int selectionStatementIndex;
   
	private NGC2CPPFactory() 
   	{
		this.selectionStatementIndex = -1;
   	}
   
  	public static NGC2CPPFactory getInstance() 
  	{
  		if(instance == null) 
  			instance = new NGC2CPPFactory();
  		return instance;
  	}

  	public int getSelectionStatementIndex() 
  	{
  		selectionStatementIndex++;
  		return selectionStatementIndex;
  	}
}