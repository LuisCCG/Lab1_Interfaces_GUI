
public class VisThread implements Runnable
{
	private Thread tVis;
	private String threadName;
	
	VisThread( String name)
	{
		threadName = name;
	    System.out.println("Creating " +  threadName );
	}
	
	@Override
	public void run() 
	{
		Visl l1Gui = new Visl();
	}

	public void start ()
	 {
	      System.out.println("Starting: " +  threadName );
	      if (tVis == null)
	      {
	         tVis = new Thread (this, threadName);
	         tVis.start ();
	      }
	 }
}
