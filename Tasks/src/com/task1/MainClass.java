package com.task1;

public class MainClass {

	public static void main(String[] args) {
		Espncricinfo ob1 = new Espncricinfo();
		System.out.println("id: "+ob1.addBatsman(1, "Rao", 1000, 5, 7, 10, 50, 100)+" added");
		System.out.println("id: "+ob1.addBatsman(2, "UMA", 100, 54, 78, 100, 500, 1000)+" added");
		ob1.getBatsmanAllDetails();
		ob1.getBatsmanDetails(ob1.updateBatsmanStats(1, 21, 243, 78, 235, 10879, 19009));
		ob1.getBatsmanDetails(ob1.getBatsman(2));
		ob1.addBatsman(5, "ug", 54, 4, 6565, 454, 854, 6465);
		ob1.getBatsmanAllDetails();
		////System.out.println(ob1.getNoOfBatsmen());
	}

}
