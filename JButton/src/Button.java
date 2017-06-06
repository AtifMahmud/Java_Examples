
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;

// extends JFrame as all the other GUI tutorials
public class Button extends JFrame {
	
	private JButton ButtonOne;
	private JButton ButtonTwo;
	
	public Button (){
		super("This is my window"); // this is a constructor for JFrame
		setLayout(new FlowLayout());
		
		ButtonOne = new JButton("This is my button"); // the argument is the text that goes here
		add(ButtonOne);
		
		// NOTE: Bucky uses icons here, but I don't need it now. So I skipped that part
		
		// Similar to Event Handling
		
		HandlerClass Handler = new HandlerClass();
		
		ButtonOne.addActionListener(Handler);
		
	}

	private class HandlerClass implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if(event.getSource()==ButtonOne){
				JOptionPane.showMessageDialog(null, "You clicked ButtonOne");
			}
		}
	}
}
