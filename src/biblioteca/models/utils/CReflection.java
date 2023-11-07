package biblioteca.models.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
import biblioteca.models.membros.Membro;

public class CReflection {

	public static void imprimirMetodosMembros(String membro, String funcao) throws ClassNotFoundException {
		
		String path = "biblioteca.models.membros." + funcao + "." + membro; 
		try {
	        Class<?> classeObjeto = Class.forName(path); // Pelo nome da classe
	            
	        Method[] metodos = classeObjeto.getMethods();
	     
	        System.out.println("MÉTODOS:");
	        for (Method metodo : metodos) {
	            System.out.println("Método: " + metodo.getName());
	        }
	        System.out.println("-------------");
		} catch (Exception ClassNotFoundException) {
			System.err.println("Membro não encontrado");
		}
	}
	
    public static void imprimirAtributosMembros(String membro, String funcao) throws ClassNotFoundException {
    	String path = "biblioteca.models.membros." + funcao + "." + membro; 
        try {
            Class<?> classeObjeto = Class.forName(path);

            Field[] campos = classeObjeto.getDeclaredFields();
            System.out.println("ATRIBUTOS:");
            for (Field campo : campos) {
                System.out.println("Nome: " + campo.getName());
                System.out.println("Tipo: " + campo.getType());
            }
            System.out.println("-------------");
        } catch (ClassNotFoundException e) {
            System.err.println("Membro não encontrado");
        }
    }
	
    public static void imprimirMetodosItens(String item, String tipo) throws ClassNotFoundException {
		
		String path = "biblioteca.models.itensmultimidia." + tipo + "." + item; 
		try {
	        Class<?> classeObjeto = Class.forName(path); // Pelo nome da classe
	            
	        Method[] metodos = classeObjeto.getMethods();
	        System.out.println("MÉTODOS:");
	        for (Method metodo : metodos) {
	            System.out.println("Método: " + metodo.getName());
	        }
	        System.out.println("-------------");
		} catch (Exception ClassNotFoundException) {
			System.err.println("Membro não encontrado");
		}
	}
	
    public static void imprimirAtributosItens(String item, String tipo) throws ClassNotFoundException {
    	String path = "biblioteca.models.itensmultimidia." + tipo + "." + item; 
        try {
            Class<?> classeObjeto = Class.forName(path);

            Field[] campos = classeObjeto.getDeclaredFields();
            System.out.println("ATRIBUTOS:");
            for (Field campo : campos) {
                System.out.println("Nome: " + campo.getName());
                System.out.println("Tipo: " + campo.getType());
            }
            System.out.println("-------------");
        } catch (ClassNotFoundException e) {
            System.err.println("Membro não encontrado");
        }
    }
	
    public static <T> boolean imprimirInfoLista(List<T> lista) {
		for (T objeto : lista) {
			Class<?> classeObjeto = objeto.getClass();
			System.out.println("imprimindo as informaçẽs da lista de " + classeObjeto.getSimpleName());
			
			Method[] metodos = classeObjeto.getMethods();
			System.out.println("MÉTODOS:");
	        for (Method metodo : metodos) {
	            System.out.println("Método: " + metodo.getName());
	        }
			
			Field[] campos = classeObjeto.getDeclaredFields();
			System.out.println("ATRIBUTOS E VALORES:");
			for (Field campo : campos) {
                String nomeCampo = campo.getName();
                String nomeMetodo = "get" + Character.toUpperCase(nomeCampo.charAt(0)) + nomeCampo.substring(1);

                try {
                    Method getter = classeObjeto.getMethod(nomeMetodo);
                    Object valorCampo = getter.invoke(objeto);
                    System.out.println(nomeCampo + ": " + valorCampo);
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
		}
		return true;
	}
	
}
