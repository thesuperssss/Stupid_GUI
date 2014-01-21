package stupid.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import stupid.controller.StupidController;
import stupid.model.StupidGUI;

@SuppressWarnings("unused")
public class StupidPanel
{

	private StupidController baseController;
	private SpringLayout baseLayout;
	private JButton submitButton;
	private JTextArea stupidTextArea;
	private JScrollPane textPane;


	
	public StupidPanel(StupidController baseController)
	{
		this.baseController = baseController;

		
		baseLayout = new SpringLayout();
		stupidTextArea = new JTextArea(30,10);
		textPane = new JScrollPane(stupidTextArea);		


	}
	
	
//	private void setupPanel()
//	{
//		
//		 this.setLayout(baseLayout);		 
//		 this.setBackground(Color.RED);
//	
//		 this.add(submitChatButton);		 
//		 this.add(userTextField);		
//		 this.add(chatPane);
//
//		 		 
//		 chatArea.setWrapStyleWord(true);
//		 chatArea.setLineWrap(true);
//	}

	private void setupPanel()
	{

	}
	



	private void SetupLayout()
	{
		
	}
}
