package repositorios;

import java.util.ArrayList;
import java.util.List;
import membros.Academico.*;
import membros.Funcionarios.*;

public abstract class RepositorioMembros {
    static private List<Graduando> graduandos = new ArrayList<>();
    static private List<PosGraduando> posGraduandos = new ArrayList<>();
    static private List<Professor> professores = new ArrayList<>();
    static private List<Adiministrador> adiministradores = new ArrayList<>();
    static private List<Atendente> atendentes = new ArrayList<>();
    static private List<Gerente> gerentes = new ArrayList<>();

    public static void adicionarGraduando(Graduando graduando) {
        graduandos.add(graduando);
    }

    public static void adicionarPosGraduando(PosGraduando posGraduando) {
        posGraduandos.add(posGraduando);
    }

    public static void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }
    
    public static void adicionarAdiministrador(Adiministrador adm) {
        adiministradores.add(adm);
    }
    
    public static void adicionarAtendente(Atendente atendente) {
        atendentes.add(atendente);
    }
    
    public static void adicionarGerente(Gerente gerente) {
        gerentes.add(gerente);
    }

    public static List<Graduando> getGraduandos() {
        return graduandos;
    }

    public static List<PosGraduando> getPosGraduandos() {
        return posGraduandos;
    }

    public static List<Professor> getProfessores() {
        return professores;
    }
}
