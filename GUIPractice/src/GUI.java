import java.awt.FlowLayout; // for the screen layout
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame{
	
	private JLabel myLabel;
	
	public GUI(){
		
		
		
		//This is for the window
		super("This is the title of my window");
		setLayout(new FlowLayout());
		
		//This is for the text
		myLabel = new JLabel("This is the text"); // a label is essentially text
		myLabel.setToolTipText("This will display on hover"); // this will display on hover
		
		System.out.println("Foobar");
		
		//Add the label to window
		add(myLabel);
		
	}

}
