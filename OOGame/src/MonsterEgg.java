
public class MonsterEgg extends ProductiveMonster{
	int SpawnTimer = 0;
	
	
	public MonsterEgg (Grid g, Player p, int row, int col) throws Exception {
		super(g, p, row, col);
	}
	
	public Cell move()
	{
		currentDirection = ' ';
        currentCell = (grid.getCell(getCell(),getDirection()));
        return currentCell;
	}
	
	public void Spawn() {
		if (SpawnTimer <= 10) {
			if (player.getCell() == currentCell) {
				
			}
		}
	}
}
