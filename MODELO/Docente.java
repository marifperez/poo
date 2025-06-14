/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author mari
 */
/**
 * Classe abstrata que representa um docente da universidade.
 * Herda de Funcionario e adiciona informações específicas de docentes.
 */
public abstract class Docente extends Funcionario 
{
    protected String titulacao;

    /**
     * Construtor da classe Docente
     * @param titulacao Titulação acadêmica do docente
     */
    public Docente(String codigo, String nome, double salarioBase, String nivel, String titulacao) 
    {
        super(codigo, nome, salarioBase, nivel);
        
        // Verifica titulação válida
        if (titulacao == null || titulacao.trim().isEmpty()) 
        {
            System.err.println("Erro: Titulacao do docente nao pode ser vazia!!!");
            this.titulacao = "TITULACAO NAO INFORMADA";
            
        } else {
            this.titulacao = titulacao;
            
        }
    }

    /**
     * retorna info basica do docentee string formatada  dados do docente
     */
    @Override
    public String toString() 
    {
        return super.toString() + ", Titulacao: " + titulacao;
    }
    

    public String getTitulacao() 
    { 
        return titulacao; 
    }
    
    
}