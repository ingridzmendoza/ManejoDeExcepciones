import java.util.Scanner;

//metodo caracterEn
public class Main {
    public static char caracterEn(String cadena, int entero) throws Exception{ //calar lo del static
        if(entero >= 0 && entero <= cadena.length()){
            return cadena.charAt(entero);
        }
        else{
            throw new Exception();
        }
    }

//main
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String lectTeclado = scan.nextLine();
        System.out.println("Caracter de la cadena " + lectTeclado + " en posicion 7: ");

        try{
            char resultadoMetodo = caracterEn(lectTeclado, 7);
            System.out.println(resultadoMetodo);
        } catch (Exception e) {
            throw new Exception("Has intentado recuperar una posicion de la cadena de caracteres que no existe");
        }
    }

}
