import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlSection extends JPanel
{
	public boolean d1S = false;
	public boolean d2S = false;
	public boolean d3S = false;
	public boolean d4S = false;
	
	public ControlSection()
	{
	this.setBorder(BorderFactory.createTitledBorder("Digital Outputs"));
    this.setSize(300,300);
    GridLayout layout = new GridLayout(0,2);
    this.setLayout(layout); 
    
    
    JButton dOut1 = new JButton("D1");
    this.add(dOut1);
    JButton dOut2 = new JButton("D2");
    this.add(dOut2);
    JButton dOut3 = new JButton("D3");
    this.add(dOut3);
    JButton dOut4 = new JButton("D4");
    this.add(dOut4);
    
    
    
    dOut1.addActionListener(new ActionListener() 
    {	
    	public	void	actionPerformed(ActionEvent a1) 
    	{
    		if(!d1S) 
    		{
    			System.out.println("Digital out 1: ACTIVE");
    			d1S = true;
    		}else if(d1S) 
    		{
    			System.out.println("Digital out 1: INACTIVE");
    			d1S = false;
    		}
    		
    	}
    }
    );
    dOut2.addActionListener(new ActionListener() 
    {	
    	public	void	actionPerformed(ActionEvent a2) 
    	{
    		if(!d2S) 
    		{
    			System.out.println("Digital out 1: ACTIVE");
    			d2S = true;
    		}else if(d2S) 
    		{
    			System.out.println("Digital out 1: INACTIVE");
    			d2S = false;
    		}
    	}
    }
    );
    dOut3.addActionListener(new ActionListener() 
    {	
    	public	void	actionPerformed(ActionEvent a3) 
    	{
    		if(!d3S) 
    		{
    			System.out.println("Digital out 1: ACTIVE");
    			d3S = true;
    		}else if(d3S) 
    		{
    			System.out.println("Digital out 1: INACTIVE");
    			d3S = false;
    		}
    	}
    }
    );
    dOut4.addActionListener(new ActionListener() 
    {	
    	public	void	actionPerformed(ActionEvent a4) 
    	{
    		if(!d4S) 
    		{
    			System.out.println("Digital out 1: ACTIVE");
    			d4S = true;
    		}else if(d4S) 
    		{
    			System.out.println("Digital out 1: INACTIVE");
    			d4S = false;
    		}
    	}
    }
    );
	}
}
