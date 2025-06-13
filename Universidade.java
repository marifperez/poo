/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author mari
 */
public class Universidade 
{
    private String nome;
    private Departamento[] departamentos;
    private int quantidadeDepartamentos;

    
    public Universidade(String nome) 
    {
        this.nome = nome;
        this.departamentos = new Departamento[10];
        this.quantidadeDepartamentos = 0;
    }

    


    public Departamento[] getDepartamentos() 
    {
        Departamento[] copia = new Departamento[quantidadeDepartamentos];
        
        for(int i=0; i<quantidadeDepartamentos; i++)
        {
            copia[i]= departamentos[i];
   
        }
            return copia;
        
    }
    
    

    public void adicionarDepartamento(Departamento dep) 
    {
        if (quantidadeDepartamentos < departamentos.length) 
        {
            departamentos[quantidadeDepartamentos] = dep;
            quantidadeDepartamentos++;
        }
        
    }
    
    
}