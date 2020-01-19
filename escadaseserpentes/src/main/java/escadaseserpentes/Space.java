package escadaseserpentes;

public class Space {

	public enum Type{
		START_HERE, HOME, Regular;
	}
	
	private int number;
	
	private Type type;
	
	public Space(int number, Type type) {
		this.number = number;
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		if (type == Type.Regular) {
			return String.valueOf(number);
		} else {
			return number + " (" + type + ")";
		}
	}
}