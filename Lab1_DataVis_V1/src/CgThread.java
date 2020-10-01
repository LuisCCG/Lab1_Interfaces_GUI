
public class CgThread implements Runnable
{
	private Thread tControl;
	private String threadName;
	
	CgThread( String name)
	{
		threadName = name;
	    System.out.println("Creating " +  threadName );
	}
	
	@Override
	public void run() 
	{
		ControlGui l1Gui = new ControlGui();
	}

	public void start ()
	 {
	      System.out.println("Starting: " +  threadName );
	      if (tControl == null)
	      {
	    	 tControl = new Thread (this, threadName);
	         tControl.start ();
	      }
	 }
}
