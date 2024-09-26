import java.util.Scanner;

public class main {
    public static double calcularVelocidadeMedia(String [] velocidades){
        int soma = 0;
        int velox = 0;
        for (String v : velocidades){
            soma += Integer.parseInt(v);//processo de conversão de String para int
            velox = soma /velocidades.length;

        }
        return velox;
    }

    public static String verificarQuedaConexao(String[] velocidades) {
        int converosor = 0;
        int verifivcador = 0;
        for (String v : velocidades) {
            converosor = Integer.parseInt(v);
            verifivcador = converosor;
            if (verifivcador == 0) {
                return "Queda de Conexao";
            }
        }
        return "Sem Quedas";
}
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);


            String input = scanner.nextLine();


            String[] velocidades = input.split(",");


            String resultado = verificarQuedaConexao(velocidades);


            System.out.println(resultado);

            scanner.close();
        }
    }


