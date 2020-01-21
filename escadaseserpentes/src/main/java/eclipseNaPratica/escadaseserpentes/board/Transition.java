/**
 * Software usado unicamente para o aprendizado da ferramenta eclipse,
 * curso oferecido pela Softblue,
 * todos os direitos são reservados ao donos (https://github.com/softbluecursos/eclipse-na-pratica).
 */
package eclipseNaPratica.escadaseserpentes.board;

public class Transition {

	public enum Type {
		SNAKE, LADDER;
	}

	private Space spaceFrom;
	private Space spaceTo;
	private Type type;

	public Transition(Space spaceFrom, Space spaceTo) {
		this.spaceFrom = spaceFrom;
		this.spaceTo = spaceTo;
		this.type = spaceFrom.getNumber() < spaceTo.getNumber() ? Type.LADDER : Type.SNAKE;
	}

	public Space getSpaceFrom() {
		return spaceFrom;
	}

	public Space getSpaceTo() {
		return spaceTo;
	}

	public Type getType() {
		return type;
	}
}
