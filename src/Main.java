import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Moeda moeda = new Moeda();
        MoedaService moedaService = new MoedaService();

        boolean finish = false;

        do {
            System.out.println("""
                    Bem-vindo a calculadora de valores
                    
                    DIGITE 1 PARA CALCULAR DE DÓLAR PARA REAL
                    DIGITE 2 PARA CALCULAR DE REAL PARA DÓLAR
                    DIGITE 3 PARA SAIR""");

            Scanner leitor = new Scanner(System.in);
            String resposta = leitor.nextLine();
            switch (resposta) {
                case "1":
                    moedaService.calcularConversaoDolarParaReal();
                    break;
                case "2":
                    moedaService.calcularConversaoRealParaDolar();
                    break;
                case "3":
                    finish = true;
                    break;
                default:
                    System.out.println("Erro");
            }
        } while (!finish);
    }
}

