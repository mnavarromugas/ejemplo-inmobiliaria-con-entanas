package model;

public abstract class Propiedad {
	private String direccion;
	private int cantHabitaciones;
	protected double precioBaseAlquiler;
	protected boolean esUsoComercial;
	private int cantInquilinos;

	public Propiedad(String direccion, int cantHabitaciones, double precioBaseAlquiler, boolean esUsoComercial, int cantInquilinos) {
		this.direccion = direccion;
		this.cantHabitaciones = cantHabitaciones;
		this.precioBaseAlquiler = precioBaseAlquiler;
		this.esUsoComercial = esUsoComercial;
		this.cantInquilinos = cantInquilinos;
	}

	public abstract double calcularPrecioAlquiler();

	public int getCantInquilinos() {
		return cantInquilinos;
	}

	public int getCantHabitaciones() {
		return cantHabitaciones;
	}

	@Override
	public String toString() {
		return "Propiedad{" + "direccion=" + direccion + ", cantHabitaciones=" + cantHabitaciones + ", precioBaseAlquiler=" + precioBaseAlquiler + ", esUsoComercial=" + esUsoComercial + ", cantInquilinos=" + cantInquilinos + '}';
	}
}
