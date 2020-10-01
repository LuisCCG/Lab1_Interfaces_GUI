
public class DataGen 
{
	public static double[] DataGenerate(int sampleSize)
	{
	
	double [] ydata = new double[sampleSize];
	for(int i = 0; i<sampleSize; i++)
	{	 
		ydata[i] = Math.random()*5;
	}
	return ydata; 
	}
}
