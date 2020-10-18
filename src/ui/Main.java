package ui;
import model.*;
import java.util.Scanner;
public class Main{
	
	public static Scanner reader = new Scanner(System.in);	
	
	
	public static void main(String[] args){
		
		
		int materialsDefinitive=amountTotalMaterials();
		String [] namesDefinitive=getMaterials(materialsDefinitive);
		int [] amountEachMaterialDefinitive= amountEachMaterial(namesDefinitive,materialsDefinitive);
		double[] priceHCDefinitive=HomeCenterPrice (namesDefinitive,materialsDefinitive);
		double[] priceDowntownDefinitive=DowntownStore(namesDefinitive, materialsDefinitive);
		double[] priceNBHDefinitive=neighborhoodStore (namesDefinitive, materialsDefinitive);
		int[] workTypeDefinitive=materialsUse(namesDefinitive,materialsDefinitive);
		int locationDefinitive=houseLocation();
		System.out.println("The total to pay of the work in HomeCenter is : " +Operations.TotalPayStores( materialsDefinitive,priceHCDefinitive,amountEachMaterialDefinitive,locationDefinitive));
		System.out.println("The total to pay of the work in Downtown Store is : " +Operations.TotalPayStores(materialsDefinitive,priceDowntownDefinitive,amountEachMaterialDefinitive,locationDefinitive));
		System.out.println("The total to pay of the work in   is : " +Operations.TotalPayStores(materialsDefinitive,priceNBHDefinitive,amountEachMaterialDefinitive,locationDefinitive));
		double[] bestPriceDefinitive=Operations.bestPrice(priceHCDefinitive,priceNBHDefinitive, priceDowntownDefinitive,materialsDefinitive, locationDefinitive);
		String[] bestStoreDefinitive=Operations.bestStore(priceHCDefinitive,priceNBHDefinitive,priceDowntownDefinitive,materialsDefinitive,locationDefinitive);
		for(int i=0;i<materialsDefinitive;i++){
		System.out.println("The best price of the material " +namesDefinitive[i]+ "Is: " +bestPriceDefinitive[i]+ "in the: " +bestStoreDefinitive[i]+ " Store ");
		}
		useTypeSelection(workTypeDefinitive,namesDefinitive,materialsDefinitive);
	}
	
	/** 
     *The user enters the amount of materials to be purchased. <br>
     * <b> pre: </b> the number entered must be integer and positive.
     * @param materials Type Int.
     * @return materials returns the amount of materials to be entered later.
     */
	public static int  amountTotalMaterials(){
	System.out.println("Enter the quantity of materials to buy");
	int materials = reader.nextInt();
	reader.nextLine();
	return materials;
    }
	
	/** 
     *The user enters the the name of each of the materials to buy.<br>
     * <b> pre: </b> the number entered must be integer and positive.
     * @param materials Type Int.
     * @return materials returns the amount of materials to be entered later.
     */
	public static String[] getMaterials(int materialsDefinitive){
		String[] names = new String[materialsDefinitive];
		for(int i=0; i<materialsDefinitive;i++){
			System.out.println("Enter the name of the material");
			names[i]=reader.nextLine();
		}
		return names;
	}		


