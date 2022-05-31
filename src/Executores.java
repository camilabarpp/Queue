public abstract class Executores {

    public static long tempInicial;

    public static long tempFinal;


    public static void comecar(){
        tempInicial = System.currentTimeMillis();
    }

    public static void parar(){
        tempFinal = System.currentTimeMillis();

        long dif = (tempFinal - tempInicial);
        //status é um JLabel q tenho na minha aplicacao.
        System.out.println(String.format("Tempo de execução: %02d segundos  e %02d milisegundos", dif/1000, dif%100)); ;
    }


}