import java.util.Scanner;
public class Main {
        static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("quants nois hi ha?");
        int Nois = input.nextInt();
        input.nextLine();
        System.out.println("quants noies hi ha");
        int Noies=input.nextInt();
        input.nextLine();
        float Total=Noies+Nois;
        float percentNois=(Nois/Total)*100;
        float percentNoies=(Noies/Total)*100;
        System.out.println("Percentatge de noies:" + percentNoies + "%");
        System.out.println("Percentatge de noies:" + percentNoies + "%");
        System.out.println("git learning");
        System.out.println("je suis sur test");
        System.out.println("je viens de faire mon premier push");
        System.out.println("modification branche test");
        System.out.println("modification master");
    }
}
