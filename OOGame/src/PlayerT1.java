
public class PlayerT1 extends Player{

	private int energy;

	public PlayerT1(Grid g, int row, int col) throws Exception {
		super(g, row, col);
		   currentCell = grid.getCell(row, col);   
		   currentDirection = ' ';
		   
		   energy = 40;
	}

	public Cell move()
	{
		if(energy>0)
		{
			energy-=2;
			currentCell = grid.getCell(currentCell,currentDirection);
		}
		return currentCell;
		
	}

	
}
