
public class Position {
	private int positionRow;
	private int positionColumn;
	
	public Position(int row, int col) {
		this.positionColumn = col;
		this.positionRow = row;
		
	}
	// setting getter methods
	public int getRow() {
		return positionRow;
	}
	public int getCol() {
		return positionColumn;
	}
	//setting setter methods
	
	public void setRow(int newRow) {
		this.positionRow = newRow;
	}
	public void setCol(int newCol) {
		this.positionColumn = newCol;
	}
	public boolean equals (Position otherPosition) {
		if (otherPosition.getCol() == this.positionColumn && otherPosition.getRow() == this.positionRow) {
			return true;
		}
		return false;
	}
}