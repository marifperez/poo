/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author mari
 */
import java.util.Arrays;


/*
 *twm uma lista de func vinculados ao dp
 */
public class Departamento 
{
    private String codigo;
    private String nome;
    private Funcionario[] funcionarios;
    private int quantidadeFuncionarios;


    public Departamento(String codigo, String nome) 
    {
        // verificacoes
        if (codigo == null || codigo.trim().isEmpty()) 
        {
            System.err.println("Erro: Codigo do departamento nao pode ser vazio!");
            this.codigo = "DEP-INVALIDO";
            
        } else {
            this.codigo = codigo;
        }
        
      
        if (nome == null || nome.trim().isEmpty()) 
        {
            System.err.println("Erro: Nome do departamento nao pode ser vazio!");
            this.nome = "DEPARTAMENTO NAO INFORMADO";
            
        } else {
            
            this.nome = nome;
        }
        
        
        this.funcionarios = new Funcionario[50]; // max inicial
        this.quantidadeFuncionarios = 0;
        
    }

    //Tecnico
    public void adicionarTecnico(String codigo, String nome, double salarioBase, String nivel, String funcao) 
    {   
        if (quantidadeFuncionarios >= funcionarios.length) 
        {
            System.err.println("Aviso: Capacidade maxima de funcionarios atingida !");
            return;
        }
        
        
        // verifica se fucn ja ta no dp
        for (int i = 0; i < quantidadeFuncionarios; i++) 
        {
            if (funcionarios[i].getCodigo().equals(codigo)) 
            {
                System.err.println("Aviso: Funcionario ja esta no departamento !");
                return;
            }
        }
        
        
        funcionarios[quantidadeFuncionarios] = new Tecnico(codigo,nome,salarioBase,nivel,funcao);
        quantidadeFuncionarios++;
    }
    
    //Efetivo
    public void adicionarEfetivo(String codigo, String nome, double salarioBase, String nivel, String titulacao, String area) 
    {   
        if (quantidadeFuncionarios >= funcionarios.length) 
        {
            System.err.println("Aviso: Capacidade maxima de funcionarios atingida !");
            return;
        }
        
        
        // verifica se fucn ja ta no dp
        for (int i = 0; i < quantidadeFuncionarios; i++) 
        {
            if (funcionarios[i].getCodigo().equals(codigo)) 
            {
                System.err.println("Aviso: Funcionario ja esta no departamento !");
                return;
            }
        }
        
        
        funcionarios[quantidadeFuncionarios] = new Efetivo(codigo,nome,salarioBase,nivel,titulacao,area);
        quantidadeFuncionarios++;
    }
    
    //Substituto
    public void adicionarSubstituto(String codigo, String nome, double salarioBase, String nivel, String titulacao, int cargaHoraria) 
    {   
        if (quantidadeFuncionarios >= funcionarios.length) 
        {
            System.err.println("Aviso: Capacidade maxima de funcionarios atingida !");
            return;
        }
        
        
        // verifica se fucn ja ta no dp
        for (int i = 0; i < quantidadeFuncionarios; i++) 
        {
            if (funcionarios[i].getCodigo().equals(codigo)) 
            {
                System.err.println("Aviso: Funcionario ja esta no departamento !");
                return;
            }
        }
        
        
        funcionarios[quantidadeFuncionarios] = new Substituto(codigo,nome,salarioBase,nivel,titulacao,cargaHoraria);
        quantidadeFuncionarios++;
    }

    /**
     * calcula o gasto total do dp com salarios
     * retorba essa soma
     */
    public double calcularGastoTotal()
    {
        double total = 0;
        for (int i = 0; i < quantidadeFuncionarios; i++) 
        {
            total += funcionarios[i].calcularSalario();
        }
        
        return total;
    }

    
    public String getCodigo() 
    { 
        return codigo; 
    }
    
    
    public String getNome() 
    { 
        return nome; 
    }
    
    
    public int getQuantidadeFuncionarios() 
    { 
        return quantidadeFuncionarios; 
    }
    
    
    public Funcionario[] getFuncionarios()
    {
        return Arrays.copyOf(this.funcionarios, this.quantidadeFuncionarios);
    }

    
    /**
     retorna info resumida do departamento
     */
    @Override
    public String toString() 
    {
        return String.format("[%s] %s - Funcionarios: %d, Gasto total: R$%.2f",codigo, nome, quantidadeFuncionarios, calcularGastoTotal());
    }
}
  