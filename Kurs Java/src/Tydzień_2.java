import java.util.Scanner;

public class Tydzień_2 {
    Scanner scanner = new Scanner(System.in);

public static void main(String[] args)
{
    // zadanie1();
    // zadanie2();
    // zadanie3();
    // zadanie4();
    // zadanie5();
    zadanie6();

}

    public static void zadanie1()
    {
        // Wyświetlanie podanego imienia, nazwiska i wieku

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String imię = scanner.next();

        System.out.println("Podaj nazwisko: ");
        String nazwisko = scanner.next();

        System.out.println("Podaj wiek: ");
        int wiek = scanner.nextInt();

        System.out.println(imię + " " + nazwisko + " " + wiek + " lat");
    }

    public static void zadanie2()
    {
        // Przeliczanie stopni celcjusza na fahrenheita

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj temperaturę w stopniach Celsjusza: ");
        float stopnieC1 = scanner.nextFloat();
        float stopnieF1 = (float)stopnieC1 * 9 / 5 + 32;
        System.out.println("Stopnie Celsjusza " + stopnieC1 + ", stopnie Fahrenheita " + stopnieF1);

    }
    public static void zadanie3()
    {
        // Przeliczanie stopni fahrenheita na celcjusza

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj temperaturę w stopniach Fahrenheita: ");
        float stopnieF2 = scanner.nextFloat();
        float stopnieC2 = ((float)stopnieF2 -32) * 5 / 9;
        System.out.println("Stopnie Celsjusza " + stopnieC2 + ", stopnie Fahrenheita " + stopnieF2);

    }

    public static void zadanie4()
    {
        // Obliczanie długości przeciwprostokątnej w trójkącie prostokątnym

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość boku pierwszej przyprostokątnej:");
        float przyp1 = scanner.nextFloat();
        System.out.println("Podaj długość boku drugiej przyprostokątnej:");
        float przyp2 = scanner.nextFloat();
        double przep = Math.sqrt(przyp1 * przyp1 + przyp2 * przyp2);
        System.out.println("Długość boku przciwprostokątnej to: " + przep);

    }

    public static void zadanie5()
    {
        // Kalkulator BMI

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj masę ciała w kilogramach: ");
        float masa = scanner.nextFloat();
        System.out.println("Podaj wzrost w metrach: ");
        float wzrost = scanner.nextFloat();
        double bmi = masa / (wzrost * wzrost);
        System.out.println("BMI: " + bmi);

    }

    public static void zadanie6()
    {
        // Siła zderzenia czołowego dwóch samochodów

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj masę pierwszego pojazdu w kilogramach: ");
        float m1 = scanner.nextFloat();
        System.out.println("Podaj prędkość pierwszego pojazdu w km/h: ");
        float prędkość1 = scanner.nextFloat();
        double a1 = prędkość1 / 3.6;
        System.out.println("Podaj masę drugiego pojazdu w kilogramach: ");
        float m2 = scanner.nextFloat();
        System.out.println("Podaj prędkość drugiego pojazdu w km/h: ");
        float prędkość2 = scanner.nextFloat();
        double a2 = prędkość1 / 3.6;
        double f = (m1 * a1) + (m2 * a2);
        System.out.println("Siła zderzenia to: " + f + "N");

    }
}
