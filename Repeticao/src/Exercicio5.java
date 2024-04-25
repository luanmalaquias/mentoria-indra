public class Exercicio5 {
    public static void main(String[] args) throws Exception {

        int numeroSorteado = (int) (Math.random() * 100);
        for (int i = 0; i < 5; i++) {
            int numeroDigitado = Integer.parseInt(System.console().readLine("> Digite um número entre 0 e 100: "));
            
            if ((numeroSorteado - 5) < numeroDigitado && (numeroSorteado + 5) > numeroDigitado) {
                System.out.println("Está quente!");
            } else {
                System.out.println("Está frio!");
            }

            if (numeroDigitado < numeroSorteado) {
                System.out.println("O número sorteado é maior.");
            } else {
                System.out.println("O número sorteado é menor.");
            }

            if (numeroDigitado == numeroSorteado) {
                System.out.println("Parabéns, você acertou!");
                break;
            } else {
                System.out.println("Tente novamente.");
            }
        }

    }
}
