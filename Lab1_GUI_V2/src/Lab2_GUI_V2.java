import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab2_GUI_V2 {
	
	private JFrame mainFrame;
	AnalogSignal ASsection;
	DigitalSignal DSsection;
	ControlSection CSyeah;
	
	public static void main(String [] args) 
	{
		Lab2_GUI_V2 myL2GUI = new Lab2_GUI_V2();	
	}
	
	public Lab2_GUI_V2()
	{
		 mainFrame = new JFrame("Lab1 GUI");
	     mainFrame.setSize(900,600);
	     mainFrame.setLayout(new GridLayout(3, 1));
		
	     ASsection = new AnalogSignal();
	     DSsection = new DigitalSignal();
	     CSyeah = new ControlSection();
	     
	     //headerLabel = new JLabel("",JLabel.CENTER );
	      //statusLabel = new JLabel("",JLabel.CENTER);        

	      //statusLabel.setSize(350,100);
	      mainFrame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
		        System.exit(0);
	         }        
	      });    
	      //controlPanel = new JPanel();
	      //controlPanel.setLayout(new FlowLayout());

	      /*mainFrame.add(headerLabel);
	      mainFrame.add(controlPanel);
	      mainFrame.add(statusLabel);*/
	      
	      
	      mainFrame.add(ASsection);
	      mainFrame.add(DSsection);
	      mainFrame.add(CSyeah);
	      mainFrame.setVisible(true);  
	     
	}
}
