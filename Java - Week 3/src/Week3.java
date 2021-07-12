import java.util.Scanner;

public class Week3
{
    public static void task1(Scanner scanner)
    {
        // Which person is older, and which younger

        System.out.println("Name of the first person:");
        String name1 = scanner.next();
        System.out.println("Age of the first person:");
        int age1 = scanner.nextInt();

        System.out.println("Name of the second person:");
        String name2 = scanner.next();
        System.out.println("Age of the second person:");
        int age2 = scanner.nextInt();

        if(age1 > age2)
            System.out.println(name1 + " is older, " + name2 + " is younger");
        else if(age1 < age2)
            System.out.println(name2 + " is older, " + name1 + " is younger");
        else
            System.out.println("They are at the same age");
    }

    public static void task2(Scanner scanner)
    {
        // Whose name is longer

        System.out.println("Name of the first person:");
        String name1 = scanner.next();
        int name1Length = name1.length();
        System.out.println("Name of the second person:");
        String name2 = scanner.next();
        int name2Length = name2.length();

        if(name1Length > name2Length)
            System.out.println(name1 + " has longer name than " + name2);
        else if(name1Length < name2Length)
            System.out.println(name2 + " has longer name than " + name1);
        else
            System.out.println("Both names have the same length");
    }

    public static void ageComparison(String name1, int age1, String name2, int age2)
    {
        if(age1 > age2)
            System.out.println(name1 + " is older, " + name2 + " is younger");
        else if(age1 < age2)
            System.out.println(name2 + " is older, " + name1 + " is younger");
        else
            System.out.println(name1 + " and " + name2 + " are at the same age");
    }

    public static String ageCategories(int age)
    {
        if (age <= 10)
            return "kid";
        else if (age <= 17)
            return "teenager";
        else if (age <= 70)
            return "adult";
        else
            return "senior";
    }

    public static void task3(Scanner scanner)
    {
        // Which person is older, and which younger (3 people) + categories

        System.out.println("Name of the first person:");
        String name1 = scanner.next();
        System.out.println("Age of the first person:");
        int age1 = scanner.nextInt();

        System.out.println("Name of the second person:");
        String name2 = scanner.next();
        System.out.println("Age of the second person:");
        int age2 = scanner.nextInt();

        System.out.println("Name of the third person:");
        String name3 = scanner.next();
        System.out.println("Age of the third person:");
        int age3 = scanner.nextInt();

        // Who is older, and who is younger
        ageComparison(name1,age1,name2,age2);
        ageComparison(name2,age2,name3,age3);
        ageComparison(name3,age3,name1,age1);

        // Age categories
        String name1AgeCategory = ageCategories(age1);
        String name2AgeCategory = ageCategories(age2);
        String name3AgeCategory = ageCategories(age3);
        System.out.println(name1 + " is a(n) " + name1AgeCategory + ", " + name2 + " is a(n) " + name2AgeCategory + ", " + name3 + " is a(n) " + name3AgeCategory);
    }

    public static void letterCheck(String letter)
    {
        switch (letter)
        {
            case "a":
                System.out.println("That is correct, you have entered the letter 'a'.");
                break;
            case "b":
                System.out.println("That is correct, you have entered the letter 'b'.");
                break;
            case "c":
                System.out.println("That is correct, you have entered the letter 'c'.");
                break;
            case "d":
                System.out.println("That is correct, you have entered the letter 'd'.");
                break;
            case "e":
                System.out.println("That is correct, you have entered the letter 'e'.");
                break;
            default:
                System.out.println(letter + " is not the correct letter.");
        }
    }

    public static void task4(Scanner scanner)
    {
        // Does user insert a or b or c or d or e?

        System.out.println("Please enter one of the following letters: a, b, c, d, e.");
        String letter = scanner.next();

       letterCheck(letter);
    }

    public static void task5(Scanner scanner)
    {
        // Does user insert a or b or c or d or e? + Converting from capital letters

        System.out.println("Please enter one of the following letters: a, b, c, d, e.");
        String letter = scanner.next().toLowerCase();

        letterCheck(letter);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // task1(scanner);
        // task2(scanner);
        // task3(scanner);
        // task4(scanner);
        // task5(scanner);
    }
}
