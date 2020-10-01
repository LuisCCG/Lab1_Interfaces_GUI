
public class DataGen 
{
	public static double[] DataGenerate(int n)
	{
	
	double [] ydata = new double[100];
	for(int i = 0; i<100; i++)
	{	 
		ydata[i] = Math.random()*n;
	}
	return ydata; 
	}
}

