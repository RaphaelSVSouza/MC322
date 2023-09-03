package obras.eletronico;

import obras.Obra;
import java.util.List;

public class Ebook extends Obra {
    private final String formato;
    private final int numTotalLicencas;
    private final String formatoDeArquivo;
    private String urlAcesso;
    private List<String> requisitosDeLeitura;
    private String dataDisponibilidade;

    public Ebook(String titulo, String autor, String editora, int ano, String genero, 
    		String sinopse, String capa_path, 
    		String formato, int numTotalLicencas, String formatoDeArquivo, String urlAcesso,
                 List<String> requisitosDeLeitura, String dataDisponibilidade) {
    	super(titulo, autor, editora, ano, genero, sinopse, capa_path);
        this.formato = formato;
        this.numTotalLicencas = numTotalLicencas;
        this.formatoDeArquivo = formatoDeArquivo;
        this.urlAcesso = urlAcesso;
        this.requisitosDeLeitura = requisitosDeLeitura;
        this.dataDisponibilidade = dataDisponibilidade;
    }

    public String getFormato() {
        return formato;
    }

    public int getNumTotalLicencas() {
        return numTotalLicencas;
    }

    public String getFormatoDeArquivo() {
        return formatoDeArquivo;
    }	

    public String getUrlAcesso() {
        return urlAcesso;
    }

    public void setUrlAcesso(String urlAcesso) {
        this.urlAcesso = urlAcesso;
    }

    public List<String> getRequisitosDeLeitura() {
        return requisitosDeLeitura;
    }

    public void setRequisitosDeLeitura(List<String> requisitosDeLeitura) {
        this.requisitosDeLeitura = requisitosDeLeitura;
    }

    public String getDataDisponibilidade() {
        return dataDisponibilidade;
    }

    public void setDataDisponibilidade(String dataDisponibilidade) {
        this.dataDisponibilidade = dataDisponibilidade;
    }
}

