public class BlinkerCell extends AbstractCell
{
	
	public BlinkerCell(int r, int c, ConwayWorld w)
	{
		super(r, c, w);
		setIsAlive(true);
	}
	
	public boolean willBeAliveInNextGeneration() 
	{
		
		return (!getIsAlive());
	}

	public AbstractCell cellForNextGeneration()
	{
		setIsAlive(willBeAliveInNextGeneration());
		return this;
	}
	
	public char displayCharacter() {
		char c = '.';
		if (getIsAlive())
		{
			c = '#';
		}
		return c;
	}
}
