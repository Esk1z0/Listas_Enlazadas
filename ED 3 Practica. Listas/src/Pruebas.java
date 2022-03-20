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
        System.out.println("Número de convocatorias de Fundamentos de Programación :" + (numFP - 1));
    }
}
