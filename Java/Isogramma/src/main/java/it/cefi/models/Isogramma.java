package it.cefi.models;

import java.util.Arrays;

public class Isogramma {

	private String parola;

	public Isogramma() {

	}

	public boolean controlloIsogramma(String stringa) {
		
		stringa = stringa.toLowerCase();
		int lunghezza = stringa.length();

		char arr[] = stringa.toCharArray();

		Arrays.sort(arr);
		for (int i = 0; i < lunghezza - 1; i++) {
			if (arr[i] == arr[i + 1])
				return false;
		}
		return true;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

}
