
public class VisThread implements Runnable
{
	private Thread tVis;
	private String threadName;
	public int scapeGoat;
	
	VisThread( String name)
	{
		threadName = name;
	    System.out.println("Creating " +  threadName );
	}
	
	@Override
	public void run() 
	{
		int i = scapeGoat;
		
		Visl l1Gui = new Visl(i);
		
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
