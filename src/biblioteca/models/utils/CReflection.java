package biblioteca.models.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CReflection {
	
	
	
	
	void imprimirMetodos(Object[] instancias) throws ClassNotFoundException {
		for (Object instancia : instancias) {
	        Class<?> minhaClasse = Class.forName("biblioteca.models.itensmultimidia.fisico.LivroFisico"); // Pelo nome da classe
	            
	        Method[] metodos = minhaClasse.getMethods();
	        for (Method metodo : metodos) {
	            System.out.println("Nome do método: " + metodo.getName());
	        }
	        
	        Field[] campos = minhaClasse.getDeclaredFields(); // Use getFields() se quiser APENAS os campos públicos
	        for (Field campo : campos) {
	            System.out.println("Nome do campo: " + campo.getName());
	            System.out.println("Tipo do campo: " + campo.getType());
	        }
		}
	}
	
	void imprimitCampos() {
		for (classe : classes) {
	        Class<?> minhaClasse = livro1.getClass(); // Acesso direto a classe
	        Class<?> minhaClasseSame = Class.forName("biblioteca.models.itensmultimidia.fisico.LivroFisico"); // Pelo nome da classe
	            
	            
	        Method[] metodos = minhaClasseSame.getMethods();
	        for (Method metodo : metodos) {
	            System.out.println("Nome do método: " + metodo.getName());
	        }
	        
	        Field[] campos = minhaClasse.getDeclaredFields(); // Use getFields() se quiser APENAS os campos públicos
	        for (Field campo : campos) {
	            System.out.println("Nome do campo: " + campo.getName());
	            System.out.println("Tipo do campo: " + campo.getType());
	        }
		}
	}
}
