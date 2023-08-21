package biblioteca;

import java.util.ArrayList;

import obras.Obra;

public class Estante {
	private ArrayList<Obra> obras;
	private int numObras;
	
	public Estante() {
		obras = new ArrayList<Obra>();
	}
	
    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public int getNumObras() {
        return numObras;
    }

    public void setNumObras(int numObras) {
        this.numObras = numObras;
    }
}