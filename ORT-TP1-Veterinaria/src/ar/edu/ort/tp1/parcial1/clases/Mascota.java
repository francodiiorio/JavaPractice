package ar.edu.ort.tp1.parcial1.clases;

public abstract class Mascota implements Animal {

	private static final String MSG_COM_FELIZ = " dice: He comido demasiado";
	private static final String MSG_COM_HAMBRIENTO = " dice: Muchas gracias tenia hambre";
	private static final String MSG_COM_ENFERMO = " dice: No tenia mucha hambre, pero gracias";

	private static final int CIEN = 100;
	private String nombre;
	private double peso;
	private boolean vacunada;
	private Estado estado;

	public Mascota(String nombre, double peso, boolean vacunada, Estado estado) {
		this.nombre = nombre;
		this.peso = peso; 
		this.vacunada = vacunada;
		this.estado = estado;
	}

	// TODO Completar
	/**
	 * Alimenta a las mascotas de forma general. Si su estado es hambiento estar�
	 * feliz y dara las gracias ya que ten�a hambre Si su estado es feliz, se
	 * enfermar� e indicar� que comio demasiado. si estaba enfermo, dara las gracias, pero seguir� enfermo.
	 * adem�s actualizar� el peso sumando al actual la multiplicaci�n entre la cantidad de comida recibida y un multiplicador.
	 * Finalmente indicar� su estado
	 * 
	 * @param comida
	 * @param multiplicador
	 */
	public void comer(double comida, double multiplicador) {
		actualizarPeso(multiplicador);
		if (estado == Estado.HAMBRIENTO) {
			setEstado(Estado.FELIZ); 
			System.out.println(MSG_COM_HAMBRIENTO);
		}
		else if (estado == Estado.FELIZ) {
			setEstado(Estado.ENFERMO);
			System.out.println(MSG_COM_FELIZ);
		}
		else {
			System.out.println(MSG_COM_ENFERMO);
		}
		this.peso += comida * multiplicador;
	}

	public String getNombre() {
		return nombre;
	}

	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}
	private void setVacunada() {
		this.vacunada = true;
	}
	public void vacunar() {
		setVacunada();
	}
	public boolean getVacunada() {
		return this.vacunada;
	}
	private void setEstado(Estado estado) {
		this.estado = estado;
	}
}
