
import	java.io.*;

public class HippityHoppity {
	public HippityHoppity(int n, int sampleSize) throws IOException
	{
		double [] x = new double [sampleSize];
		for(int i = 0; i<sampleSize;i++)
		{
			x[i] = i;
		}
		double[] y = DataGen.DataGenerate(n,sampleSize);
		String outputFile = "DataAnalog"+String.valueOf(n);
		PrintWriter rada = new PrintWriter(new FileWriter(outputFile));
		for(int j = 0; j< 100 ; j++) 
		{
			rada.println(x[j]+","+y[j]);
		}
		rada.close();
		
	}
}
