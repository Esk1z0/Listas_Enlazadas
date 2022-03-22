public class Alumno {

	private String nombre;
	private int matricula;
	private ListaOrdinal expediente;

	public Alumno(String nombre, int matricula) {
		this.nombre = nombre;
		this.matricula = matricula;
		expediente = new ListaOrdinal();
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
		expediente.insertar(evaluacion);
	}

	public boolean estaAprobado(String nombreAsig) {
		boolean aprobado = false;
		IteradorListaOrdinal it = expediente.getIterador();
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
		ListaOrdinal aprobadas = null;
		Evaluacion aux = null;
		IteradorListaOrdinal it = expediente.getIterador();
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
		return 0;  // Eliminar esta línea al codificar el método
	}

	public void mostrar() {

	}

}


