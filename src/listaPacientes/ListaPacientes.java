package listaPacientes;

import java.util.*;

public class ListaPacientes {


    public static void main(String[] args) {
        listaDePacientesH();
        listaPacientesM();

    }

    public static void listaDePacientesH() {
        System.out.println("***** Lista dos Pacientes Homens *****") ;
        System.out.println();
        List<String> listaH = new LinkedList<>();
        listaH.add("Jose Carlos Monteiro");
        listaH.add("Diego de Andrade Monteiro");
        listaH.add("Danilo de Andrade Monteiro");
        System.out.println(listaH);
        System.out.println();
    }

    public static void listaPacientesM () {
        System.out.println("***** Lista das Pacientes Mulheres *****");
        System.out.println();
        List<String> listaM = new LinkedList<>();
        listaM.add("Raimunda Melo de Andrade");
        listaM.add("Maria Marta");
        listaM.add("Josefa Pantaneira");
        System.out.println(listaM);
    }


}
