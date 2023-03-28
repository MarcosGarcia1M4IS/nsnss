package holamundo;
import java.util.Scanner;
public class Clase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);
int num = 0, cant= 0, i = 1, suma = 0, n = 0;


System.out.println("Cantidad de números");
cant = tc.nextInt();

do {
	
	System.out.println("Ingrese el"+ "["+ i +"]"+ "numero");	
	num = tc.nextInt();
if (num > 0) {
	suma = suma + num;
} else if (num <= 0) {
	n = n + 1;
}
	i = i + 1;
} while (i <= cant);

	System.out.println("La suma de los números es: " + suma);
	System.out.println("La cantidad de lo números negativos es: " + n);

	}

}
