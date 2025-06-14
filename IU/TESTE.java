/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IU;

import Controlador.Controlador;

/**
 *
 * @author Luan
 */
public class TESTE {

    public static void main(String[] args) {
        Controlador controlador = new Controlador();

        controlador.setNome("UNESP - Universidade Estadual Paulista");
        controlador.adicionarDepartamento("DC", "Ciencia da computacao");
        controlador.adicionarDepartamento("DM", "Matematica");
        controlador.adicionarDepartamento("DF", "Fisica");

        controlador.adicionarTecnico("DC","T001", "Joao Silva", 3500, "T1", "Redes");
        controlador.adicionarEfetivo("DC","P001", "Maria Oliveira", 8000, "D3", "Doutorado", "Inteligencia Artificial");

        controlador.adicionarEfetivo("DM","P002", "Carlos Souza", 7500, "D2", "Doutorado", "Algebra");
        controlador.adicionarSubstituto("DM","P003", "Ana Costa", 4000, "S2", "Mestrado", 24);

        controlador.adicionarEfetivo("DF","P004", "Roberto Almeida", 8500, "D3", "Livre-Docente", "Fisica");
        controlador.adicionarSubstituto("DF","P005", "Juliana Santos", 3800, "S1", "Doutorado", 12);
        controlador.adicionarTecnico("DF","T002", "Pedro Rocha", 3200, "T2", "Laboratorio");

        //TESTE
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

        //BUSCA
        controlador.buscarFuncionarioPorNome("Danilo Eller");
        controlador.buscarFuncionarioPorCodigo("P001");
        controlador.buscarFuncionarioPorCodigo("T999");
    }
}
