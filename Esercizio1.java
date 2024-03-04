import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {

     int prodotto = moltiplica(5,10);
        System.out.println(prodotto);

        String risultato = concatena("ciao", 10);
        System.out.println(risultato);

        String[] array= new String[] {"mela", "pera", "banana", "fragola", "limone" };
        inserisciInArray(array, "pesca");


    }
    public static int moltiplica(int num1, int num2){
    return (num1*num2);
    }

    public static String concatena (String str, int num){
        return (str + num);
    }

    public static void inserisciInArray (String[] firstArray, String str1){

    String[] nuovoArray = new String[firstArray.length + 1];

        for (int i = 0; i < 3; i++) {
            nuovoArray[i] = firstArray[i];
        }

        nuovoArray[3] = str1;

        for (int i =4; i< nuovoArray.length; i++){
        nuovoArray[i] = firstArray[i - 1];
        }

        System.out.println(Arrays.toString(nuovoArray));
        }
}
