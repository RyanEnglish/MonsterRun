public class InvisibleMonster extends Monster {

	public InvisibleMonster (Grid g, Player p, int row, int col) throws Exception
			{
		   	super(g, p, row, col);
			}
	
	public boolean viewable() {
		int distance = grid.distance(currentCell, player.getCell());
		if (distance < 6)
			return true;
		else
			return false;
	}
}
