package obras;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Obra { // Classe Item Multimídia do enunciado
    private final String titulo;
    private final String autor;
    private final String editora;
    private final int ano;
    private final String sinopse;
    private BufferedImage capa;

    public Obra(String titulo, String autor, String editora, int ano, 
    		String sinopse, String capa_path) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.sinopse = sinopse;
        
        try {
            // Carregar a imagem em uma variável BufferedImage
        	capa = ImageIO.read(new File(capa_path));

            // Agora você tem a imagem na variável "imagem" e pode usá-la como desejar
            // Por exemplo, você pode exibi-la em um JFrame, desenhá-la em um componente, etc.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Getters & Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getAno() {
        return ano;
    }

    public String getSinopse() {
        return sinopse;
    }

    public BufferedImage getCapa() {
    	return capa;
    }
}

