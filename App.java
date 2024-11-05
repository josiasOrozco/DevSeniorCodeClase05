import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        showMenu(scanner);
        scanner.close();
    }

    private static void showMenu(Scanner scanner) {
    int option;
     do {
        System.out.println("====================");
        System.out.println("Menu Clase 5");
        System.out.println("1. Prueba ciclo while");
        System.out.println("2. Prueba ciclo do while");
        System.out.println("3. Prueba ciclo for");
        System.out.println("0. Salir de la aplicacion");
        System.out.println("Ingresa una opcion:");
        option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1:
                whileTest();
                break;
            case 2:
                doWhileTest();
                break;
            case 3:
                forTest();
            case 0:
                System.out.println("Good Bye");
                break;
            default:
                System.err.println("Ingrese una opcion valida");
                break;
        }
       if (option !=0) {
        pressEnter(scanner);
       }
        
    }while(option != 0);
    }

    private static void pressEnter(Scanner scanner){
        System.out.println("Presiente Enter para continuar");
        scanner.nextLine();
    }

    private static void forTest() {
        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
        System.out.println("You Win!");
    }

    private static void doWhileTest() {
        var counter = 1;
        do {
            System.out.println(counter);
            // avance
            counter--;
        } while (counter > 0);
        System.out.println("Boom");
    }

    private static void whileTest() {
        var counter = 0;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }

}