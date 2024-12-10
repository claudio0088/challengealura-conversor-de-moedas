import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Moedas novasMoedas = conversor.converterMoedas();
        Scanner leitura = new Scanner(System.in);

        var opcoes = 0;

        while (opcoes !=7){
            System.out.println("" +
                    "\n*******************************************************************" +
                    "\n Seja bem-vindo/a ao Conversor de Moeda ^^" +
                    "\n1) Dólar ->> Peso argentino" +
                    "\n2) Peso argentino ->> Dólar" +
                    "\n3) Dólar ->> Real brasileiro" +
                    "\n4) Real brasileiro ->> Dólar" +
                    "\n5) Dólar ->> Peso colombiano" +
                    "\n6) Peso colombiano ->> Dólar" +
                    "\n7) Sair" +
                    "\nEscolha uma opção válida:" +
                    "\n*******************************************************************");
            opcoes = leitura.nextInt();

            if(opcoes == 1){
                System.out.println("Digite o valor que deseja converter");
                double recebe = leitura.nextDouble();
                var valor = novasMoedas.converteDolarParaPesoArgentino(recebe);
                System.out.println("Valor "+recebe+ " [USD] corresponde ao valor final " +
                        "de ->>  "+valor+" [ARS]");
            } else if (opcoes == 2) {
                System.out.println("Digite o valor que deseja converter");
                double recebe = leitura.nextDouble();
                var valor = novasMoedas.convertePesoArgentinoparaDolar(recebe);
                System.out.println("Valor "+recebe+ " [ARS] corresponde ao valor final " +
                        "de ->>  "+valor+" [USD]");

            } else if (opcoes == 3) {
                System.out.println("Digite o valor que deseja converter");
                double recebe = leitura.nextDouble();
                var valor = novasMoedas.converteDolarParaReal(recebe);
                System.out.println("Valor "+recebe+ " [USD] corresponde ao valor final " +
                        "de ->>  "+valor+" [BRL]");

            } else if (opcoes == 4) {
                System.out.println("Digite o valor que deseja converter");
                double recebe = leitura.nextDouble();
                var valor = novasMoedas.converteRealParaDolar(recebe);
                System.out.println("Valor "+recebe+ " [BRL] corresponde ao valor final " +
                        "de ->>  "+valor+" [USD]");

            } else if (opcoes == 5) {
                System.out.println("Digite o valor que deseja converter");
                double recebe = leitura.nextDouble();
                var valor = novasMoedas.converteDolarParaPesoColombiano(recebe);
                System.out.println("Valor "+recebe+ " [USD] corresponde ao valor final " +
                        "de ->>  "+valor+" [COP]");

            } else if (opcoes == 6) {
                System.out.println("Digite o valor que deseja converter");
                double recebe = leitura.nextDouble();
                var valor = novasMoedas.convertePesoColombianoParaDolar(recebe);
                System.out.println("Valor "+recebe+ " [COP] corresponde ao valor final " +
                        "de ->>  "+valor+" [USD]");
            } else {
                System.out.println("Opção não encontrada");
            }


        }
        

        //System.out.println(novasMoedas.converteDolarParaReal(40));
        //System.out.println(novasMoedas);
    }
}