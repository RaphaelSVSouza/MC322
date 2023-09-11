package main;

import biblioteca.models.estantes.EstanteFisica;
import biblioteca.models.estantes.EstanteVirtual;

public class Main {

	public static void main(String[] args) {
		EstanteFisica[] estantesFisicas = new EstanteFisica[14];
    	for (int i=0; i<14; i++) {
    		estantesFisicas[i] = new EstanteFisica(i);
    	}
    	EstanteVirtual estanteVirtual = new EstanteVirtual();
	}
}