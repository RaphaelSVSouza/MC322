import biblioteca.*;
import obras.*;
import obras.fisico.*;
import pessoas.*;
import biblioteca.sistema.*;

public class Main {

	public static void main(String[] args) {
		EstanteFisica[] estantesFisicas = new EstanteFisica[14];
    	for (int i=0; i<14; i++) {
    		estantesFisicas[i] = new EstanteFisica(i);
    	}
    	EstanteVirtual estanteVirtual = new EstanteVirtual();
	}
}