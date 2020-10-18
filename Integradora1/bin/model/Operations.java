package model;
public class Operations{

	public final static int ROUGHCONSTRUCTION=1300000;
	public static final int FINALCONSTRUCTION=2600000;
	public static final int PAINTING=980000;
	
	public static double TotalPayStores(int materials, double[] priceHCDefinitive, int[] amountMaterial){
		double totalHC=0; 
		for(int i = 0; i < materials; i++){
			totalHC = priceHCDefinitive[i] * amountMaterial[i];
		}
		switch (locationDefinitive){
			case 1:
			if (totalHC<80000){
				totalHC=+ 120000;				
			}
			else if(totalHC<300000){
				totalHC+=28000;
			}
			break;
			
			case 2:
				if (totalHC<300000){
					totalHC=+50000;				
				}
			break;
			
			case 3:
				if (totalHC<80000){
					totalHC=+ 120000;				
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
	
	
	/*public static double TotalPayDowntown( int materials, double[] priceDowntown, int[] amountMaterial){
		double countDowntown = 0; 
		for(int i = 0; i < materials; i++){
			
			double totalDowntown = priceDowntown[i] * amountMaterial[i];
			countDowntown = (totalDowntown + countDowntown);	
		}
		countDowntown=countDowntown+ROUGHCONSTRUCTION+FINALCONSTRUCTION+PAINTING;
		return countDowntown;
	}
	
	
	public static double TotalPayNBH( int materials, double[] priceNBH, int[] amountMaterial){
		double countNBH = 0; 
		for(int i = 0; i < materials; i++){
			
			double totalNBH = priceNBH[i] * amountMaterial[i];
			countNBH = totalNBH + countNBH;
		}
		countNBH=countNBH+ROUGHCONSTRUCTION+FINALCONSTRUCTION+PAINTING;
		return countNBH;
	}*/
	
	/*public static double totalStores (double[]priceHCDefinitive,int locationDefinitive, int materialsDefinitive){
		double total_stores=0;
		for (int i=0;i<materialsDefinitive;i++){
			total_stores=total_stores+priceHC[i];
		}
			switch (locationDefinitive){
				case 1:
				if (total_stores<80000){
					total_stores=+ 120000;				
				} else if (total_stores<300000){
					total_stores+=28000;
				}
				break;
				case 2:
					if (total_stores<300000){
					total_stores=+50000;				
				}
				break;
				case 3:
				if (total_stores<80000){
					total_stores=+ 120000;				
				} else if (total_stores<300000){
					total_stores+=55000;
				}
				break;
				default:
			}
		total_stores=total_stores+ROUGHCONSTRUCTION+FINALCONSTRUCTION+PAINTING;
		return total_stores;
		
	}*/
	
	public static double [] bestPrice(double[] priceHCDefinitive, double []priceNBHDefinitive, double [] priceDowntownDefinitive, int materialsDefinitive, int locationDefinitive){
		double[] best_price_stores=0;
		for(int=0;i<materialsDefinitive;i++){
			if( priceHCDefinitive[i]<priceDowntownDefinitive[i] &&  priceHCDefinitive[i]<priceNBHDefinitive[i]){
				best_price_stores[i]=priceHCDefinitive[i];
			}	
			}else if(priceDowntownDefinitive[i]<priceHCDefinitive[i]) && priceDowntownDefinitive[i]<priceNBHDefinitive[i]){
				best_price_stores[i]=priceDowntownDefinitive[i];
				
			}else if (priceNBHDefinitive[i]< priceHCDefinitive[i]) && (priceNBHDefinitive[i]<priceDowntownDefinitive[i]){
				best_price_stores[i]=priceNBHDefinitive[i];
			}	
			
		}
		return best_price_stores;	
	}
	
	
	public static String[] bestStore(double[] priceHCDefinitive, double []priceNBHDefinitive, double [] priceDowntownDefinitive, int materialsDefinitive, int locationDefinitive){
		String[] bestStores=0;
		for(int=0;i<materialsDefinitive;i++){
			if( priceHCDefinitive[i]<priceDowntownDefinitive[i] &&  priceHCDefinitive[i]<priceNBHDefinitive[i]){
				bestStores[i]="HomeCenter";
			}	
			}else if(priceDowntownDefinitive[i]<priceHCDefinitive[i]) && priceDowntownDefinitive[i]<priceNBHDefinitive[i]){
				bestStores[i]="DowntownStore";
				
			}else if (priceNBHDefinitive[i]< priceHCDefinitive[i]) && (priceNBHDefinitive[i]<priceDowntownDefinitive[i]){
				bestStores[i]="Neighborhood";
			}	
			
		}
		return bestStores;	
	}
	
}






















