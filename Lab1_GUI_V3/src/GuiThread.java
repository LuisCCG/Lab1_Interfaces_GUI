
public class GuiThread implements Runnable
{
	private Thread t;
	private String threadName;
	
	GuiThread( String name)
	{
		threadName = name;
	    System.out.println("Creating " +  threadName );
	}
	
	@Override
	public void run() 
	{
		InitGUI l1Gui = new InitGUI();
	}

	public void start ()
	 {
	      System.out.println("Starting: " +  threadName );
	      if (t == null)
	      {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	 }
}
