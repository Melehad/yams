package com.play.yams;

import java.util.HashMap;

public class Figure {

	private HashMap<String, Integer> StringHashMap;

	public void figurePoints() {
		// Bonus use of hashMap
		this.StringHashMap = new HashMap<>();
		StringHashMap.put("1", 0);// 1
		StringHashMap.put("2", 0);// 2
		StringHashMap.put("3", 0);// 3
		StringHashMap.put("4", 0);// 4
		StringHashMap.put("5", 0);// 5
		StringHashMap.put("6", 0);// 6
		StringHashMap.put("sous-total chiffre", 0);// sous-total
		StringHashMap.put("paire", 0);// paire
		StringHashMap.put("double-paire", 0);// double-paire
		StringHashMap.put("brelan", 0);// brelan
		StringHashMap.put("suite", 0);// suite
		StringHashMap.put("full", 0);// full
		StringHashMap.put("carr�", 0);// carr�
		StringHashMap.put("yams", 0);// yams
		StringHashMap.put("sous-total figure", 0);// sous-total
		StringHashMap.put("total", 0);// total

	}

	public String seeTab() {
		return "Ligne 1 : " + this.StringHashMap.get("1") 
				+ "\nLigne 2 : " + this.StringHashMap.get("2") 
				+ "\nLigne 3 : " + this.StringHashMap.get("3") 
				+ "\nLigne 4 : " + this.StringHashMap.get("4") 
				+ "\nLigne 5 : " + this.StringHashMap.get("5") 
				+ "\nLigne 6 : " + this.StringHashMap.get("6") 
				+ "\nSous-total chiffre : " + this.StringHashMap.get("sous-total chiffre") 
				+ "\nPaire : " + this.StringHashMap.get("paire")
				+ "\nDouble-paire : " + this.StringHashMap.get("double-paire")
				+ "\nbrelan : " + this.StringHashMap.get("brelan")
				+ "\nsuite : " + this.StringHashMap.get("suite")
				+ "\nfull : " + this.StringHashMap.get("full")
				+ "\ncarr� : " + this.StringHashMap.get("carr�")
				+ "\nyams : " + this.StringHashMap.get("yams")
				+ "\nSous-total figure : " + this.StringHashMap.get("sous-total figure")
				+ "\nTotal : " + this.StringHashMap.get("total")
				;
//		System.out.println("Ligne 1 : " + this.StringHashMap.get("1"));
//		System.out.println("Ligne 2 : " + this.StringHashMap.get("2"));
//		System.out.println("Ligne 3 : " + this.StringHashMap.get("3"));
//		System.out.println("Ligne 4 : " + this.StringHashMap.get("4"));
//		System.out.println("Ligne 5 : " + this.StringHashMap.get("5"));
//		System.out.println("Ligne 6 : " + this.StringHashMap.get("6"));
//		System.out.println("Sous-total chiffre : " + this.StringHashMap.get("sous-total chiffre"));
//		System.out.println("Paire : " + this.StringHashMap.get("paire"));
//		System.out.println("Double-paire : " + this.StringHashMap.get("double-paire"));
//		System.out.println("brelan : " + this.StringHashMap.get("brelan"));
//		System.out.println("suite : " + this.StringHashMap.get("suite"));
//		System.out.println("full : " + this.StringHashMap.get("full"));
//		System.out.println("carr� : " + this.StringHashMap.get("carr�"));
//		System.out.println("yams : " + this.StringHashMap.get("yams"));
//		System.out.println("Sous-total figure : " + this.StringHashMap.get("sous-total figure"));
//		System.out.println("Total : " + this.StringHashMap.get("total"));
	}

}
