package ar.edu.ort.tp1.parcial1.clases;

public class Gato extends Mascota {

	private static final double MULT_ALIMENTACION = 0.033;
	private static final double PORC_DESC_PESO = -1;
	
	public Gato(String nombre, double peso, boolean vacunada, Estado estado) {
		super(nombre, peso, vacunada, estado);
		
	}

	@Override
	public void comer(double comida) {
		comer(MULT_ALIMENTACION);
		
	}

	@Override
	public void defecar() {
		actualizarPeso(PORC_DESC_PESO);
		
	}
	
	
	
	//TODO Completar
}
