
public class DataThread implements Runnable
{
	private Thread tData;
	private String threadName;
	
	DataThread( String name)
	{
		threadName = name;
	    System.out.println("Creating " +  threadName );
	}
	
	@Override
	public void run() 
	{
		DataGen l1Gui = new DataGen();
		double[] arr = l1Gui.DataGenerate(3);
		for (int i=0; i< 3 ; i++)
        {
                System.out.print(arr[i] + " "+i);
 
            System.out.println();
        }
	} 

	public void start ()
	 {
	      System.out.println("Starting: " +  threadName );
	      if (tData == null)
	      {
	    	 tData = new Thread (this, threadName);
	    	 tData.start ();
	      }
	 }
}
