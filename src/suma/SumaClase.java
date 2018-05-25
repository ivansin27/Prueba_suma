//package suma;

public class SumaClase {
	

	public static void main(String[] args){
		
		System.out.print("###  Suma  ###\n");
		System.out.print("Valores iniciales num1=2, num2=2\n\n");
		SumaClase r=new SumaClase(2, 2);
		r.sumar();

	}
	
	private int num1;
	private int num2;
	
	public SumaClase(int n1, int n2){
		
		num1=n1;
		num2=n2;
	}
	   public int sumar() {
	       int resultado = num1 + num2;
	       System.out.print("resultado"+resultado+"\n\n");
	       return resultado;
	 }
	   
}
