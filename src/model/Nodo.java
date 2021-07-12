package model;

import java.util.ArrayList;

public class Nodo {

	private String nombre;
	
	private ArrayList<Producto> productos;

	private ArrayList<Nodo> asociados;
	
	private ArrayList<Producto> productosDeAsociados;
	
	private ArrayList<Nodo> sugerencias;
	
	private ArrayList<String> bandejaDeEntrada;
	
	private ArrayList<String> comentarios;
	
	private ArrayList <String> reacciones;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public ArrayList<Nodo> getAsociados() {
		return asociados;
	}

	public void setAsociados(ArrayList<Nodo> asociados) {
		this.asociados = asociados;
	}

	public ArrayList<Producto> getProductosDeAsociados() {
		return productosDeAsociados;
	}

	public void setProductosDeAsociados(ArrayList<Producto> productosDeAsociados) {
		this.productosDeAsociados = productosDeAsociados;
	}

	public ArrayList<Nodo> getSugerencias() {
		return sugerencias;
	}

	public void setSugerencias(ArrayList<Nodo> sugerencias) {
		this.sugerencias = sugerencias;
	}

	public ArrayList<String> getBandejaDeEntrada() {
		return bandejaDeEntrada;
	}

	public void setBandejaDeEntrada(ArrayList<String> bandejaDeEntrada) {
		this.bandejaDeEntrada = bandejaDeEntrada;
	}

	public ArrayList<String> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<String> comentarios) {
		this.comentarios = comentarios;
	}

	public ArrayList<String> getReacciones() {
		return reacciones;
	}

	public void setReacciones(ArrayList<String> reacciones) {
		this.reacciones = reacciones;
	}
	
}
