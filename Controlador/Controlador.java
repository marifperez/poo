/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Controlador;

import MODELO.Universidade;

/**
 *
 * @author Luan
 */
public class Controlador {

    private static Universidade universidade = new Universidade();
    
    public void listarTodosFuncionarios() {
        universidade.listarTodosFuncionarios();
    }

    /**
     * mostra um resumo de todos os departamentos
     */
    public void exibirResumoDepartamentos() {
        universidade.exibirResumoDepartamentos();
    }

    /**
     * procura um func pelo cigo
     */
    public void buscarFuncionarioPorCodigo(String codigo) {
        universidade.buscarFuncionarioPorCodigo(codigo);
    }

    public void resumirDepartamentosPorFaixa(double min, double max) {
        universidade.resumirDepartamentosPorFaixa(min, max);
    }

    /* lista todos os docentes efetivos
     */
    public void listarDocentesEfetivos() {
        universidade.listarDocentesEfetivos();
    }

    /**
     * mostra todos os docentes subs
     */
    public void listarDocentesSubstitutos() {
        universidade.listarDocentesSubstitutos();
    }

    public void emitirRelatorioGeral() {
        universidade.emitirRelatorioGeral();
    }

    public void listarFuncionariosPorSalario(double min, double max) {
        universidade.listarFuncionariosPorSalario(min, max);
    }

    public void listarTecnicos() {
        universidade.listarTecnicos();
    }

    public void listarDocentes() {
        universidade.listarDocentes();
    }

    public void mostrarDepartamento(String codigoDep) {
        universidade.mostrarDepartamento(codigoDep);
    }

    public void buscarFuncionarioPorNome(String nome) {
        universidade.buscarFuncionarioPorNome(nome);
    }

    public void setNome(String nome) {
        universidade.setNome(nome);
    }

    public void adicionarDepartamento(String codigo, String nome) {
        universidade.adicionarDepartamento(codigo, nome);
    }

    public void adicionarTecnico(String codigoDepartamento, String codigo, String nome, double salarioBase, String nivel, String funcao){
        universidade.adicionarTecnico(codigoDepartamento, codigo, nome, salarioBase, nivel, funcao);
    }
    
    public void adicionarEfetivo(String codigoDepartamento, String codigo, String nome, double salarioBase, String nivel, String titulacao, String area){
        universidade.adicionarEfetivo(codigoDepartamento, codigo, nome, salarioBase, nivel, titulacao, area);
    }
    
    public void adicionarSubstituto(String codigoDepartamento, String codigo, String nome, double salarioBase, String nivel, String titulacao, int cargaHoraria){
        universidade.adicionarSubstituto(codigoDepartamento, codigo, nome, salarioBase, nivel, titulacao, cargaHoraria);
    }
}
