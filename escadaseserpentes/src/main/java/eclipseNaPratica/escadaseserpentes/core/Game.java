/**
 * Software usado unicamente para o aprendizado da ferramenta eclipse,
 * curso oferecido pela Softblue,
 * todos os direitos são reservados ao donos (https://github.com/softbluecursos/eclipse-na-pratica).
 */
package eclipseNaPratica.escadaseserpentes.core;

import eclipseNaPratica.escadaseserpentes.board.Board;
import eclipseNaPratica.escadaseserpentes.counter.Counter;
import eclipseNaPratica.escadaseserpentes.counter.Counters;

public class Game {

	private static final int NUM_SPACES = 30;
	private static final int NUM_PLAYERS = 2;

	public void play() {

		Board board = new Board(NUM_SPACES);
		addTransitions(board);
		board.print();

		Counters counters = new Counters(board, NUM_PLAYERS);
		counters.print();

		while (!board.gameFinished()) {
			Counter currentCounter = counters.next();
			currentCounter.play(board);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Counter winnerCounter = board.getWinnerCounter();
		System.out.format("O jogador '%s' ganhou a rodada!\n", winnerCounter.getName());
	}

	private void addTransitions(Board board) {
		board.addTransition(4, 12);
		board.addTransition(7, 9);
		board.addTransition(11, 25);
		board.addTransition(14, 2);
		board.addTransition(22, 5);
		board.addTransition(28, 18);
	}
}