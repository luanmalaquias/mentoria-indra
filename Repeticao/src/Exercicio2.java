public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        
        final String SENHA = "indra%DEV2024";

        for (int i = 0; i < 3; i++) {
            String senhaDigitada = System.console().readLine("> Digite a senha: ");
            if (senhaDigitada.equals(SENHA)) {
                System.out.println("Senha correta. Acesso liberado.");
                break;
            } else {
                System.out.println("Senha incorreta.");
                if (i == 2) System.out.println("Acesso bloqueado.");
            }
        }

    }
}
