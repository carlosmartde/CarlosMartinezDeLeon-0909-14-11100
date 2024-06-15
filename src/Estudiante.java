import java.util.Arrays;
import java.util.Scanner;

public class Estudiante {
   public String lista(){
       Scanner scanner = new Scanner(System.in);
       int n=5;
       String[] nombre = new String[n];
       int[] calificacion= new int[n];
       System.out.println("INGRESA LOS NOMBRES DE LOS ESTUDIANTES");
       for (int i = 0; i < n; i++) {
           nombre[i]=scanner.nextLine();
       }

       System.out.println("Introduce las calificaciones");
       for (int i = 0; i < n; i++) {
           calificacion[i] = scanner.nextInt();
       }

       for (int i=0; i<=5; i++) {
           System.out.print(nombre[i] + " "+calificacion[i]);
           System.out.println("\n");
       }

       return null;
   }
}
