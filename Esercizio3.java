import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);





        System.out.println("inserisci il valore della base");
        double base = scanner.nextDouble();
        System.out.println("inserisci il valore dell'altezza");
        double altezza = scanner.nextDouble();
        double perimetro1 = perimetroRettangolo(base,altezza);
        System.out.println(perimetro1);

        System.out.println("inserisci il valore di un numero intero");
        int number = scanner.nextInt();
        pariDispari(number);

        System.out.println("Inserisci i valori dei tre lati del triangolo");
        double lato1 = scanner.nextDouble();
        double lato2 = scanner.nextDouble();
        double lato3 = scanner.nextDouble();

        double areaTriangolo = perimetroTriangolo(lato1, lato2, lato3);
        System.out.println(areaTriangolo);

    }

    public static double perimetroRettangolo (double base,double altezza){
    double prodotto = (base*2)+(altezza*2);
        return prodotto;
    }

    public static void pariDispari (int num1){
        if(num1%2 == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }

    public static double perimetroTriangolo(double lato1, double lato2, double lato3){
        double semiperimetro = (lato1 + lato2 + lato3)/2;

        double area = Math.sqrt(semiperimetro*(semiperimetro-lato1)*(semiperimetro-lato2)*(semiperimetro-lato3));

        return area;
    }
}
