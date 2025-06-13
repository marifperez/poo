/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author mari
 */
public class Controlador 
{
    private Universidade universidade;

    
    public Controlador(Universidade universidade) 
    {
        if(universidade == null)
        {
            System.err.println("Erro: a univeridade nao pdoe ser nula !!");
            this.universidade=new Universidade("Universidade padrao"); 
            
        }else{
              this.universidade = universidade;
        }
        
    }

    
      public void listarTodosFuncionarios() 
      {
           System.out.println("\n\n" );
        System.out.println("\n=== LISTA DE TODOS OS FUNCIONARIOS ===");
        
        for (Departamento dep : universidade.getDepartamentos()) 
        {
            System.out.println("\nDepartamento: " + dep.getNome());
            
            for (Funcionario func : dep.getFuncionarios())
            {
                System.out.println("  " + func);
            }
        }
        
    }

      
      
    /**
     * mostra um resumo de todos os departamentos
     */
    public void exibirResumoDepartamentos()
    { System.out.println("\n\n" );
        
        System.out.println("\n=== RESUMO DOS DEPARTAMENTOS ===");
        
        for (Departamento dep : universidade.getDepartamentos()) 
        {
            System.out.println(dep);
        }
        
    }

    
    
    /** procura um func pelo cigo */
    public void buscarFuncionarioPorCodigo(String codigo) 
    {
         System.out.println("\n\n" );
        System.out.println("\n=== BUSCA POR CODIGO: " + codigo + " ===");
        boolean encontrado = false;
        
        for (Departamento dep : universidade.getDepartamentos()) 
        {
            for (Funcionario func : dep.getFuncionarios()) 
            {
                if (func.getCodigo().equals(codigo)) 
                {
                    System.out.println("Funcionario encontrado:");
                    System.out.println("  Departamento: " + dep.getNome());
                    System.out.println("  " + func);
                    encontrado = true;
                }
            }
        }
        
        if (!encontrado) 
        {
            System.out.println("Nenhum funcionario encontrado com o codigo: " + codigo);
        }
    }
    
    
    public void resumirDepartamentosPorFaixa(double min, double max) 
{
    System.out.println("\n\n");
    System.out.printf("=== DEPARTAMENTOS COM GASTO ENTRE R$%.2f E R$%.2f ===\n", min, max);

    boolean encontrado = false;

    for (Departamento dep : universidade.getDepartamentos()) 
    {
        double gasto = dep.calcularGastoTotal();

        if (gasto >= min && gasto <= max) 
        {
            System.out.println(dep); // usa o toString do departamento
            encontrado = true;
        }
    }

    if (!encontrado) 
    {
        System.out.println("Nenhum departamento encontrado nessa faixa de gasto.");
    }
}
    
    
    
    
    
    
    

/* lista todos os docentes efetivos
     */
    public void listarDocentesEfetivos() 
    {
         System.out.println("\n\n" );
        System.out.println("\n=== DOCENTES EFETIVOS ===");
        
        for (Departamento dep : universidade.getDepartamentos())
        {
            for (Funcionario func : dep.getFuncionarios()) 
            {
                if (func instanceof Efetivo)
                {
                    System.out.println("  " + func);
                }
            }
        }
    }

    /**mostra todos os docentes subs
     */
    
    public void listarDocentesSubstitutos() 
    {
         System.out.println("\n\n" );
        System.out.println("\n=== DOCENTES SUBSTITUTOS ===");
        
        for (Departamento dep : universidade.getDepartamentos())
        {
            for (Funcionario func : dep.getFuncionarios()) 
            {
                if (func instanceof Substituto) 
                {
                    System.out.println("  " + func);
                }
            }
        }
         System.out.println("\n\n" );
    }
    
    
    
    
    public void emitirRelatorioGeral() 
    {
        System.out.println("\n\n");
        System.out.println("=== RELATORIO GERAL DA UNIVERSIDADE ===");

        for (Departamento dep : universidade.getDepartamentos()) 
        {
            System.out.println("\nDepartamento: " + dep.getNome());
            System.out.println("Codigo: " + dep.getCodigo());

            double totalGasto = 0;
            for (Funcionario func : dep.getFuncionarios()) 
            {
                System.out.println("  " + func); // usa o toString do funcionario
                totalGasto += func.calcularSalario();
            }

            System.out.printf("Gasto total com funcionarios: R$%.2f\n", totalGasto);
        }
    }

    
    
