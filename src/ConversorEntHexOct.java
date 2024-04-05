import java.util.Scanner;
public class ConversorEntHexOct {
    public static void main(String[] args) {

        Scanner conversor = new Scanner(System.in);

        System.out.println("Por favor, ingrese 16 digitos en binario: ");
        String bin = conversor.nextLine();

        if (bin.length() != 16) {
            System.out.println("Para realizar la conversión es necesario que los dígitos binarios sean 16 exactamente");
            return;
        }

        int decimal = Integer.parseInt(bin, 2);

        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        String octal = Integer.toOctalString(decimal);


        System.out.println("El número " + bin + " equivale a " + decimal + " en decimal");
        System.out.println("El número " + bin + " equivale a " + hexadecimal + " en hexadecimal");
        System.out.println("El número " + bin + " equivale a " + octal + " en octal");

        conversor.close();
    }
}