import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;


public class Visl {
	public Visl(int n,int sampleSize) 
	{
		double [] x = new double [sampleSize];
		for(int i = 0; i<sampleSize;i++)
		{
			x[i] = i;
		}
		double[] y = DataGen.DataGenerate(n,sampleSize);
		
		final XYChart chart = QuickChart.getChart("DataExample", "Xs", "Ys", "Guess what", x, y);
		final SwingWrapper<XYChart> sw = new SwingWrapper<XYChart>(chart);
	    sw.displayChart();
	}
	
}
