public class Pruebas {

    public static void main(String[] args) {
        System.out.println("********** PRUEBAS **********");
        Evaluacion uno = new Evaluacion("ED", "Junio 19", 4.5);
        Evaluacion dos = new Evaluacion("ED","Julio 19", -1);
        Evaluacion tres = new Evaluacion("ED","Julio 20", 7.4);
        Evaluacion cuatro = new Evaluacion("Algebra", "Junio 18", 6.4);
        ListaOrdinal listaOrdinal = new ListaOrdinal();
        listaOrdinal.insertar(uno);
        listaOrdinal.insertar(dos);
        listaOrdinal.insertar(tres);
        listaOrdinal.insertar(cuatro);
        IteradorListaOrdinal it = listaOrdinal.getIterador();
        Evaluacion aux;
        int numED;
        int numAlgebra;
        int numFP;
        while (it.hasNext()){
            aux = it.next();
            aux.mostrar();
        }
        numED = listaOrdinal.numConvocatorias("ED");
        numAlgebra = listaOrdinal.numConvocatorias("Algebra");
        numFP = listaOrdinal.numConvocatorias("Fundamentos de Programacion");
        System.out.println("Número de convocatorias de Estructura de Datos: " + numED);
        System.out.println("Número de convocatorias de Álgebra :" + numAlgebra);
        System.out.println("Número de convocatorias de Fundamentos de Programación :" + (numFP + 1));



        Alumno a1 = new Alumno("Felipe García Gómez", 1253);
        Alumno a2 = new Alumno("Alicia Blázquez Martín", 5622);
        a1.nuevaEvaluacion(uno);
        a1.nuevaEvaluacion(dos);
        a1.nuevaEvaluacion(tres);
        a1.nuevaEvaluacion(cuatro);
        System.out.println(lineas() + "Asignaturas Aprobadas por " + a1.getNombre() + lineas());
        ListaOrdinal aprobadas1 = a1.asignaturasAprobadas();
        IteradorListaOrdinal it1 = aprobadas1.getIterador();
        while(it1.hasNext()){
            Evaluacion aux1 = it1.next();
            System.out.println("\t" + aux1.getNombreAsignatura() + " (" + aux1.getConvocatoria() + "): " + aux1.getNota());
        }
        System.out.println(lineas() + "Asignaturas Aprobadas por " + a2.getNombre() + lineas());
        ListaOrdinal aprobadas2 = a2.asignaturasAprobadas();
        IteradorListaOrdinal it2 = aprobadas2.getIterador();
        while(it2.hasNext()){
            Evaluacion aux2 = it2.next();
            System.out.println("\t" + aux2.getNombreAsignatura() + " (" + aux2.getConvocatoria() + "): " + aux2.getNota());
        }
        System.out.println(lineas() + "Mostrar Los Alumnos" + lineas());
        a1.mostrar();
        System.out.println(lineas() + lineas());
        a2.mostrar();
        System.out.println(lineas() + lineas());
    }
    public static String lineas(){
        return "-----------";
    }
}
