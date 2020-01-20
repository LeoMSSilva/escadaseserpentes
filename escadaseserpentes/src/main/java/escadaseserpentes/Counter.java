package escadaseserpentes;

public class Counter {
	
	private String name;
	private Space currentSpace;
	
	public Counter(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Space getCurrentSpace() {
		return currentSpace;
	}

	public void goTo(Space space) {
		currentSpace = space;
	}
	
	public void play(Board board) {
		Dice dice = Dice.get();
		int diceNumber = dice.roll();
		System.out.format("O jogador '%s' jogou o dado, tirou o valor %d", name, diceNumber);
		board.move(this, diceNumber);
	}
}