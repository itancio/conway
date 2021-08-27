
public class OddEvenNeighbors extends AbstractCell{

	public OddEvenNeighbors(int r, int c, ConwayWorld w) 
	{
		super(r, c, w);
	}

	public boolean willBeAliveInNextGeneration() 
	{
		int nc = neighborCount();
	
		if (nc%2 == 0) {
			return !getIsAlive();
		} 
		else {
			return true;
		}
	}
	
	public AbstractCell cellForNextGeneration() 
	{
		ConwayCell next = new ConwayCell(getRow(), getColumn(), world);
		
		next.setIsAlive(willBeAliveInNextGeneration());
		
		return next;
	}
	
	public int neighborCount() 
	{
		int count = 0;
		
		int row = getRow();
		int column = getColumn();
		
		for (int dr = -1; dr <= 1; dr++) {
			for (int dc = -1; dc <= 1; dc++) {
				if (world.isAlive(row + dr, column + dc) && !(dr == 0 && dc == 0)) {
					count++;
				}
			}
		}
		
		return count;
	}
}