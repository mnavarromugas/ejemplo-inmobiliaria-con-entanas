package model;

public class Departamento extends Propiedad {
	private double precioExpensas;

	public Departamento(String direccion, int cantHabitaciones, double precioBaseAlquiler, boolean esUsoComercial, int cantInquilinos, double precioExpensas) {
		super(direccion, cantHabitaciones, precioBaseAlquiler, esUsoComercial, cantInquilinos);

		this.precioExpensas = precioExpensas;
	}

	@Override
	public double calcularPrecioAlquiler() {
		double resultado = precioBaseAlquiler + precioExpensas;
		if (esUsoComercial) {
			resultado += 500;
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Departamento{" + "precioExpensas=" + precioExpensas + '}' + super.toString();
	}


	
}
