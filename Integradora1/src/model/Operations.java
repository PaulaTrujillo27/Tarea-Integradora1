package model;
public class Operations{

	public final static int ROUGHCONSTRUCTION=1300000;
	public static final int FINALCONSTRUCTION=2600000;
	public static final int PAINTING=980000;
	
	
	/** 
     *Calculates the address depending on the user's address. <br>
     * <b> pre: </b> The number entered can ONLY be 1, 2 or 3.
     * @param totalHC Type Double, materials!=0.
     * @return totalHC returns each the total prices of each of the materials entered.
     */	
	public static double TotalPayStores(int materials, double[] priceHCDefinitive, int[] amountMaterial, int locationDefinitive){
		double totalHC=0; 
		for(int i = 0; i < materials; i++){
			totalHC+= priceHCDefinitive[i] * amountMaterial[i];
		}
		switch (locationDefinitive){
			case 1:
			if (totalHC<80000){
				totalHC+= 120000;				
			}
			else if(totalHC<300000){
				totalHC+=28000;
			}
			break;
			
			case 2:
				if (totalHC<300000){
					totalHC+=50000;				
				}
			break;
			
			case 3:
				if (totalHC<80000){
					totalHC+= 120000;				
				}
				else if(totalHC<300000){
					totalHC+=55000;
				}
			break;
			
			default:
		}
		totalHC=totalHC+ROUGHCONSTRUCTION+FINALCONSTRUCTION+PAINTING;
		return totalHC;
	}
	


	public static double [] bestPrice(double[] priceHCDefinitive, double []priceNBHDefinitive, double [] priceDowntownDefinitive, int materialsDefinitive, int locationDefinitive){
		double[] best_price_stores= new double [materialsDefinitive];
		for(int i=0;i<materialsDefinitive;i++){
			if( priceHCDefinitive[i]<priceDowntownDefinitive[i] &&  priceHCDefinitive[i]<priceNBHDefinitive[i]){
				best_price_stores[i]=priceHCDefinitive[i];	
			}
			else if(priceDowntownDefinitive[i]<priceHCDefinitive[i] && priceDowntownDefinitive[i]<priceNBHDefinitive[i]){
				best_price_stores[i]=priceDowntownDefinitive[i];
				
			}
			else if(priceNBHDefinitive[i]< priceHCDefinitive[i] && priceNBHDefinitive[i]<priceDowntownDefinitive[i]){
				best_price_stores[i]=priceNBHDefinitive[i];
			}	
			
		}
		return best_price_stores;	
	}
	
	
	public static String[] bestStore(double[] priceHCDefinitive, double []priceNBHDefinitive, double [] priceDowntownDefinitive, int materialsDefinitive, int locationDefinitive){
		String[] bestStores=new String[materialsDefinitive];
		for(int i=0;i<materialsDefinitive;i++){
			if( priceHCDefinitive[i]<priceDowntownDefinitive[i] &&  priceHCDefinitive[i]<priceNBHDefinitive[i]){
				bestStores[i]="HomeCenter";	
			}
			else if(priceDowntownDefinitive[i]<priceHCDefinitive[i] && priceDowntownDefinitive[i]<priceNBHDefinitive[i]){
				bestStores[i]="DowntownStore";
				
			}else if(priceNBHDefinitive[i]< priceHCDefinitive[i] && priceNBHDefinitive[i]<priceDowntownDefinitive[i]){
				bestStores[i]="Neighborhood";
			}	
			
		}
		return bestStores;	
	}
	
}






















