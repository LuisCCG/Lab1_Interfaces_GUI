import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

public class AnalogSignal extends JPanel
{
	public AnalogSignal()
	{
		 //JPanel panel = new JPanel();
	    this.setBorder(BorderFactory.createTitledBorder("Analog Signal"));
	    this.setSize(300,300);
	    GridLayout layout = new GridLayout(0,2);

	    this.setLayout(layout);        
	    final ButtonGroup AnalogGroup = new ButtonGroup();
		JRadioButton radioButton; 
		
	    this.add(radioButton = new JRadioButton("1", true));
	    radioButton.setActionCommand("1");
		AnalogGroup.add(radioButton);
		this.add(radioButton = new JRadioButton("2"));
	    radioButton.setActionCommand("2");
		AnalogGroup.add(radioButton);
		this.add(radioButton = new JRadioButton("3"));
	    radioButton.setActionCommand("3");
		AnalogGroup.add(radioButton);
		this.add(radioButton = new JRadioButton("4"));
	    radioButton.setActionCommand("4");
		AnalogGroup.add(radioButton);
		this.add(radioButton = new JRadioButton("5"));
	    radioButton.setActionCommand("5");
		AnalogGroup.add(radioButton);
		this.add(radioButton = new JRadioButton("6"));
	    radioButton.setActionCommand("6");
		AnalogGroup.add(radioButton);
		this.add(radioButton = new JRadioButton("7"));
	    radioButton.setActionCommand("7");
		AnalogGroup.add(radioButton);
		this.add(radioButton = new JRadioButton("8"));
	    radioButton.setActionCommand("8");
		AnalogGroup.add(radioButton);
		JButton visu = new JButton("Visualize");
	    this.add(visu); 
	    JButton save = new JButton("Archive");
	    this.add(save);
	    
	    visu.addActionListener(new ActionListener()
	    {
	    	public	void	actionPerformed(ActionEvent ae) 
	    	{
	    		System.out.println("Analog signal selected: "+AnalogGroup.getSelection().getActionCommand());
	    		VisThread Vt = new VisThread( "Visual");
	    		Vt.scapeGoat = Integer.parseInt(AnalogGroup.getSelection().getActionCommand());
	    		Vt.start();	    			
	    	}
	    	
	    }
	    );
	    save.addActionListener(new ActionListener()
	    {
	    	public	void	actionPerformed(ActionEvent ai) 
	    	{
	    		String sigNumb = AnalogGroup.getSelection().getActionCommand();
	    		System.out.println("Analog signal selected: "+sigNumb);
	    	}
	    	
	    }
	    );

	}

}
