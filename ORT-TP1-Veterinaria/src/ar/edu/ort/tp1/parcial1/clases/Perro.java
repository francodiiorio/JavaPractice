package ar.edu.ort.tp1.parcial1.clases;

public class Perro extends Mascota {
	private static final double MULT_ALIMENTACION = 0.05;
	private static final double PORC_DESC_PESO = -3;
	
	public Perro(String nombre, double peso, boolean vacunada, Estado estado) {
		super(nombre, peso, vacunada, estado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer(double comida) {
		comer(MULT_ALIMENTACION);
		
	}

	@Override
	public void defecar() {
		actualizarPeso(PORC_DESC_PESO);
		
	}

	
}
