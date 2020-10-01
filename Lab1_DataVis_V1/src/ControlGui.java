import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlGui extends JPanel{
	private JFrame mainFrame;
	
	
	public ControlGui() 
	{
		
		mainFrame = new JFrame("Data trial GUI");
	    mainFrame.setSize(300,150);
	    mainFrame.setLayout(new GridLayout(3, 1));
	    
	    JButton dataA = new JButton("Generate Data");
	    mainFrame.add(dataA);
	    JButton visD = new JButton("Visualize Data");
	    mainFrame.add(visD);
	    
	    
	    mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
		        System.exit(0);
	         }        
	      });
	    dataA.addActionListener(new ActionListener()
	    {
	    	public	void	actionPerformed(ActionEvent ae) 
	    	{
	    		DataThread Dt = new DataThread( "Data");
	    		Dt.start();
	    	}
	    	
	    }
	    );
	    visD.addActionListener(new ActionListener()
	    {
	    	public	void	actionPerformed(ActionEvent ai) 
	    	{
	    		VisThread Vt = new VisThread( "Visual");
	    		Vt.start();
	    	}
	    	
	    }
	    );
	    mainFrame.setVisible(true);
	}
}