    public void listarFuncionariosPorSalario(double min, double max) 
    {
        System.out.println("\n\n");
        System.out.printf("=== FUNCIONARIOS COM SALARIO ENTRE R$%.2f E R$%.2f ===\n", min, max);

        boolean encontrado = false;

        for (Departamento dep : universidade.getDepartamentos()) 
        {
            for (Funcionario func : dep.getFuncionarios()) 
            {
                double salario = func.calcularSalario();

                if (salario >= min && salario <= max) 
                {
                    System.out.println("Departamento: " + dep.getNome());
                    System.out.println("  " + func);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) 
        {
            System.out.println("Nenhum funcionario encontrado nessa faixa salarial.");
        }
    }

    
    
    public void listarTecnicos() 
    {
        System.out.println("\n\n");
        System.out.println("=== FUNCIONARIOS TECNICOS ===");

        boolean encontrado = false;

        for (Departamento dep : universidade.getDepartamentos()) 
        {
            for (Funcionario func : dep.getFuncionarios()) 
            {
                if (func instanceof Tecnico) 
                {
                    System.out.println("Departamento: " + dep.getNome());
                    System.out.println("  " + func);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) 
        {
            System.out.println("Nenhum tecnico encontrado.");
        }
    }

    
    
    public void listarDocentes() 
    {
        System.out.println("\n\n");
        System.out.println("=== TODOS OS DOCENTES ===");

        boolean encontrado = false;

        for (Departamento dep : universidade.getDepartamentos()) 
        {
            for (Funcionario func : dep.getFuncionarios()) 
            {
                if (func instanceof Docente) 
                {
                    System.out.println("Departamento: " + dep.getNome());
                    System.out.println("  " + func);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) 
        {
            System.out.println("Nenhum docente encontrado.");
        }
    }

    
    
    public void mostrarDepartamento(String codigoDep) 
    {
        System.out.println("\n\n");
        System.out.println("=== INFORMACOES DO DEPARTAMENTO: " + codigoDep + " ===");

        Departamento encontrado = null;

        for (Departamento dep : universidade.getDepartamentos()) 
        {
            if (dep.getCodigo().equalsIgnoreCase(codigoDep)) 
            {
                encontrado = dep;
                break;
            }
        }

        if (encontrado == null) 
        {
            System.out.println("Departamento nao encontrado com o codigo: " + codigoDep);
            return;
        }

        System.out.println("Nome: " + encontrado.getNome());
        System.out.println("Codigo: " + encontrado.getCodigo());
        System.out.println("Quantidade de funcionarios: " + encontrado.getQuantidadeFuncionarios());

        System.out.println("\nFuncionarios:");
        for (Funcionario func : encontrado.getFuncionarios()) 
        {
            System.out.println("  " + func);
        }

        System.out.printf("\nGasto total com salarios: R$%.2f\n", encontrado.calcularGastoTotal());
    }

    
    
    
    public void buscarFuncionarioPorNome(String nome) 
    {
        System.out.println("\n\n");
        System.out.println("=== BUSCA POR NOME: " + nome + " ===");

        boolean encontrado = false;

        for (Departamento dep : universidade.getDepartamentos()) 
        {
            for (Funcionario func : dep.getFuncionarios()) 
            {
                if (func.getNome().equalsIgnoreCase(nome)) 
                {
                    System.out.println("Funcionario encontrado:");
                    System.out.println("  Departamento: " + dep.getNome());
                    System.out.println("  " + func);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) 
        {
            System.out.println("Nenhum funcionario encontrado com o nome: " + nome);
        }
    }

    
    
    

}
   