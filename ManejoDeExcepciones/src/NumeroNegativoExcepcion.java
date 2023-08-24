import java.util.Scanner;

//NumeroNegativoExcepcion
public class NumeroNegativoExcepcion extends Exception{
    public NumeroNegativoExcepcion(){
        super();
    }

    public NumeroNegativoExcepcion(String cadena){
        super(cadena);
    }

    public static void main(String[] args) throws NumeroNegativoExcepcion {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero para obtener su raiz: ");
        int input = scan.nextInt();

        if (input >= 0){
            System.out.println("La raiz cuadrada es: " + Math.sqrt(input));
        }
        else {
            throw new NumeroNegativoExcepcion("Se introdujo un valor negativo.");
        }
    }
}
