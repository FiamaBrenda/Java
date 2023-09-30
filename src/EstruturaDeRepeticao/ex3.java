package EstruturaDeRepeticao;

public class ex3 {
    public static void main(String[] args) throws InterruptedException  {

        String[] listaCarros = {"Opala", "C3", "I30", "Santa Fe"};

        for (String cadaCarro : listaCarros)
        {
            System.out.println(cadaCarro);
            Thread.sleep(1000);

        }
    }
}
