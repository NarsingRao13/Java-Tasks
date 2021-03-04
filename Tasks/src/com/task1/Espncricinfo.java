package com.task1;

public class Espncricinfo {
	private final int SIZE = 50;
	private Batsman[] batsmans = new Batsman[SIZE];
	private int noOfBatsmen;
	static int i=0;
	
	public Batsman[] getBatsmans() {
		return batsmans;
	}
	public int getNoOfBatsmen() {
		return noOfBatsmen;
	}
	
	int addBatsman(int id,String name,int runScored,int centuries,int halfCenturies,
			int ballsFaced,int fours,int sixes){
		if(getNoOfBatsmen()<SIZE-1){
			Batsman b = new Batsman(id,name,runScored,centuries,halfCenturies,ballsFaced,fours,sixes);
			batsmans[i++] = b;
			//System.out.println(batsmans[i-1]);
			return b.getId();
		}
		else{
			return 0;
		}
	}
	
	Batsman updateBatsmanStats(int id,int runScored,int centuries,int halfCenturies,
			int ballsFaced,int fours,int sixes){
		boolean status = true;
		Batsman returnObj = new Batsman();
		for(int i=0;i<batsmans.length;i++){
			
			if(batsmans[i] != null){
				
				if(id == batsmans[i].getId()){
					status = false;
					batsmans[i].setRunScored(runScored);
					batsmans[i].setCenturies(centuries);
					batsmans[i].setHalfCenturies(halfCenturies);
					batsmans[i].setBallsFaced(ballsFaced);
					batsmans[i].setFours(fours);
					batsmans[i].setSixes(sixes);
					returnObj= batsmans[i];
					break;
				}
				else
					status = true;
			}
		}
		
		if(status)
		{
			return null;
		}
		else
		{
			return returnObj;
		}
	}
	
	Batsman getBatsman(int batsmanId){
		boolean status = true;
		Batsman returnObj = new Batsman();
		for(int i=0;i<batsmans.length;i++){
			
			
			
			if(batsmanId == batsmans[i].getId())
			{
				
				status = false;
				returnObj= batsmans[i];
				break;
			}
			else
				status = true;
		}
		
		if(status)
		{
			return null;
		}
		else
		{
			return returnObj;
		}
	}
	
	public void getBatsmanAllDetails(){
		for(int j=0;j<batsmans.length;j++){
			if(batsmans[j]!=null)
				System.out.println(batsmans[j]);
			else 
				break;
		}
	}
	
	public void getBatsmanDetails(Batsman b)
	{
		System.out.println(b);//b calls by default toString() i.e b.toString()
	}
	
}
