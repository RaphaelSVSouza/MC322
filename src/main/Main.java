package main;

import biblioteca.models.estantes.EstanteFisica;
import biblioteca.models.estantes.EstanteVirtual;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		EstanteFisica[] estantesFisicas = new EstanteFisica[14];
    	for (int i=0; i<14; i++) {
    		estantesFisicas[i] = new EstanteFisica(i);
    	}
    	EstanteVirtual estanteVirtual = new EstanteVirtual();
    	
    	
    	Set<Integer> nums = new TreeSet<>();
		nums.add(0);nums.add(6);
		nums.add(1);nums.add(7);
		nums.add(2);nums.add(8);
		nums.add(3);nums.add(9);
		nums.add(4);nums.add(10);
		nums.add(5);nums.add(11);
		
		Iterator<Integer> iterator = nums.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			System.out.println(iterator.next());
			System.out.println(iterator.next());
		}
    	
	}
}