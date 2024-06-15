import java.sql.Array;
import java.util.Scanner;

public class ExamenFinalVarianteB {
    public float mayor(){
        Scanner entrada = new Scanner(System.in);
        float num1,num2,num3;
        System.out.println("INGRESE EL PRIMER NUMERO:");
        num1 = entrada.nextFloat();
        System.out.println("INGRESE EL SEGUNDO NUMERO:");
        num2 = entrada.nextFloat();
        System.out.println("INGRESE EL TERCER NUMERO:");
        num3 = entrada.nextFloat();
        if(num1 > num2 && num1 > num3){
            System.out.println(+num1+" ES EL NUMERO MAYOR");
        }else if(num2 > num1 && num2 > num3){
            System.out.println(+num2+" ES EL NUMERO MAYOR");
        }else {
            System.out.println(+num3+" ES EL NUMERO MAYOR");
        }
        return 0;
    }
    public int tabla (){
        Scanner entrada = new Scanner(System.in);
        int multiplicacion;
        System.out.println("INGRESE EL NUMERO DEL QUE DESEA LA TABLA DE MULTIPLICAR");
        int num=entrada.nextInt();
        for (int i=1; i<=10; i++){
            multiplicacion=i*num;
            System.out.println(+i+" x "+num+" = "+multiplicacion);
        }
        return 0;
    }
    public float calculadora(){
        Scanner entrada =new Scanner(System.in);
        System.out.println("INGRESE EL PRIMER NUMERO");
        float num1=entrada.nextFloat();
        System.out.println("INGRESE EL OPERADOR QUE DESEA");
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        float num2= entrada.nextFloat();
        return 0;
    }

    public int primo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo && num > 1) {
            System.out.println("El número "+num+" si es primo.");
        } else {
            System.out.println("El número "+num+" no es primo.");
        }
        return num;
    }
}
