import java.util.Scanner;

class Suma10Numeros{
	
	
	public static void main(String[] arg){
		Scanner teclado = new Scanner (System.in);
		int contador=1;
		double valorNum, sumaNum =0;
		//Datos de Entrada 
		do{
			System.out.println 	("Ingrese el numero de la posicion"+contador+":");
			valorNum = teclado.nextInt();
			sumaNum = sumaNum+valorNum;
			contador = contador+1;
			//Datos de Salida 
		System.out.println ("La suma de los 10 numeros es: "+sumaNum);
	}
}
