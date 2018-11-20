import java.util.Scanner;

public class Ejer1Func {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Devolvera un numero elevado a un exponente digitado, ambos enteros
		int resp;
		int base;
		int exp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese una base");
		base=sc.nextInt();
		System.out.println("Ingrese exponente");
		exp=sc.nextInt();
		resp=Ejer(base,exp);   //invoco la funcion
		System.out.println(base+" elevado a "+exp+" es "+resp);

	} //esta es la funcion
	static int Ejer(int x, int y){
		int resp=x;
		for(int i =1;i<y;i++){ //multiplicara el numero por si mismo tantas veces como sea el valor de y
			resp=resp*x;
		}return resp;
	}

}
