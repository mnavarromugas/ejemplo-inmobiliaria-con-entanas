package model;

import java.util.ArrayList;

public class Inmobiliaria {
	private ArrayList<Propiedad> propiedades;

	public Inmobiliaria() {
		this.propiedades = new ArrayList<>();
	}

	public void agregarPropiedad(Propiedad p) {
		propiedades.add(p);
	}

	public Object[] getListado() {
		return propiedades.toArray();
	}

	public double getReporte1() {
		double acum = 0;
		int cont = 0;
		for (Propiedad p : propiedades) {
			if (p.getCantInquilinos() == 2) {
				cont++;
				acum += p.calcularPrecioAlquiler();
			}
		}
		if (cont>0) {
			return acum / cont;
		}
		return 0;
	}

	public int getReporte2() {
		int cont = 0;
		for (Propiedad p : propiedades) {
			if (p instanceof Casa && p.getCantHabitaciones() > 2 && ((Casa)p).isPoseeGaraje()) {
				cont++;
			}
		}
		return cont;
	}
}
