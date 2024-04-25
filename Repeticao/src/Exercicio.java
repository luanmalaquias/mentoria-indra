import java.util.ArrayList;



public class Exercicio {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> valores = new ArrayList<>();

        while (true) {
            int valor = Integer.parseInt(System.console().readLine("Digite o valor: "));
            if (valor == 0) break;
            valores.add(valor);
        }
        
        Integer maior = valores.get(0);
        Integer menor = valores.get(0);

        for (Integer i : valores) {
            if (i == 0)
                break;
            maior = (i > maior) ? i : maior;
            menor = (i < menor) ? i : menor;
        }

        System.out.println("Maior: " + maior + " Menor: " + menor);

    }
}