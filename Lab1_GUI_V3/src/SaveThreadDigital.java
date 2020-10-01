
import	java.io.*;

public class SaveThreadDigital implements Runnable
{
	private Thread hippity;
	private String threadName;
	public int scapeGoat;
	public int sampleSize;
	
	SaveThreadDigital( String name)
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
		HippityHoppityDee tData = new HippityHoppityDee(i,k);
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
