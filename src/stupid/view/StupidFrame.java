package stupid.view;

import javax.swing.JFrame;

import stupid.controller.StupidController;

@SuppressWarnings("serial")
public class StupidFrame extends JFrame
{
	@SuppressWarnings("unused")
	private StupidController baseController;
	@SuppressWarnings("unused")
	private StupidPanel basePanel;
	
	
	public StupidFrame(StupidController baseController)
	{
		this.baseController = baseController;
		basePanel = new StupidPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setVisible(true);
		
	}


}
