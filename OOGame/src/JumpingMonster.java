
public class JumpingMonster extends Monster {

	public JumpingMonster(Grid g, Player p, int row, int col) throws Exception
	{
	   super(g, p, row, col);
	}
	
	public Cell move()
	{
		currentDirection = grid.getBestDirection(currentCell, player.getCell());
		
		//Determining if the player is in the same row as the monster.
		if (player.getCell().row == currentCell.row) {
			//If so, checking to see if the current row is one which the monster can move on. 
			if (currentCell.row %5 == 0)
				//This should make the jump to the player's cell.
				currentCell = player.getCell();
		}
		
		//Doing the same for columns.
		if (player.getCell().col == currentCell.col) {
			if (currentCell.col %5 == 0)
				//This should make the jump to the player's cell.
				currentCell = player.getCell();
		}
		//If neither, standard movement applies.
		else
			currentCell = (grid.getCell(getCell(),getDirection()));
		
        return currentCell;
	}
	

}
