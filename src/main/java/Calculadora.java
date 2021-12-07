import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Operaciones op= new Operaciones();
        int numeroUno, numeroDos, control;
        numeroUno=numeroDos=control=0;

        do {
            System.out.println("Calculadora");

            System.out.print("Ingrese numero uno: ");
            numeroUno=input.nextInt();
            System.out.print("Ingrese numero dos: ");
            numeroDos=input.nextInt();

            System.out.print("1. Suma \n" +
                    "2. Resta \n" +
                    "3. Multiplicacion \n" +
                    "4. Division \n" +
                    "0. Salir \n" +
                    "Ingrese la opcion que desea realizar: ");
            control=input.nextInt();



            switch (control){
                case 1: System.out.println(op.suma.applyAsInt(numeroUno,numeroDos));break;
                case 2: System.out.println(op.resta.applyAsInt(numeroUno,numeroDos));break;
                case 3: System.out.println(op.multiplicacion.applyAsInt(numeroUno,numeroDos));break;
                case 4: System.out.println(op.division.applyAsInt(numeroUno,numeroDos));break;
                default: System.out.println("opcion incorrecta ");
            }
        }while(control!=0);
    }

}
