import javax.swing.JFrame;


public class ActualMain {
	
	public static void main(String[] args){
	
		// Make the object
		Main MyGUI = new Main();
		
		
		MyGUI.setSize(300,300); // Set the size
		MyGUI.setVisible(true); // Set Visibility
		
		/*
		 * the import was made for this
		 * set to exit on clicking exit
		 */
		MyGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
					
		
	}

}
