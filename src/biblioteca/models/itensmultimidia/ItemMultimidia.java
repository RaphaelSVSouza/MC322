package biblioteca.models.itensmultimidia;

import javax.imageio.ImageIO;
import biblioteca.controllers.atividades.Comentario;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;

public class ItemMultimidia { // Classe Item Multimídia do enunciado
    private final int id;
	private final String titulo;
    private final String autor;
    private final String editora;
    private final int ano;
    private final String sinopse;
    private BufferedImage capa;
    // private bollean reservado;
    
    private List<Comentario> comentarios = new LinkedList<>();

    public ItemMultimidia(int id, String titulo, String autor, String editora, int ano, 
    		String sinopse, String capa_path, boolean reservado) {
        this.id = id;
		this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.sinopse = sinopse;
        this.reservado = false;
        
        try {
            // Carregar a imagem em uma variável BufferedImage
        	capa = ImageIO.read(new File(capa_path));

            // Agora você tem a imagem na variável "imagem" e pode usá-la como desejar
            // Por exemplo, você pode exibi-la em um JFrame, desenhá-la em um componente, etc.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //classe interna de Categorias
    public static class Categoria {
    	private String nome;
    	private int quantidadeDeEstantes;
    	
    	public Categoria(String nome, int quantidadeDeEstantes) {
    		this.nome = nome;
    		this.quantidadeDeEstantes = quantidadeDeEstantes;
    	}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getQuantidadeDeEstantes() {
			return quantidadeDeEstantes;
		}

		public void adicionarEstantes(int quantidade) {
			this.quantidadeDeEstantes = this.quantidadeDeEstantes + quantidade;
		}
		
		public void removerEstantes(int quantidade) {
			this.quantidadeDeEstantes = this.quantidadeDeEstantes - quantidade;
			if (this.quantidadeDeEstantes < 0) {
				this.quantidadeDeEstantes = 0;
			}
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

	public int getId() {
		return id;
	}

    // public bollean getReservado() {
    //     return this.reservado;
    // }

    // public void setReservado(bollean reservado) {
    //     this.reservado = reservado;
    // }

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void adicionarComentario(Comentario comentario) {
		this.comentarios.add(comentario);
	}
}

