/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

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


    public void adicionarFuncionario(Funcionario funcionario) 
    {
        if (funcionario == null) 
        {
            System.err.println("Erro: Nao eh possivel adicionar funcionario nulo !!");
            return;
        }
        
        
        if (quantidadeFuncionarios >= funcionarios.length) 
        {
            System.err.println("Aviso: Capacidade maxima de funcionarios atingida !");
            return;
        }
        
        
        // verifica se fucn ja ta no dp
        for (int i = 0; i < quantidadeFuncionarios; i++) 
        {
            if (funcionarios[i].equals(funcionario)) 
            {
                System.err.println("Aviso: Funcionario ja esta no departamento !");
                return;
            }
        }
        
        funcionarios[quantidadeFuncionarios] = funcionario;
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
        Funcionario[] copia = new Funcionario[quantidadeFuncionarios];
        
        for(int i=0; i<quantidadeFuncionarios; i++)
        {
            copia[i]=funcionarios[i];
        }
        
        return copia;
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
  