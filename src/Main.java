public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Moedas novasMoedas = conversor.converterMoedas();

        System.out.println(novasMoedas.converteDolarParaReal(40));
        System.out.println(novasMoedas);
    }
}