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
		StringHashMap.put("carré", 0);// carré
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
				+ "\nBrelan : " + this.StringHashMap.get("brelan")
				+ "\nSuite : " + this.StringHashMap.get("suite")
				+ "\nFull : " + this.StringHashMap.get("full")
				+ "\nCarré : " + this.StringHashMap.get("carré")
				+ "\nYams : " + this.StringHashMap.get("yams")
				+ "\nSous-total figure : " + this.StringHashMap.get("sous-total figure")
				+ "\nTotal : " + this.StringHashMap.get("total")
				;

	}

}
