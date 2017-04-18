import javax.swing.JButton;

import org.junit.Before;
import org.junit.Test;

import gfx.MainWindow;
import gfx.Ressources;
import logic.Board;
import logic.Player;
import logic.WinState;

public class TestCases {

	private static final int TIMEOUT = 1000;
	Player p1;
	Player p2;

	@Before
	public void before() {
		p1 = new Player("Player 1", Ressources.icon_x);
		p2 = new Player("Player 2", Ressources.icon_o);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testId5() throws InterruptedException {
		// 3. Parameter == Wincondition Board(m, n, k, p1, p2)
		Board board = new Board(3, 3, -1, p1, p2);

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testId7() throws InterruptedException {
		Board board = new Board(-1, 3, 3, p1, p2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testId8() throws InterruptedException {
		Board board = new Board(0, 3, 3, p1, p2);
	}
	
	public void testId9() throws InterruptedException {
		Board board = new Board(3, 3, 3, p1, p2);
		
		final MainWindow frame;
	    frame = new MainWindow(p1, p2, board);
	    frame.setVisible(true);

	    
	    frame.turn(0, 2);
	    Thread.sleep(1000);
	    frame.turn(0, 0);
	    Thread.sleep(1000);
	    frame.turn(0, 1);
	    Thread.sleep(1000);
	    frame.turn(2, 2);
	    Thread.sleep(1000);
	    frame.turn(1, 0);
	    Thread.sleep(1000);
	    frame.turn(1, 1);
	    Thread.sleep(1000);
	    
	    
	    
	    
	    
	    
	    
	    Thread.sleep(TIMEOUT);
	    
	    JButton b1 = frame.set;

	    Thread.sleep(TIMEOUT);
	    JButton b2 = frame.buttonArr[0][0];
	    b2.doClick();
	    Thread.sleep(TIMEOUT);
	    
	    frame.turn(0, 1);

	    Thread.sleep(TIMEOUT);
	    frame.turn(0, 1)
	    b2 = frame.buttonArr[2][2];

	    Thread.sleep(TIMEOUT);
	    
	    b1 = frame.buttonArr[1][0];

	    Thread.sleep(TIMEOUT);
	    b2 = frame.buttonArr[1][1];

	    Thread.sleep(TIMEOUT);

//	    WinState p = board.checkWin();
//	    WinState.
//	    Board resultBoard = frame.getBoard();
	    
//	    resultBoard.
//	    assert (1 == resultBoard.get2d(0, 0) && 2 == resultBoard.get2d(0, 1));
	}

}
