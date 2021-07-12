package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Grafo {

	private ArrayList<Nodo> grafo;
	private ArrayList<Vector> conexiones;

	public void metodoAgregarVendedor() {

		if (grafo == null) {
			grafo = new ArrayList<Nodo>();
			Nodo nuevo = new Nodo();
			nuevo.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del vendedor"));
			ArrayList<Producto> productos = new ArrayList<Producto>();
			productos = agregarProductos(productos);
			nuevo.setProductos(productos);
			grafo.add(nuevo);
		}

		else {
			Nodo nuevo = new Nodo();
			nuevo.setNombre(verificarNombre(grafo));
			ArrayList<Producto> productos = new ArrayList<Producto>();
			productos = agregarProductos(productos);
			nuevo.setProductos(productos);
			grafo.add(nuevo);

		}
	}

	private String verificarNombre(ArrayList<Nodo> grafo) {

		String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del vendedor");

		boolean flag = false;

		for (Nodo n : grafo) {

			if (!flag) {

				if (n.getNombre().equalsIgnoreCase(nombre)) {
					flag = true;
				}
			}

		}

		if (flag) {
			JOptionPane.showMessageDialog(null, "El nombre ya est� registrado, debe ingresar uno nuevo");
			return verificarNombre(grafo);
		}

		else {

			return nombre;

		}
	}

	private ArrayList<Producto> agregarProductos(ArrayList<Producto> productos) {

		int pregunta = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Desea Agregar un producto? \n 1. Si \n 2. No"));

		switch (pregunta) {

		case 1:
			Producto producto = new Producto();
			producto.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del producto"));
			producto.setCategoria(
					JOptionPane.showInputDialog(null, "Ingrese la categoria a la que pertenece el producto"));
			producto.setFechaDePublicacion(
					new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()));
			productos.add(producto);
			return agregarProductos(productos);

		case 2:

			if (productos.size() == 0) {
				JOptionPane.showMessageDialog(null, "Debe tener al menos un producto para continuar");
				return agregarProductos(productos);
			}

			break;

		default:

			JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
			return agregarProductos(productos);

		}

		return productos;
	}

	public void agregarContacto(Nodo nodo1, Nodo nodo2) {

		Vector vector = new Vector();

		if (conexiones == null) {
			conexiones = new ArrayList<Vector>();
			vector.setNodo1(nodo1);
			vector.setNodo2(nodo2);
			conexiones.add(vector);

			ArrayList<Nodo> conexionesNodo1 = new ArrayList<Nodo>();
			conexionesNodo1.add(nodo2);
			nodo1.setAsociados(conexionesNodo1);

			for (Producto p : nodo2.getProductos()) {
				nodo1.getProductosDeAsociados().add(p);
			}

			ArrayList<Nodo> conexionesNodo2 = new ArrayList<Nodo>();
			conexionesNodo2.add(nodo1);
			nodo1.setAsociados(conexionesNodo2);

			for (Producto p : nodo1.getProductos()) {
				nodo2.getProductosDeAsociados().add(p);
			}
		}

		else {

			Boolean flag = false;

			for (Vector v : conexiones) {

				if (!flag) {
					flag = vector.vectorExiste(nodo1, nodo2, v);
				}
			}

			if (flag) {

				JOptionPane.showMessageDialog(null, "La asociacion entre estos 2 vendedores ya existe");
			}

			else if (nodo1.getAsociados().size() == 10) {
				JOptionPane.showMessageDialog(null,
						"No se puede crear la conexi�n puesto que usted ya cuenta con la cantidad permitida (10) ");
			}

			else if (nodo2.getAsociados().size() == 10) {
				JOptionPane.showMessageDialog(null,
						"No se puede crear la conexi�n puesto que el vendedor al cual trata de solicitar la asociacion ya cuenta con la cantidad permitida (10) ");
			}

			else {
				vector.setNodo1(nodo1);
				vector.setNodo2(nodo2);
				conexiones.add(vector);

				if (nodo1.getAsociados() == null) {
					ArrayList<Nodo> asociados = new ArrayList<Nodo>();
					asociados.add(nodo2);
					nodo1.setAsociados(asociados);
				}

				else {
					nodo1.getAsociados().add(nodo2);
				}

				if (nodo2.getAsociados() == null) {
					ArrayList<Nodo> asociados = new ArrayList<Nodo>();
					asociados.add(nodo1);
					nodo2.setAsociados(asociados);
				}

				else {
					nodo2.getAsociados().add(nodo1);
				}
			}
		}
	}
}
