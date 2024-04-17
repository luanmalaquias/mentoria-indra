import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercicio 1
        Exercicio.idadeNadador(6);
        Exercicio.idadeNadador(9);
        Exercicio.idadeNadador(18);

        // Exercicio 2
        System.out.println("\nExercicio 2");
        Exercicio.calculadora(2, 3, "+");
        Exercicio.calculadora(2, 3, "-");
        Exercicio.calculadora(2, 3, "*");

        // Exercicio 3
        System.out.println("\nExercicio 3");
        Exercicio.classificacaoCaractere("a");
        Exercicio.classificacaoCaractere("b");
        Exercicio.classificacaoCaractere(1);
        Exercicio.classificacaoCaractere("!");


        // Exercicio 4
        System.out.println("\nExercicio 4");
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(10.0);
        Exercicio.mediaNota(notas);

        // Exercicio 5
        System.out.println("\nExercicio 5");
        Exercicio.diariaHospede("Paulo", "A", 15, 200.0);
        
    }
}
