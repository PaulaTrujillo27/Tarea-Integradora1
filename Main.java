package ui;
import model.*;
import java.util.Scanner;
public class Main{
	
	public static Scanner reader = new Scanner(System.in);	
	
	
	public static void main(String[] args){
		
		
		int materialsDefinitive=amountTotalMaterials();
		String [] namesDefinitive=getMaterials(materialsDefinitive);
		double [] amountEachMaterialDefinitive= amountEachMaterial(namesDefinitive,materialsDefinitive);
		double[] priceHCDefinitive=HomeCenterPrice (namesDefinitive,materialsDefinitive);
		double[] priceDowntownDefinitive=DowntownStore(namesDefinitive, materialsDefinitive);
		double[] priceNBHDefinitive=neighborhoodStore (namesDefinitive, materialsDefinitive);
		int[] workTypeDefinitive=materialsUse(namesDefinitive,materialsDefinitive);
		int locationDefinitive=houseLocation();
		System.out.println("The total to pay of the work in HomeCenter is : " +Operations.TotalPayStores(  materials,priceHCDefinitive,amountEachMaterialDefinitive));
		System.out.println("The total to pay of the work in Downtown Store is : " +Operations.TotalPayStores(materials,priceDowntownDefinitive,amountEachMaterialDefinitive));
		System.out.println("The total to pay of the work in   is : " +Operations.TotalPayStores(materials,priceNBHDefinitive,amountEachMaterialDefinitive);
		double[] bestPriceDefinitive=+Operations.bestPrice(priceHCDefinitive,priceNBHDefinitive, priceDowntownDefinitive,materialsDefinitive, locationDefinitive);
		String[] bestStoreDefinitive=+Operations. bestStore(priceHCDefinitive,priceNBHDefinitive,priceDowntownDefinitive,materialsDefinitive,locationDefinitive);
		for(int i=0, i<materialsDefinitive,i++){
		System.out.println("The best price of the material " +namesDefinitive[i]+ "Is: " +bestPriceDefinitive[i]+ "in the: " +bestStoreDefinitive[i]+ " Store ");
		}
		
		useTypeSelection(workTypeDefinitive,namesDefinitive,materialsDefinitive);
	}
	

	public static int  amountTotalMaterials(){
	System.out.println("Enter the quantity of materials to buy");
	int materials = reader.nextInt();
	reader.nextLine();
	return materials;
    }
	
	public static String[] getMaterials(int materialsDefinitive){
		String[] names = new String[materialsDefinitive];
		for(int i=0; i<materialsDefinitive;i++){
			System.out.println("Enter the name of the material");
			names[i]=reader.nextLine();
		}
		return names;
	}		

	public static double [] amountEachMaterial(String[] namesDefinitive, int materialsDefinitive){
		double [] amountMaterial = new double [materialsDefinitive];
		for(int i=0; i<materialsDefinitive;i++){
			System.out.println("Enter the quantity of the material "+namesDefinitive[i]);
			amountMaterial[i]=reader.nextInt();
			reader.nextLine();
		}
		return amountMaterial;
	}	
	
	public static double [] HomeCenterPrice (String [] namesDefinitive, int materialsDefinitive){
		double[] priceHC = new double [materialsDefinitive]; 
		for(int i=0; i<materialsDefinitive;i++){
			System.out.println("Enter the cost of the material "+namesDefinitive[i]+" in HomeCenter");
			priceHC[i]=reader.nextDouble();
			reader.nextDouble();
		}
		return priceHC;
	}
	

	public static double [] DowntownStore(String [] namesDefinitive, int materialsDefinitive){
		double[] priceDowntown = new double [materialsDefinitive]; 
		for(int i=0; i<materialsDefinitive;i++){
			System.out.println("Enter the cost of the material "+namesDefinitive[i]+" in the Downtown's Store");
			priceDowntown[i]=reader.nextDouble();
			reader.nextDouble();
		}
		return priceDowntown;
	}
	
	
	public static double [] neighborhoodStore (String [] namesDefinitive, int materialsDefinitive){
		double[] priceNBH = new double [materialsDefinitive]; 
		for(int i=0; i<materialsDefinitive;i++){
			System.out.println("Enter the cost of the material "+namesDefinitive[i]+" in the Neighborhood's Store");
			priceNBH[i]=reader.nextDouble();
			reader.nextLine();
		}
		return priceNBH;
	}

	
		
	public static int [] materialsUse(String []namesDefinitive, int materialsDefinitive){
		int[] workType = new int [materialsDefinitive]; 
		for(int i=0; i<materialsDefinitive;i++){
			System.out.println("Which will be the use type of the material "+namesDefinitive[i]);
			System.out.println("Enter 1 for ROUGHCONSTRUCTION, 2 for FINALCONSTRUCTION, 3 for PAINTING");
			workType[i]=reader.nextInt();	
		}
		return workType;
	}
	

	
	public static void useTypeSelection (int [] workTypeDefinitive, String[] namesDefinitive, int materialsDefinitive){
		System.out.println("what use type do you want to see your materials for?");
		System.out.println("Enter 1 for ROUGHCONSTRUCTION, 2 for FINALCONSTRUCTION, 3 for PAINTING");
		int  utility=reader.nextInt();
		for(int i=0; i<materialsDefinitive;i++){	
			switch(utility){
				case 1: 
					if(workTypeDefinitive[i]==1){
						System.out.println("The materials used for Rough Construction are: "+namesDefinitive[i]);
					}
				break;
				
				case 2: 
					if(workTypeDefinitive[i]==2){
						System.out.println("The materials used for Final Construction are: "+namesDefinitive[i]);
					}
				break;
	
				case 3: 
					if(workTypeDefinitive[i]==3){
						System.out.println("The materials used for Paiting are: "+namesDefinitive[i]);
					}
				break;
			}
		}
	}
	
	
	
	public static int houseLocation(){
		System.out.println("Where is your address located?");
		System.out.println("Enter 1 if it is North, 2 if it is Central and 3 if it is South");
		int location=reader.nextInt();
		reader.nextLine();
		return location;			
	}
	
}