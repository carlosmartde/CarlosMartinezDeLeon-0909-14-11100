import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("**************MENU**************");
            System.out.println("[1] ");
            System.out.println("[0] SALIR DEL PROGRAMA");
            System.out.println("SELECCIONA UNA OPCION:");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1: {

                }
                break;
                case 2: {
                }
                break;
                case 0:{
                    System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
                    return;
                }
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 0);


    }
}