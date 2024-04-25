import java.util.HashMap;



public class Exercicio4 {
    public static void main(String[] args) throws Exception {

        class Emissoras {
            static HashMap<String, Integer> emissoras = new HashMap<String, Integer>();
            static int totalEspectadores = 0;
            static int totalCasas = 0;
        
            static void inserirEspectadores(String emissora, int espectadores) {
                totalCasas += 1;
                totalEspectadores += espectadores;
                if (!emissoras.containsKey(emissora)) {
                    emissoras.put(emissora, espectadores);
                } else {
                    emissoras.put(emissora, emissoras.get(emissora) + espectadores);
                }
            }
        
            static void mostrarPorcentagem() {
                System.out.println("\nResultado final:");
                System.out.println("Total de espectadores: " + totalEspectadores);
                System.out.println("Total de casas pesquisadas: " + totalCasas);
                System.out.println("Porcentagem de espectadores por emissora:");
                for (String key : emissoras.keySet()) {
                    double porcentagem = (emissoras.get(key) * 100) / totalEspectadores;
                    System.out.println("Emissora " + key + ": " + porcentagem + "%" + " - " + emissoras.get(key)
                            + " espectadores");
                }
            }
        
        }
        
        while (true) {
            String valores = System.console().readLine("> Digite o número da emissora e o numero de espectadores separados por espaço, digite os dois valores 0 (zero) para finalizar: ");
        
            String[] valoresSplit = valores.split(" ");
            String emissora = valoresSplit[0];
            int espectadores = Integer.parseInt(valoresSplit[1]);
        
            if (emissora.equals("0"))
                break;
        
            Emissoras.inserirEspectadores(emissora, espectadores);
        }
        
        Emissoras.mostrarPorcentagem();
    }
}


