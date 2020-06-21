package model;

public class Casa extends Propiedad {
	private boolean poseeGaraje;

	public Casa(String direccion, int cantHabitaciones, double precioBaseAlquiler, boolean esUsoComercial, int cantInquilinos, boolean poseeGaraje) {
		super(direccion, cantHabitaciones, precioBaseAlquiler, esUsoComercial, cantInquilinos);

		this.poseeGaraje = poseeGaraje;
	}

	public boolean isPoseeGaraje() {
		return poseeGaraje;
	}

	@Override
	public double calcularPrecioAlquiler() {
		double resultado = precioBaseAlquiler;
		if (esUsoComercial) {
			resultado += 1000;
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Casa{" + "poseeGaraje=" + poseeGaraje + '}' + super.toString();
	}
}
