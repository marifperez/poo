/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author mari
 *//**
 * Classe que representa um funcionário técnico da universidade.
 * Herda da classe Funcionario e implementa cálculos específicos.
 */
public class Tecnico extends Funcionario 
{
    private String funcao;

    /**
     * Construtor da classe Tecnico
     * @param funcao Função exercida pelo técnico (ex: Redes, Laboratório)
     */
    public Tecnico(String codigo, String nome, double salarioBase, String nivel, String funcao) 
    {
        super(codigo, nome, salarioBase, nivel);
        
        // Verifica função válida
        if (funcao == null || funcao.trim().isEmpty()) 
        {
            System.err.println("Erro: Funcao do tecnico nao pode ser vazia!");
            this.funcao = "FUNCAO NAO INFORMADA";
            
        } else {
            
            this.funcao = funcao;
        }
        
    }

    /**
     * Calcula o adicional salarial baseado no nível do técnico
     * @return Percentual de adicional (0.10 para T1, 0.20 para T2)
     */
    private double calcularAdicional() 
    {
        if ("T1".equals(nivel)) 
        {
            return 0.10;
            
        } else if ("T2".equals(nivel)) 
        {
            return 0.20;
            
        } else 
        {
            System.err.println("Aviso: Nivel tecnico invalido (" + nivel + "). Considerando 0% de adicional.");
            return 0.0;
        }
        
    }

    
    /**
     * calcula o salario final com o adicional ai retorna o salrio base + adicional do nivel
     */
    @Override
    public double calcularSalario() 
    {
        return salarioBase * (1 + calcularAdicional());
    }

    /**
     * Retorna info completas do tecnico e string formatada com todos os dados
     */
    @Override
    public String toString() 
    {
        return super.toString() + String.format(", Funcao: %s, Salario final: R$%.2f", funcao, calcularSalario());
    }
    

    public String getFuncao() 
    { 
        return funcao; 
    }
    
    
}