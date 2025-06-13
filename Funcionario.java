/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author mari
 */
public abstract class Funcionario 
{
    protected String codigo;
    protected String nome;
    protected double salarioBase;
    protected String nivel;

    /** codigo nao pode ser vazio, nome completo do func (nao pode ser vazio), salarioBase valor base do salario (deve ser positivo), nivel  do func (deve ser valido para cada categoria)
     */
    
    public Funcionario(String codigo, String nome, double salarioBase, String nivel) 
    {
        // vrerifica basicas
        if (codigo == null || codigo.trim().isEmpty()) 
        {
            System.err.println("Erro: Codigo do funcionario nao pode ser vazio !!!");
            this.codigo = "INVALIDO";
            
        } else {
            
            this.codigo = codigo;
        }
        

        if (nome == null || nome.trim().isEmpty()) 
        {
            System.err.println("Erro: Nome do funcionario nao pode ser vazio!");
            this.nome = "NOME NAO INFORMADO";
            
        } else {
            
            this.nome = nome;
        }
        

        if (salarioBase <= 0) 
        {
            System.err.println("Erro: Salario base deve ser positivo!");
            this.salarioBase = 0;
            
        } else {
            
            this.salarioBase = salarioBase;
        }

        
        this.nivel = nivel;
        
    }

   
    public abstract double calcularSalario();

    /**
     * ve se dois func sao iguais usanodo o codigo
     * retorna true se os codigos forem iguais, false ]se n
     */
    public boolean equals(Funcionario outro) 
    {
        if (outro == null) 
        {
            return false;
        }
        
        return this.codigo.equals(outro.codigo);
    }

    /**
     * retorna infos basicas do fun
     * retorna string formatada com dados do func
     */
    @Override
    public String toString() 
    {
        return String.format("[%s] %s - Salario Base: R$%.2f, Nivel: %s", codigo, nome, salarioBase, nivel);
    }

    // Getters básicos
    public String getCodigo() 
    { 
        return codigo; 
    }
    
    public String getNome() 
    { 
        return nome; 
    }
    
    public double getSalarioBase() 
    { 
        return salarioBase; 
    }
    
    public String getNivel() 
    {
        return nivel; 
    }
    
}
