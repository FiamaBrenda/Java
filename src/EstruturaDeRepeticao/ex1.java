package EstruturaDeRepeticao;

public class ex1 {
    public static void main(String[] args) {
        String[] listaProfessores = {"Alexia", "Odirle", "Jessica", "Toago"};

        for (int contador = 0 ; contador <listaProfessores.length;contador++){

            if(contador ==0 ){
                System.out.println("O  numero do indice do professor " + listaProfessores[contador] + " e zero ");
            }
            else if (contador % 2 == 0){
                System.out.println("O numero do indice do professos " +
                        listaProfessores[contador] + " e par ");
            }else {
                System.out.println("O numero do indice do professos " +
                        listaProfessores[contador] + " e impar ");
            }
        }
    }
}
