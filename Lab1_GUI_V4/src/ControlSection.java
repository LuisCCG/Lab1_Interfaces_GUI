import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlSection extends JPanel
{
	public String sampleSpeed="1";
	
	public ControlSection()
	{
	this.setBorder(BorderFactory.createTitledBorder("Control Panel"));
    this.setSize(300,300);
    GridLayout layout = new GridLayout(0,2);
    this.setLayout(layout); 
    final ButtonGroup DigOutSig = new ButtonGroup();
	JRadioButton radioButton; 
    
    this.add(new JLabel("Curren Sample Speed:"));
    JLabel sampS = new JLabel();
    sampS.setText(sampleSpeed);
    this.add(sampS);
    JTextField Sspeed = new JTextField("",10);
    this.add(Sspeed);
    JButton setIt = new JButton("Set");
    this.add(setIt);
    this.add(new JLabel("Select digital signal"));
    this.add(new JLabel("output"));
    
    this.add(radioButton = new JRadioButton("1", true));
    radioButton.setActionCommand("1");
    DigOutSig.add(radioButton);
	this.add(radioButton = new JRadioButton("2"));
    radioButton.setActionCommand("2");
    DigOutSig.add(radioButton);
	this.add(radioButton = new JRadioButton("3"));
    radioButton.setActionCommand("3");
    DigOutSig.add(radioButton);
	this.add(radioButton = new JRadioButton("4"));
    radioButton.setActionCommand("4");
    DigOutSig.add(radioButton);
    
    JButton digOutSel = new JButton("Digital Out");
    this.add(digOutSel);
    
    setIt.addActionListener(new ActionListener() 
    {	
    	public	void	actionPerformed(ActionEvent ae) 
    	{
    		sampS.setText(Sspeed.getText());
    	}
    }
    );
    
    digOutSel.addActionListener(new ActionListener() 
    {	
    	public	void	actionPerformed(ActionEvent ai) 
    	{
    		String sigNum = DigOutSig.getSelection().getActionCommand();
    		System.out.println("Digital signal selected out: "+sigNum);
    	}
    }
    );
	}
}
