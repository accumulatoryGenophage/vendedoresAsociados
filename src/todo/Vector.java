package todo;

public class Vector {

	private Nodo nodo1;

	private Nodo nodo2;

	public Nodo getNodo1() {
		return nodo1;
	}

	public void setNodo1(Nodo nodo1) {
		this.nodo1 = nodo1;
	}

	public Nodo getNodo2() {
		return nodo2;
	}

	public void setNodo2(Nodo nodo2) {
		this.nodo2 = nodo2;
	}

	public Boolean vectorExiste(Nodo primero, Nodo segundo, Vector vector) {

		if ((vector.getNodo1().equals(primero) && vector.getNodo2().equals(segundo))
				|| (vector.getNodo1().equals(segundo) && vector.getNodo2().equals(primero))) {

			return true;
		}

		else {

			return false;
		}
	}

}
