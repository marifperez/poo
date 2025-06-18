/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import BancoDados.Constantes;

/**
 *
 * @author mari
 */
/**
 * Classe que representa um docente substituto da universidade.
 * Herda da classe Docente e implementa cálculos específicos.
 */
public class Substituto extends Docente 
{
    private int cargaHoraria;

  /*
      cargaHoraria =carga h semanal (12 ou 24 horas)
     */
    public Substituto(String codigo, String nome, double salarioBase, String nivel, 
                     String titulacao, int cargaHoraria) {
        super(codigo, nome, salarioBase, nivel, titulacao);
        
        // verifica se  carga horaria valida
        if (cargaHoraria != 12 && cargaHoraria != 24)
        {
            System.err.println("Erro: Carga horaria deve ser 12 ou 24 horas!!");
            this.cargaHoraria = 0;
            
        } else {
            
            this.cargaHoraria = cargaHoraria;
        }
    }

    /**calcula o add salario usando o nivel do subs
    retorna a porcentagsem do add (0.05 para S1, 0.10 para S2)
     */
    private double calcularAdicional() 
    {
        if ("S1".equals(nivel)) 
        {
            return Constantes.S1;
            
        } else if ("S2".equals(nivel)) 
        {
            return Constantes.S2;
            
        } else 
        {
            System.err.println("Aviso: Nivel de substituto inválido (" + nivel + "). Considerando 0% de adicional.");
            return 0.0;
            
        }
        
    }

    /**calculae salario final= salario base + adicional por nivel
     */
    @Override
    public double calcularSalario() 
    {
        return salarioBase * (1 + calcularAdicional());
    }

    /**
     retorna info completa do docente subs+ string formatada com todos os dados
     */
    @Override
    public String toString() 
    {
        return super.toString() + String.format(", Carga Horaria: %dh, Salario final: R$%.2f", cargaHoraria, calcularSalario());
    }

    
    
    
    public int getCargaHoraria() 
    { 
        return cargaHoraria; 
    }
    
    
}