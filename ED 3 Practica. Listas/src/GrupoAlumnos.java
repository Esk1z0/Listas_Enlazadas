public class GrupoAlumnos {

	private String nombre;
	private ListaCalificada listaAlumnos;

	public GrupoAlumnos(String nombre) {
		this.nombre = nombre;
		listaAlumnos = new ListaCalificada();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void nuevoAlumno(Alumno alumno) {
		listaAlumnos.insertar(alumno);
	}

	public int getNumAlumnos() {
		int contador = 0;
		IteradorListaCalificada it = listaAlumnos.getIterador();
		while(it.hasNext()){
			if(it.next() != null){
				contador++;
			}
		}
		return contador;
	}

	public Alumno getAlumno(int matricula) {
		Alumno alumno = listaAlumnos.getElemento(matricula);
		return alumno;
	}

	public double porcentajeAprobados(String nombreAsignatura) {
		double porcentaje = 0;
		if(listaAlumnos.vacia()){
			porcentaje = 0.0;
		}
		else{
			double total = 0;
			double aprobados = 0;

			IteradorListaCalificada it = listaAlumnos.getIterador();
			Alumno aux = null;
			while(it.hasNext()){
				aux = it.next();
				if(aux.estaAprobado(nombreAsignatura)){
					aprobados ++;
				}
				total++;
			}
			porcentaje = (aprobados * 100)/total;
		}
		return porcentaje;
	}
}