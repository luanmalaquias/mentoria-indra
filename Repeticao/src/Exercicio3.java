import java.util.ArrayList;



public class Exercicio3 {
    public static void main(String[] args) throws Exception {

        class Aluno {
            String matricula;
            String nome;
            double media;
            String situacao;
    
            public Aluno(String matricula, String nome, double media, String situacao) {
                this.matricula = matricula;
                this.nome = nome;
                this.media = media;
                this.situacao = situacao;
            }
        }

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        while (true) {
            String matricula = System.console().readLine("> Digite a matrícula, digite 0 (zero) para finalizar: ");
            if (matricula.equals("0"))
                break;
            String nome = System.console().readLine("Digite o nome: ");

            double nota1 = Double.parseDouble(System.console().readLine("Digite a nota 1: "));
            double nota2 = Double.parseDouble(System.console().readLine("Digite a nota 2: "));
            // operador ternário duplo
            // para verificar se a nota é maior que 10 ou menor que 0
            nota1 = (nota1 > 10) ? 10 : (nota1 < 0) ? 0 : nota1;
            nota2 = (nota2 > 10) ? 10 : (nota2 < 0) ? 0 : nota2;

            double media = (nota1 + nota2) / 2;
            String situacao = (media >= 7) ? "Aprovado" : "Reprovado";
            alunos.add(new Aluno(matricula, nome, media, situacao));
        }

        System.out.println("\nAlunos cadastrados:");
        for (Aluno aluno : alunos) {
            System.out.println("Matrícula: " + aluno.matricula + ", Nome: " + aluno.nome + ", Média: " + aluno.media
                    + ", Situação: " + aluno.situacao);
        }
    }
}
