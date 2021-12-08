import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class Calculadora {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Operaciones op= new Operaciones();
        int  control=1;
        String menu="   Calculadora \n" +
            "1. Suma\n" +
            "2. Resta\n" +
            "3. Multiplicacion\n" +
            "4. Division\n" +
            "0. Salir\n" +
            "Ingrese la opcion que desea realizar: ";

        while(control!=0){
            System.out.println(menu);
            control=input.nextInt();
            switch (control){
                case 1: operacion(op.suma,input);break;
                case 2: operacion(op.resta,input);break;
                case 3: operacion(op.multiplicacion,input);break;
                case 4: operacion(op.division,input);break;
                default: System.out.println("opcion incorrecta ");
            }
        };
    }

    public static void operacion(IntBinaryOperator operacion, Scanner input){
        System.out.println(
        operacion.applyAsInt(pedirNumero("primer",input),pedirNumero("segundo",input)));
    }

    public static int pedirNumero(String numero, Scanner input){
        System.out.print("Ingrese "+numero+" numero : ");
        return input.nextInt();
    }

}
