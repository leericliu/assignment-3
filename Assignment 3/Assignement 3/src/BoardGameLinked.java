
public class BoardGameLinked {
	private int board_length;
	private int board_width;
	private SnakeLinked theSnake;
	private DoubleList<String>[] board;
	
	public BoardGame(String boardFile) {
		MyFileReader in = new MyFileReader(boardFile);
		// declare number variables
		int num1 = 0;
		int num2 = 0;
		int num5 = 0;
		int num6 = 0;
		int count = 0 ;
		while(count < 6) {
		// reads the first two lines and ignores them
		String line;
		in.readInt();
		in.readInt();
		// stores and reads the board lengths and board widths
		this.board_length = in.readInt();
		this.board_width = in.readInt();
		// reads the row and column where its stored
		num5 = in.readInt();
		num6 = in.readInt();
		//snake position row and column
		break; 
		
		}
		this.theSnake = new SnakeLinked(num5, num6);
		
		board = new String[this.board_width][this.board_length]; 
		
		
		int i = 0;
		int j = 0; 
		// goes through the board width and lengths
		while(i < this.board_width) {
			
			while(j < this.board_length) {
				
				matrix[i][j] = "empty"; 
				j++; 
			}
			
			i++; 
			j = 0; 	
		}
		int theFirstOne = 0 ;  
		int theSecondOne = 0 ; 
		// reads first number and second number and the string in triplets
		while(in.endOfFile() == false) {
			
			theFirstOne = in.readInt(); 
			theSecondOne = in.readInt();
			
			matrix[theFirstOne][theSecondOne] = in.readString(); 
			
			
			
		}
	}
	public int getLength() {
		return board_length;
	}
	public int getWidth() {
		return board_width;
	}
	public SnakeLinked getSnakeLinked() {
		return theSnake;
	}
	public void setSnakeLinked(SnakeLinked newSnake) {
		newSnake = theSnake;
	}
	public void setObject(int row, int col, String newObject) throws InvalidPositionException{
		
	}
}
