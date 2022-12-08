package it.cefi.models;

import java.util.Map;
import java.util.TreeMap;

public class Isogramma {
	private String input;

	public Isogramma(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	
	public boolean verifica() {
		Map<String, Integer> mapPangramma = new TreeMap<>(){
			private static final long serialVersionUID = 1L;

		{
			put("a", 0); put("b",0); put("c",0); put("d", 0); put("e",0); 
			put("f", 0); put("g",0); put("h",0); put("i", 0); put("l",0);
			put("m", 0); put("n",0); put("o",0); put("p", 0); put("q",0);
			put("r", 0); put("s",0); put("t",0); put("u", 0); put("v",0);
			put("z",0);
		}};
		
		String[] delimitatore = input.toLowerCase().split("[^a-z]");
		StringBuilder stringBuilder = new StringBuilder();
		for(String s: delimitatore) {
		stringBuilder.append(s);

		}
		
		input = stringBuilder.toString();
			
		for(int i=0; i<input.length(); i++) {	
				
				mapPangramma.put(input.substring(i,i+1),mapPangramma.get(input.substring(i,i+1)) +1);
			}
			
		for(int n:mapPangramma.values()) {
			if(n==0) return false;
		}
		return true;
	}
	
}