import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DigitalSignal extends JPanel
{
	String sampleTime;
	public int sampleSize = 100;
	public int scapeGoat;
	
	public DigitalSignal()
	{
		 //JPanel panel = new JPanel();
	    this.setBorder(BorderFactory.createTitledBorder("Digital Signal"));
	    this.setSize(300,300);
	    GridLayout layout = new GridLayout(0,2);

	    this.setLayout(layout);        
	    final ButtonGroup DigitalGroup = new ButtonGroup();
		JRadioButton radioButton; 
		
		sampleTime = String.valueOf(sampleSize);
		this.add(new JLabel("Current Sample Time: "));
		JLabel sampleT = new JLabel();
		sampleT.setText(sampleTime);
		this.add(sampleT);
		
		JTextField sSpeedA = new JTextField("",5);
		this.add(sSpeedA);
		
		JButton setIt = new JButton("Set sample time");
		this.add(setIt);
		
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
	    		System.out.println("Analog signal selected: "+DigitalGroup.getSelection().getActionCommand());
	    		VisThread VtD = new VisThread( "Visual");
	    		VtD.scapeGoat = Integer.parseInt(DigitalGroup.getSelection().getActionCommand());
	    		VtD.sampleSize = sampleSize;
	    		VtD.start();
	    	}
	    	
	    }
	    );
	    save.addActionListener(new ActionListener()
	    {
	    	public	void	actionPerformed(ActionEvent ai) 
	    	{
	    		System.out.println("Analog signal selected: "+DigitalGroup.getSelection().getActionCommand());
	    		SaveThreadDigital hoppityD = new SaveThreadDigital( "Visual");
	    		hoppityD.scapeGoat = Integer.parseInt(DigitalGroup.getSelection().getActionCommand());
	    		hoppityD.start();
	    	}
	    	
	    }
	    );
	    setIt.addActionListener(new ActionListener() 
	    {	
	    	public	void	actionPerformed(ActionEvent ae) 
	    	{
	    		sampleT.setText(sSpeedA.getText());
	    		sampleSize = Integer.parseInt(sSpeedA.getText());
	    		
	    	}
	    }
	    );
	    
	}
}
