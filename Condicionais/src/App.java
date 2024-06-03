import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Exercicio 1
        Exercicio1.idadeNadador(6);
        Exercicio1.idadeNadador(9);
        Exercicio1.idadeNadador(18);

        // Exercicio 2
        System.out.println("\nExercicio 2");
        Exercicio1.calculadora(2, 3, "+");
        Exercicio1.calculadora(2, 3, "-");
        Exercicio1.calculadora(2, 3, "*");

        // Exercicio 3
        System.out.println("\nExercicio 3");
        Exercicio1.classificacaoCaractere("a");
        Exercicio1.classificacaoCaractere("b");
        Exercicio1.classificacaoCaractere(1);
        Exercicio1.classificacaoCaractere("!");


        // Exercicio 4
        System.out.println("\nExercicio 4");
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(10.0);
        Exercicio1.mediaNota(notas);

        // Exercicio 5
        System.out.println("\nExercicio 5");
        Exercicio1.diariaHospede("Paulo", "A", 15, 200.0);
        
    }
}
