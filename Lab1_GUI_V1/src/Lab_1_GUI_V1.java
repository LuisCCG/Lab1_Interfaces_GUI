
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab_1_GUI_V1 extends JFrame
{

	private		JTabbedPane tabbedPane;
	private		JPanel		panel1;
	private		JPanel		panel2;
	private		JPanel		panel3;
	private 	JPanel		bPanelA;
	
	public Lab_1_GUI_V1()
	{
		setTitle( "Lab 1" );
		setSize( 600, 300 );
		setBackground( Color.gray );

		JPanel topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );

		// Create the tab pages
		createPage1();
		createPage2();

		// Create a tabbed pane
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab( "Analog I signal", panel1 );
		tabbedPane.addTab( "Digital I signal", panel2 );
		tabbedPane.addTab( "Output and SS", panel3 );
		topPanel.add( tabbedPane, BorderLayout.CENTER );
	}
	
	public void createPage1()
	{
		panel1 = new JPanel();
		panel1.setLayout( new GridLayout( 4, 2 ) );
		final ButtonGroup AnalogGroup = new ButtonGroup();
		JRadioButton radioButton; 
		
		panel1.add( new JLabel( "Select anlog signal:" ) );
		
		panel1.add(radioButton = new JRadioButton("1", true) );
		radioButton.setActionCommand("1");
		AnalogGroup.add(radioButton);
		panel1.add(radioButton = new JRadioButton("2") );
		radioButton.setActionCommand("2");
		AnalogGroup.add(radioButton);
		panel1.add(radioButton = new JRadioButton("3") );
		radioButton.setActionCommand("3");
		AnalogGroup.add(radioButton);
		panel1.add(radioButton = new JRadioButton("4") );
		radioButton.setActionCommand("4");
		AnalogGroup.add(radioButton);
		panel1.add(radioButton = new JRadioButton("5") );
		radioButton.setActionCommand("5");
		AnalogGroup.add(radioButton);
		panel1.add(radioButton = new JRadioButton("6") );
		radioButton.setActionCommand("6");
		AnalogGroup.add(radioButton);
		panel1.add(radioButton = new JRadioButton("7") );
		radioButton.setActionCommand("7");
		AnalogGroup.add(radioButton);
		panel1.add(radioButton = new JRadioButton("8") );
		radioButton.setActionCommand("8");
		AnalogGroup.add(radioButton);
		
		JButton visB = new JButton("Visualizar");
		panel1.add(visB);
		JButton archB = new JButton("Guardar");
		panel1.add(archB);
		
		
	}
	
	public void createPage2() {
		panel2 = new JPanel();
		panel2.setLayout( new GridLayout( 2, 2 ) );
		final ButtonGroup DigitalGroup = new ButtonGroup();
		JRadioButton radioButton; 
		
		panel2.add( new JLabel( "Select digital signal:" ) );
		
		panel2.add(radioButton = new JRadioButton("1", true) );
		radioButton.setActionCommand("1");
		DigitalGroup.add(radioButton);
		panel2.add(radioButton = new JRadioButton("2") );
		radioButton.setActionCommand("2");
		DigitalGroup.add(radioButton);
		panel2.add(radioButton = new JRadioButton("3") );
		radioButton.setActionCommand("3");
		DigitalGroup.add(radioButton);
		panel2.add(radioButton = new JRadioButton("4") );
		radioButton.setActionCommand("4");
		DigitalGroup.add(radioButton);
		
		JButton visBd = new JButton("Visualizar");
		panel2.add(visBd);
		JButton archBd = new JButton("Guardar");
		panel2.add(archBd);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab_1_GUI_V1 mainFrame	= new Lab_1_GUI_V1();
		mainFrame.setVisible( true );
	}

}
