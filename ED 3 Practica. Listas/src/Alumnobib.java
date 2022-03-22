import java.util.Iterator;
import java.util.LinkedList;

public class Alumnobib {

	private String nombre;
	private int matricula;
	private LinkedList<Evaluacion> expediente;

	public Alumnobib(String nombre, int matricula) {
		this.nombre = nombre;
		this.matricula = matricula;
		expediente = new LinkedList<>();
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void nuevaEvaluacion(Evaluacion evaluacion) {
		expediente.add(evaluacion);
	}

	public boolean estaAprobado(String nombreAsig) {
		boolean aprobado = false;
		Iterator<Evaluacion> it = expediente.listIterator();
		while (it.hasNext() && !aprobado) {
			Evaluacion evaluacion = it.next();
			if (evaluacion.getNombreAsignatura().equals(nombreAsig) &&
					evaluacion.getNota() >= 5.0) {
				aprobado = true;
			}
		}
		return aprobado;
	}

	public ListaOrdinal asignaturasAprobadas() {
		ListaOrdinal aprobadas = new ListaOrdinal();
		Evaluacion aux = null;
		Iterator<Evaluacion> it = expediente.listIterator();
		while(it.hasNext()){
			aux = it.next();
			if(aux.getNota() >= 5){
				aprobadas.insertar(aux);
			}
		}
		return aprobadas;
	}

	public double mediaAprobadas() {
		double media = 0.0;
		ListaOrdinal notas = this.asignaturasAprobadas();
		IteradorListaOrdinal it = notas.getIterador();
		int contador = 0;
		double sumatorio = 0.0;
		Evaluacion aux = null;
		while(it.hasNext()){
			contador += 1;
			aux = it.next();
			sumatorio += aux.getNota();
		}
		if(contador == 0){
			return 0.0;
		}
		else{
			media = sumatorio / contador;
		}
		return media;
	}

	public int getNumAprobadas() {
		ListaOrdinal aprobadas = this.asignaturasAprobadas();
		IteradorListaOrdinal it = aprobadas.getIterador();
		int contador = 0;
		while(it.hasNext()){
			it.next();
			contador += 1;
		}
		return contador;
	}

	public void mostrar() {
		Iterator<Evaluacion> it = expediente.listIterator();
		Evaluacion auxEv = null;
		double auxNota = 0.0;
		int numEvaluaciones = 0;
		int asigApro = 0;
		System.out.println(nombre + " Matrícula: " + matricula);
		if(!expediente.isEmpty()) {
			while (it.hasNext()) {
				auxEv = it.next();
				String nota = "NP";
				if (auxEv.getNota() > 0) nota = Double.toString(auxEv.getNota());
				System.out.println("\t" + auxEv.getNombreAsignatura() + " (" + auxEv.getConvocatoria() + "): " + nota);
			}
			System.out.println(expediente.size() + " evaluaciones y " + this.getNumAprobadas() + " asignaturas aprobadas con calificación media " + this.mediaAprobadas());
		}
		else System.out.println("No ha realizado ninguna evaluación.");
	}

}