    /** 
     *The user enters the quantity of each of the materials to buy. <br>
     * <b> pre: </b> the number entered must be integer and positive.
     * @param amounMaterial Array Int.
     * @return amountMaterial returns the quantity of each of the materials to buy.
     */
	public static int [] amountEachMaterial(String[] namesDefinitive, int materialsDefinitive){
		int [] amountMaterial = new int [materialsDefinitive];
		for(int i=0; i<materialsDefinitive;i++){
			System.out.println("Enter the quantity of the material "+namesDefinitive[i]);
			amountMaterial[i]=reader.nextInt();
			reader.nextLine();
		}
		return amountMaterial;
	}	
	
	
	/** 
     *The user enters the cost of each of the materials in the HomeCenter store. <br>
     * <b> pre: </b> The amount entered can be a whole number and decimal but it has to be POSITIVE.
     * @param priceHC Array Double.
     * @return priceHC returns the price in the HomeCenter Store of each of the materials previously entered.
     */
	public static double [] HomeCenterPrice (String [] namesDefinitive, int materialsDefinitive){
		double[] priceHC = new double [materialsDefinitive]; 
		for(int i=0; i<materialsDefinitive;i++){
			System.out.println("Enter the cost of the material "+namesDefinitive[i]+" in HomeCenter");
			priceHC[i]=reader.nextDouble();
			reader.nextLine();
		}
		return priceHC;
	}
	
    
	/** 
     *The user enters the cost of each of the materials in the Downtown store. <br>
     * <b> pre: </b> The amount entered can be a whole number and decimal but it has to be POSITIVE.
     * @param priceDowntown Array Double.
     * @return priceDowntown returns the price in the Downtown Store of each of the materials previously entered.
     */
	public static double [] DowntownStore(String [] namesDefinitive, int materialsDefinitive){
		double[] priceDowntown = new double [materialsDefinitive]; 
		for(int i=0; i<materialsDefinitive;i++){
			System.out.println("Enter the cost of the material "+namesDefinitive[i]+" in the Downtown's Store");
			priceDowntown[i]=reader.nextDouble();
			reader.nextLine();
		}
		return priceDowntown;
	}
	
	
	/** 
     *The user enters the cost of each of the materials in the Neighborhood store. <br>
     * <b> pre: </b> The amount entered can be a whole number and decimal but it has to be POSITIVE.
     * @param priceNBH Array Double.
     * @return priceNBH returns the price in the Neighborhood Store of each of the materials previously entered.
     */
	public static double [] neighborhoodStore (String [] namesDefinitive, int materialsDefinitive){
		double[] priceNBH = new double [materialsDefinitive]; 
		for(int i=0; i<materialsDefinitive;i++){
			System.out.println("Enter the cost of the material "+namesDefinitive[i]+" in the Neighborhood's Store");
			priceNBH[i]=reader.nextDouble();
			reader.nextLine();
		}
		return priceNBH;
	}

	
	/** 
     *The user enters the type of use of each of the materials. With the option of: if you enter 1 the utility will be ROUGHCONSTRUCTION, 2 the utility will be FINALCONSTRUCTION and 3 the utility will be PAINTING <br>
     * <b> pre: </b> The number entered can ONLY be 1, 2 or 3.
     * @param workType Array Int.
     * @return workType returns if the type of use of each of the materials will be ROUGHCONSTRUCTION, FINALCONSTRUCTION O PAINTING.
     */	
	public static int [] materialsUse(String []namesDefinitive, int materialsDefinitive){
		int[] workType = new int [materialsDefinitive]; 
		for(int i=0; i<materialsDefinitive;i++){
			System.out.println("Which will be the use type of the material "+namesDefinitive[i]);
			System.out.println("Enter 1 for ROUGHCONSTRUCTION, 2 for FINALCONSTRUCTION, 3 for PAINTING");
			workType[i]=reader.nextInt();	
		}
		return workType;
	}
	

	 /** 
     *The user enters a number (I can ONLY be 1, 2 or 3) where each one displays the names of the materials by type of use. Being 1 ROUGHCONSTRUCTION, 2 FINALCONSTRUCTION and 3 PAINTING <br>
     * <b> pre: </b> The number entered can ONLY be 1, 2 or 3.
     * @param utility Type Int.
     * @return utility returns the materials according to the type of use chosen above.
     */	
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
	
	
	/** 
     *The user enters where is your address located. Being 1 North, 2 Central and 3 South. <br>
     * <b> pre: </b> The number entered can ONLY be 1, 2 or 3.
     * @param location Type Int.
     * @return location returns if the address is in the north, center or south.
     */	
	public static int houseLocation(){
		System.out.println("Where is your address located?");
		System.out.println("Enter 1 if it is North, 2 if it is Central and 3 if it is South");
		int location=reader.nextInt();
		reader.nextLine();
		return location;			
	}
	
}