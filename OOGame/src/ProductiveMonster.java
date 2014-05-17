//Currently trying to get the timer for spawning a new monster by tracking the number of moves made and trying to spawn every 10 moves.
//Also trying to work out a way to check if their is a baby monster currently in play, preferably with a boolean.

public class ProductiveMonster extends Monster {
	
	//Boolean to track whether or not an egg is in play.
	private boolean hasBaby = false;
	
	protected Monster spawn;
	private Grid g;
	private Player p;
	
	//Timer to track moves until next spawn attempt. 
	private int SpawnTimer;
	
	public ProductiveMonster(Grid g, Player p, int row, int col) throws Exception
	{
	   super(g, p, row, col);
	   this.p = p;
	   this.g = g;
	}
	
	public void Spawn() throws Exception{
		spawn = new MonsterEgg(g, p, currentCell.row, currentCell.col);
	}
		
	public Cell move()
	{
		currentDirection = grid.getBestDirection(currentCell, player.getCell());
		currentCell = (grid.getCell(getCell(),getDirection()));
        return currentCell;
   	}

}
