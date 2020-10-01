import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DigitalSignal extends JPanel
{
	public DigitalSignal()
	{
		 //JPanel panel = new JPanel();
	    this.setBorder(BorderFactory.createTitledBorder("Digital Signal"));
	    this.setSize(300,300);
	    GridLayout layout = new GridLayout(0,2);

	    this.setLayout(layout);        
	    final ButtonGroup DigitalGroup = new ButtonGroup();
		JRadioButton radioButton; 
		
	    this.add(radioButton = new JRadioButton("1", true));
	    radioButton.setActionCommand("1");
	    DigitalGroup.add(radioButton);
		this.add(radioButton = new JRadioButton("2"));
	    radioButton.setActionCommand("2");
	    DigitalGroup.add(radioButton);
		this.add(radioButton = new JRadioButton("3"));
	    radioButton.setActionCommand("3");
	    DigitalGroup.add(radioButton);
		this.add(radioButton = new JRadioButton("4"));
	    radioButton.setActionCommand("4");
	    DigitalGroup.add(radioButton);
	    JButton visu = new JButton("Visualize");
	    this.add(visu); 
	    JButton save = new JButton("Archive");
	    this.add(save);
		
	    visu.addActionListener(new ActionListener()
	    {
	    	public	void	actionPerformed(ActionEvent ae) 
	    	{
	    		String sigNum = DigitalGroup.getSelection().getActionCommand();
	    		System.out.println("Digital signal selected: "+sigNum);
	    	}
	    	
	    }
	    );
	    save.addActionListener(new ActionListener()
	    {
	    	public	void	actionPerformed(ActionEvent ai) 
	    	{
	    		String sigNumb = DigitalGroup.getSelection().getActionCommand();
	    		System.out.println("Digital signal selected: "+sigNumb);
	    	}
	    	
	    }
	    );
	    
	}
}
