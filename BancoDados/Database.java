/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDados;

import MODELO.Departamento;
import java.util.Arrays;

/**
 *
 * @author Luan
 */
public class Database {

    private String nome;
    private Departamento[] departamentos;
    private int quantidadeDepartamentos;
    private int MAX;

    public Database(int MAX) {
        this.departamentos = new Departamento[MAX];
        this.quantidadeDepartamentos = 0;
    }

    public void adicionarDepartamento(Departamento novo) {
        if (quantidadeDepartamentos < departamentos.length) {
            departamentos[quantidadeDepartamentos++] = novo;
        } else {
            System.err.println("Limite de departamentos atingido!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento[] getDepartamentos() {
        return Arrays.copyOf(this.departamentos, this.quantidadeDepartamentos);
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }

    public int getQuantidadeDepartamentos() {
        return quantidadeDepartamentos;
    }

    public void setQuantidadeDepartamentos(int quantidadeDepartamentos) {
        this.quantidadeDepartamentos = quantidadeDepartamentos;
    }

    public int getMAX() {
        return MAX;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }

}
