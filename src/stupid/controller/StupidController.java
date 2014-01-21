package stupid.controller;

import stupid.model.StupidGUI;
import stupid.view.StupidFrame;

public class StupidController
{
	@SuppressWarnings("unused")
	private StupidFrame appFrame;
	
	private StupidGUI appBot;
	
	public StupidController()
	{
		appBot = new StupidGUI();
	}

	public void Start()
	{
		appFrame = new StupidFrame(this);
		
	}

	public StupidGUI getAppBot()
	{
		// TODO Auto-generated method stub
		return appBot;
	}
}
