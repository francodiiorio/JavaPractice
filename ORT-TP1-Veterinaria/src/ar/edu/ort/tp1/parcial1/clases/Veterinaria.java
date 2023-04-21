package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";
	private ArrayList<Mascota> mascotas;
	private Doctor doctor;
	private String nombre;
	public static void main(String[] args) {
		System.out.printf(TXT_INGRESO, "pepe");
		System.out.printf(TXT_CANTIDADES, 9 ,8, 5);
	}

	public Veterinaria(String nombre, Doctor doctor) {
		this.nombre = nombre;
		this.doctor = doctor;
		this.mascotas = new ArrayList<>();
	}
	public void admitirMascota(Mascota mascota) {
		Mascota mascotaEncontrada = buscarMascota(mascota.getNombre());
		if (mascotaEncontrada == null) {
			System.out.printf(TXT_INGRESO, mascota.getNombre());
			mascotas.add(mascota);
		}
	}

	public Mascota buscarMascota(String nombreDeMascota) {
		int cantElementos = mascotas.size();
		int i = 0;
		Mascota mascotaEncontrada = null;
		
		while (i < cantElementos && !(mascotas.get(i).getNombre().equals(nombreDeMascota))) {
			i++;
		}
		if (i < cantElementos) {
			mascotaEncontrada = mascotas.get(i);
		}
		return mascotaEncontrada;
	}

	public void vacunar() {
		for (Mascota mascota : mascotas) {
			if (!mascota.getVacunada()) {
				mascota.vacunar();
			}
			
		}
	}
	@Override
	public void mostrar() {
		System.out.println("Veterinaria " + nombre);
		System.out.println("Doctor a cargo: " + doctor.getNombre());
		
		int cantGatos = 0;
		int cantConejos = 0;
		int cantPerros = 0;
		
		for (Mascota mascota : mascotas) {
			if (mascota instanceof Gato) {
				cantGatos++;
			}
			else if (mascota instanceof Conejo) {
				cantConejos++;
			}
			else {
				cantPerros++;
			}
		}
		System.out.printf(TXT_CANTIDADES, cantConejos, cantGatos, cantPerros);
	}
}
