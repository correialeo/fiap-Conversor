import java.util.Scanner;

public class MoedaService {
    Scanner leitor = new Scanner(System.in);
    Moeda moeda = new Moeda();

    public void calcularConversaoRealParaDolar(){
        moeda.setValorDolar(4.93);
        moeda.setValorReal(1.0);
        System.out.println("Qual a quantidade em real?");
        Double quantidadeReal = leitor.nextDouble();
        System.out.println("A quantidade convertida é: "+ quantidadeReal / moeda.getValorDolar());

    }
    public void calcularConversaoDolarParaReal(){
        moeda.setValorDolar(1.0);
        moeda.setValorReal(4.93);
        System.out.println("Qual a quantidade em dólar?");
        Double quantidadeDolar = leitor.nextDouble();
        System.out.println("A quantidade convertida é: "+ quantidadeDolar * moeda.getValorReal());
    }
}

