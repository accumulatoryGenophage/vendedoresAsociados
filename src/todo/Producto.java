package todo;

import java.text.SimpleDateFormat;

public class Producto {

	private String categoria;

	private String nombre;

	private String fechaDePublicación;

	public String getFechaDePublicación() {
		return fechaDePublicación;
	}

	public void setFechaDePublicación(String fechaDePublicación) {
		this.fechaDePublicación = fechaDePublicación;
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
