import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;


public class Visl {
	public Visl() 
	{
		double [] x = new double [100];
		for(int i = 0; i<100;i++)
		{
			x[i] = i;
		}
		double[] y = DataGen.DataGenerate(100);
		
		final XYChart chart = QuickChart.getChart("DataExample", "Xs", "Ys", "Guess what", x, y);
		final SwingWrapper<XYChart> sw = new SwingWrapper<XYChart>(chart);
	    sw.displayChart();
	}
}
