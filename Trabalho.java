/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho;

/**
 *
 * @author mari
 */
public class Trabalho 
{

//vendo se ta roandando
 
    public static void main(String[] args) 
    {
        
        // cria a universidade
        Universidade unesp = new Universidade("UNESP - Universidade Estadual Paulista");
        
        // cria departamentos
        Departamento comp = new Departamento("DC", "Ciencia da computacao");
        Departamento mat = new Departamento("DM", "matematica");
        Departamento fis = new Departamento("DF", "Fisica");
        
        // add func
        comp.adicionarFuncionario(new Tecnico("T001", "Joao Silva", 3500, "T1", "Redes"));
        comp.adicionarFuncionario(new Efetivo("P001", "Maria Oliveira", 8000, "D3", "Doutorado", "Inteligencia Artificial"));
        
        mat.adicionarFuncionario(new Efetivo("P002", "Carlos Souza", 7500, "D2", "Doutorado", "Algebra"));
        mat.adicionarFuncionario(new Substituto("P003", "Ana Costa", 4000, "S2", "Mestrado", 24));
        
        fis.adicionarFuncionario(new Efetivo("P004", "Roberto Almeida", 8500, "D3", "Livre-Docente", "Fisica"));
        fis.adicionarFuncionario(new Substituto("P005", "Juliana Santos", 3800, "S1", "Doutorado", 12));
        fis.adicionarFuncionario(new Tecnico("T002", "Pedro Rocha", 3200, "T2", "Laboratorio"));
        
        // add o dep na uni
        unesp.adicionarDepartamento(comp);
        unesp.adicionarDepartamento(mat);
        unesp.adicionarDepartamento(fis);
        
        //cria o controlador
        Controlador controlador = new Controlador(unesp);
        
        // testando
        System.out.println("=== SISTEMA UNIVERSITARIO ===");
        System.out.println(unesp);
        
        controlador.exibirResumoDepartamentos();
        controlador.listarTodosFuncionarios();
        controlador.listarDocentesEfetivos();
        controlador.listarDocentesSubstitutos();
        controlador.emitirRelatorioGeral();
        
        
        
        controlador.resumirDepartamentosPorFaixa(7000, 20000);
        controlador.listarFuncionariosPorSalario(3000, 4500);
        controlador.listarTecnicos();
        controlador.listarDocentes();
        controlador.mostrarDepartamento("DM");  // ou "DC", "DF" etc
        
        
   //busca
        controlador.buscarFuncionarioPorNome("Danilo Eller");
        controlador.buscarFuncionarioPorCodigo("P001");
        controlador.buscarFuncionarioPorCodigo("T999");
    }

}

