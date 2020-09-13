import java.util.Scanner;

public class TareaIntegradora1 {
	public final static int BLACKWORK=1300000;
	public static final int WHITEWORK=2600000;
	public static final int PAINTING=980000;
	
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de materiales a comprar");
		int materials=reader.nextInt();
		String[] names=new String[materials];
		double[] amount=new double[materials];
		String[] typeUse=new String[materials];
		
		for(int i=0; i<materials; i++){
		System.out.println("Ingrese el nombre del material"+(i+1));
			names[i]=reader.nextLine();
			reader.nextLine();
		System.out.println("Ingrese la cantidad del material"+(i+1));
		    amount[i]=reader.nextDouble();
			reader.nextLine();
		System.out.println("Ingrese la utilidad del material"+(i+1));
		     typeUse[i]=reader.nextLine();
			 reader.nextLine();
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}