
import	java.io.*;

public class SaveThread implements Runnable
{
	private Thread hippity;
	private String threadName;
	public int scapeGoat;
	public int sampleSize;
	
	SaveThread( String name)
	{
		threadName = name;
	    System.out.println("Creating " +  threadName );
	}
	
	@Override
	public void run() 
	{
		int i = scapeGoat;
		int k = sampleSize;
		try {
		HippityHoppity tData = new HippityHoppity(i,sampleSize);
		}catch(IOException e) 
		{
			System.out.println("ERROR ERROR");
		}
	}

	public void start ()
	 {
	      System.out.println("Starting: " +  threadName );
	      if (hippity == null)
	      {
	    	  hippity = new Thread (this, threadName);
	    	  hippity.start ();
	      }
	 }
}

