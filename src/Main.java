public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Moedas novasMoedas = conversor.converterMoedas();

        System.out.println(novasMoedas.converterDolarParaReal(40));
        System.out.println(novasMoedas);
    }
}