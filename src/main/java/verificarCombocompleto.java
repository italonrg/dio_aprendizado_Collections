import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço

        Map<String , Boolean> servicosArmazenados = new HashMap<>();
        servicosArmazenados.put("movel",false);

        // TODO: Itere sobre os serviços contratados
        for (String servico : servicosContratados) {
            boolean selecao = false;
            if (servico.contains("movel,tv,banda larga")){

            }

        }

        // TODO: Verifique se todos os serviços foram contratados
        if () {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}