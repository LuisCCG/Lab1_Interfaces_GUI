
public class DataGen 
{
	public static double[] DataGenerate(int n, int sampleSize)
	{
	
	double [] ydata = new double[sampleSize];
	for(int i = 0; i<sampleSize; i++)
	{	 
		ydata[i] = Math.random()*n;
	}
	return ydata; 
	}
}

