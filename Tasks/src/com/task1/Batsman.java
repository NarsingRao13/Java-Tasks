package com.task1;

public class Batsman {
	private String name;
	private int runScored;
	private int centuries;
	private int	halfCenturies;
	private int ballsFaced;
	private int fours;
	private int sixes;
	private int id;
	
	void setData(int id,String name,int runScored,int centuries,int halfCenturies,
			int ballsFaced,int fours,int sixes){
		this.id = id;
		this.name = name;
		this.runScored = runScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
	}
	
	float getStrikeRate(){
		return Math.round(((runScored*100) / ballsFaced)*100)/100;
	}
	
	int getRunsScoredInBoundaries(){
		return ( 4 * fours + 6 * sixes );
	}
	
	public Batsman(){
		
	}

	public Batsman(int id,String name, int runScored, int centuries, int halfCenturies, int ballsFaced, int fours, int sixes) {
		super();
		this.id = id;
		this.name = name;
		this.runScored = runScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRunScored() {
		return runScored;
	}

	public void setRunScored(int runScored) {
		this.runScored = runScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	
	
	
}
