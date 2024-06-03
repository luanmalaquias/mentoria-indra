import java.util.ArrayList;
import java.util.List;

public class Exercicio {
    public stExercicio1 idadeNadador(int idade) {
        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Não existe categoria");
        }
    }

    public static void calculadora(int valor1, int valor2, String operacao) {
        if (operacao.equals("+")) {
            System.out.println(valor1 + valor2);
        } else if (operacao.equals("-")) {
            System.out.println(valor1 - valor2);
        } else if (operacao.equals("*")) {
            System.out.println(valor1 * valor2);
        } else if (operacao.equals("/")) {
            System.out.println(valor1 / valor2);
        } else {
            System.out.println("Operação inválida");
        }
    }

    public static void classificacaoCaractere(Object caractere){
        List<String> vogais = List.of("a", "e", "i", "o", "u");
        List<String> consoantes = List.of("b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z");

        if (caractere instanceof String) {
            if (vogais.contains(caractere)) {
                System.out.println("Vogal");
            } else if (consoantes.contains(caractere)) {
                System.out.println("Consoante");
            } else {
                System.out.println("Caractere especial");
            }
        }

        if (caractere instanceof Integer) {
            System.out.println("Número");
        }
        
    }

    public static void mediaNota(ArrayList<Double> notas) {
        double menorNota = notas.get(0);
        for (Double nota : notas) {
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        notas.remove(notas.indexOf(menorNota));

        double media = 0;
        for (Double nota : notas) {
            media += nota;
        }

        System.out.println("Média: " + media / notas.size());
    }

    public static void diariaHospede(String nome, String tipoApartamento, int dias, double consumoInterno){
        double valorDiaria = 0;
        switch (tipoApartamento) {
            case "A":
                valorDiaria = 150.0;
                break;
            case "B":
                valorDiaria = 100.0;
                break;
            case "C":
                valorDiaria = 75.0;
                break;
            case "D":
                valorDiaria = 50.0;
                break;
            default:
                valorDiaria = 50.0;
                break;
        }
        double totalDiarias = valorDiaria * dias;
        double subtotal = totalDiarias + consumoInterno;
        double taxaServico = subtotal * 0.1;
        double totalGeral = subtotal + taxaServico;

        System.out.println("Nome Hospede: " + nome);
        System.out.println("Tipo do apartamento: " + tipoApartamento);
        System.out.println("Dias: " + dias);
        System.out.println("Valor Diária: " + valorDiaria);
        System.out.println("Valor total das diárias: " + totalDiarias);
        System.out.println("Consumo interno: " + consumoInterno);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Taxa de serviço: " + taxaServico);
        System.out.println("Total geral: " + totalGeral);
    }

}
