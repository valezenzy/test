package it.cefi.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Algoritmo {

	private List<Integer> numeriCasuali = new ArrayList<>();
	private int chiave;


	public List<Integer> getNumeriCasuali() {
		return numeriCasuali;
	}

	public void setNumeriCasuali(List<Integer> numeriCasuali) {
		this.numeriCasuali = numeriCasuali;
	} 

	public Algoritmo(int chiave) {
		Random random = new Random();


		for (int i = 0; i < 50; i++) {
			numeriCasuali.add( random.nextInt(50));

		}
		Collections.sort(numeriCasuali);
		System.out.print(numeriCasuali.toString());
		this.chiave= chiave;
	}

	public Algoritmo(List<Integer> numeriCasuali) {
		super();
		this.numeriCasuali = numeriCasuali;
	}

	public int ricercaBinaria( int first, int last) {


		if (last>=first){  
			int mid = first + (last - first)/2;  
			if (numeriCasuali.get(mid) == chiave){  
				return mid;  
			}  
			if (numeriCasuali.get(mid) > chiave){  
				return ricercaBinaria( first, mid-1);  
			}else{  
				return ricercaBinaria( mid+1, last);  
			}  
		}  
		return -1;  
	}

	public int getChiave() {
		return chiave;
	}

	public void setChiave(int chiave) {
		this.chiave = chiave;
	}  

}
