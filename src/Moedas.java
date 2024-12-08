public record Moedas(String baseCode,double ars,double bob,
                     double brl, double cop
        ,double usd) {

    public double converteDolarParaReal(double valor){
        return  valor * brl;
    }
    public double converteRealParaDolar(double valor){
        return valor / brl;
    }

    public double converteDolarParaPesoArgentino(double valor){
        return valor * ars;
    }
    public double convertePesoArgentinoparaDolar(double valor){
       return valor / ars;
    }

    public double converteDolarParaPesoColombiano(double valor){
        return valor * cop;
    }
    public double convertePesoColombianoParaDolar(double valor){
        return valor / cop;
    }




}

