/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author mari
 */
/**
 * Classe que representa um docente efetivo da universidade.
 * Herda da classe Docente e implementa cálculos específicos.
 */
public class Efetivo extends Docente {
    private String area;

    /**
     area= area de atuacas do docente (exata, humana etc)
     */
    public Efetivo(String codigo, String nome, double salarioBase, String nivel, String titulacao, String area) 
    {
        super(codigo, nome, salarioBase, nivel, titulacao);
        
        // Verifica área válida
        if (area == null || area.trim().isEmpty()) 
        {
            System.err.println("Erro: Area do docente nao pode ser vazia!!! ");
            this.area = "AREA NAO INFORMADA";
            
        } else {
            
            this.area = area;
        }
        
    }
    

    /**
     * calcula o adicional salario usando o nível do docente efetivo
    vai retornat a porcentagem de add (0.05 p D1, 0.10 p D2, 0.20 p D3) + 5% fixo
     */
    private double calcularAdicional() 
    {
        double adicional = 0.0;
        
        if ("D1".equals(nivel)) 
        {
            adicional = 0.05;
            
        } else if ("D2".equals(nivel)) 
        {
            adicional = 0.10;
            
        } else if ("D3".equals(nivel)) 
        {
            adicional = 0.20;
            
        } else 
        {
            System.err.println("Aviso: Nivel de efetivo invalido (" + nivel + "). Considerando 0% de adicional.");
        }
        
        return adicional + 0.05; // 5% fixo p efetivos
    }

    /**
     * calcula o salario final ja com adicionais
    retorna salario base + add por nivel e efetividade
     */
    @Override
    public double calcularSalario() 
    {
        return salarioBase * (1 + calcularAdicional());
    }
    

    /**
     *rRetorna info completas do docente efetivo +string formatada com todos os dados
     */
    @Override
    public String toString() 
    {
        return super.toString() + String.format(", Area: %s, Salario final: R$%.2f", area, calcularSalario());
    }

    public String getArea() 
    { 
        return area; 
    }
    
    
}