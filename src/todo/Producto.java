package todo;

import java.text.SimpleDateFormat;

public class Producto {

	private String categoria;

	private String nombre;

	private String fechaDePublicaci�n;

	public String getFechaDePublicaci�n() {
		return fechaDePublicaci�n;
	}

	public void setFechaDePublicaci�n(String fechaDePublicaci�n) {
		this.fechaDePublicaci�n = fechaDePublicaci�n;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
