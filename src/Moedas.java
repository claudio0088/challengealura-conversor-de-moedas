public record Moedas(String baseCode,double ars,double bob,
                     double brl, double cop
        ,double usd) {

    public double converterDolarParaReal(double valor){
        return  valor * brl;

    }

}

