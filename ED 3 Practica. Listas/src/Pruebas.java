public class Pruebas {

    public static void main(String[] args) {
        System.out.println("Nombre: Juan Esteban Rincón Marín\nNúmero de Matrícula: BS0015\nGrupo: IWSIM12");
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



        Alumnobib edu = new Alumnobib("Eduardo Parra Martín", 8765);
        Alumnobib soni = new Alumnobib("Sonia Torres Pardo", 2345);
        edu.nuevaEvaluacion(uno);
        edu.nuevaEvaluacion(dos);
        edu.nuevaEvaluacion(tres);
        edu.nuevaEvaluacion(cuatro);
        System.out.println(lineas() + "MOSTRAR ALUMNOS BIBLIOTECA" + lineas());
        edu.mostrar();
        System.out.println(lineas() + lineas());
        soni.mostrar();
        System.out.println(lineas() + lineas());



        Alumno pedro = new Alumno("Pedro Jiménez del Pozo", 8511);
        Evaluacion fp = new Evaluacion("Fundamentos de Programación", "Enero 19", 8.8);
        pedro.nuevaEvaluacion(fp);
        ListaCalificada clase = new ListaCalificada();
        clase.insertar(pedro);
        clase.insertar(a1);
        clase.insertar(a2);
        Alumno auxiliar;
        System.out.println(lineas() + " Alumnos En La Lista " + lineas());
        IteradorListaCalificada itcal = clase.getIterador();
        while(itcal.hasNext()){
            auxiliar = itcal.next();
            auxiliar.mostrar();
            System.out.println(lineas() + lineas());
        }


        clase.borrarMenores(6000);
        System.out.println(lineas() + " Borramos las claves menores a 6000 " + lineas());
        IteradorListaCalificada itcal2 = clase.getIterador();
        while(itcal2.hasNext()){
            auxiliar = itcal2.next();
            auxiliar.mostrar();
            System.out.println(lineas() + lineas());
        }
        clase.borrarMenores(9000);
        System.out.println(lineas() + " Borramos las claves menores a 9000 " + lineas());
        IteradorListaCalificada itcal3 = clase.getIterador();
        while(itcal3.hasNext()){
            auxiliar = itcal3.next();
            auxiliar.mostrar();
            System.out.println(lineas() + lineas());
        }
        System.out.println(lineas() + " Metemos todos los alumnos y borramos las claves mayores a 7000 " + lineas());
        clase.insertar(a1);
        clase.insertar(a2);
        clase.insertar(pedro);
        clase.borrarMayores(7000);
        IteradorListaCalificada itcal4 = clase.getIterador();
        while(itcal4.hasNext()){
            auxiliar = itcal4.next();
            auxiliar.mostrar();
            System.out.println(lineas() + lineas());
        }
        System.out.println(lineas() + " Borramos las claves mayores a 1000 " + lineas());
        clase.borrarMayores(1000);
        IteradorListaCalificada itcal5 = clase.getIterador();
        while(itcal5.hasNext()){
            auxiliar = itcal5.next();
            auxiliar.mostrar();
            System.out.println(lineas() + lineas());
        }





        GrupoAlumnos g11 = new GrupoAlumnos("GX11");
        g11.nuevoAlumno(a1);
        g11.nuevoAlumno(a2);
        g11.nuevoAlumno(pedro);
        System.out.println(lineas() + "CREADO EL GRUPO GX11" + lineas());
        System.out.println("El grupo GX11 tiene " + g11.getNumAlumnos() + " alumnos");
        System.out.println(lineas() + "GRUPO GX11. ALUMNOS CON MATRÍCULA 8510" + lineas());
        Alumno auxiliar1 = g11.getAlumno(8511);
        auxiliar1.mostrar();
        System.out.println(lineas() + lineas());
        System.out.println("porcentaje de aprobados en ED el grupo  GX11: " + g11.porcentajeAprobados("ED"));
    }






    public static String lineas(){
        return "-----------";
    }
}
