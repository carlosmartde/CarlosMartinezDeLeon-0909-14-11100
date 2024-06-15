import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("**************MENU**************");
            System.out.println("[1] NUMERO MAYOR ");
            System.out.println("[2] TABLAS DE MULTIPLICAR");
            System.out.println("[3] CALCULADORA");
            System.out.println("[4] NUMEROS PRIMOS");
            System.out.println("[5] LISTA DE ESTUDIANTES Y SU CALIFICACION");
            System.out.println("[0] SALIR DEL PROGRAMA");
            System.out.println("SELECCIONA UNA OPCION:");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1: {
                    ExamenFinalVarianteB examen = new ExamenFinalVarianteB();
                    examen.mayor();
                }
                break;
                case 2: {
                    ExamenFinalVarianteB examen = new ExamenFinalVarianteB();
                    examen.tabla();
                }
                break;
                case 3: {
                    System.out.println("NO FUNCIONA");
                }
                break;
                case 4:{
                    ExamenFinalVarianteB examen= new ExamenFinalVarianteB();
                    examen.primo();
                }
                break;
                case 5:{
                    Estudiante estudiante=new Estudiante();
                    estudiante.lista();
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