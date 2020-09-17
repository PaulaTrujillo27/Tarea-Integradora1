import java.util.Scanner;

public class TareaIntegradora1 {
	
	public static Scanner reader = new Scanner(System.in);	
	public final static int ROUGHCONSTRUCTION=1300000;
	public static final int FINALCONSTRUCTION=2600000;
	public static final int PAINTING=980000;
	
	
	public static void main(String[] args){
		
		System.out.println("Ingrese la cantidad de materiales a comprar");
		int materials=reader.nextInt();
		
		
		
		String[] names=new String[materials];
		double[] priceHC=new double[materials];
		double priceDowntown[]=new double[materials];
		double priceNBH[]=new double[materials];
		int [] amountMaterial= new int[materials];
		String[] typeConstruction=new String[materials];
		reader.nextLine();
		
		
		for(int a=0; a<materials; a++){
		System.out.println("Ingrese el nombre del material");
			names[a]=reader.nextLine();
			reader.nextLine();
		System.out.println("Ingrese la cantidad de " +names[a]);
		    amountMaterial[a]=reader.nextInt();
			reader.nextLine();
			System.out.println("Ingrese la utilidad de " +names[a]);
		     typeConstruction[a]=reader.nextLine();
			 reader.nextLine();
			
		}
			

			System.out.println("El valor total en homecenter es " + TotalPayHC(materials,  priceHC, amountMaterial));
			System.out.println("El valor total de la ferreteria del centro es " + TotalPayDowntown(materials,  priceDowntown, amountMaterial) );
			System.out.println("El valor del producto en la ferreteria del barrio es  " + TotalPayNBH(materials,  priceNBH, amountMaterial) );
		
	}
	
	     public static double[] HomeCenter (double priceHC[], String[] names, int materials){
			 int i;
	     for(i=0;i<materials; i++) {
         System.out.println("Ingrese el precio del" +names[i]+" en Home Center");
         priceHC[i]= reader.nextDouble();
				
		 }
		 return priceHC;
		
	}
	
	 public static double[] DowntownStore (double[] priceDowntown, String[] names, int materials){
		 int i;
	     for(i=0;i<materials; i++) {
			 
         System.out.println("Ingrese el precio del" +names[i]+" en la ferreteria del centro");
         priceDowntown[i]= reader.nextDouble();
				
		 }
		 return priceDowntown;
		
	}
	
	 public static double[] Neighborhood  (double[] priceNBH, String[] names, int materials){
		 int i;
	     for(i=0;i<materials; i++) {
         System.out.println("Ingrese el precio del" +names[i]+" en la ferreteria del barrio");
         priceNBH[i]= reader.nextInt();
				
		 }
		 return priceNBH;
		
	}
	
	
	public static double TotalPayHC( int materials, double[] priceHC, int[] amountMaterial){
		int i;
		double countHC = 0; 
		for(i = 0; i < materials; i++){
			
			double totalHC = priceHC[i] * amountMaterial[i];
			countHC = (totalHC + countHC);
			
			
		}
		return countHC;
		
	}
	
	
	public static double TotalPayDowntown( int materials, double[] priceDowntown, int[] amountMaterial){
		int i;
		double countDowntown = 0; 
		for(i = 0; i < materials; i++){
			
			double totalDowntown = priceDowntown[i] * amountMaterial[i];
			countDowntown = (totalDowntown + countDowntown);
		
			
		}
		return countDowntown;
	}
	
	
	public static double TotalPayNBH( int materials, double[] priceNBH, int[] amountMaterial){
		int i;
		double countNBH = 0; 
		for(i = 0; i < materials; i++){
			
			double totalNBH = priceNBH[i] * amountMaterial[i];
			countNBH = totalNBH + countNBH;
			
			
		}
		return countNBH;
	}
}