/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author carlos
 */
public class socio 
{
    private String nome;
    private String cpf;
    private ArrayList<Emprestimo> emprestimo;

    public socio(String nome, String cpf) 
    {
        this.nome = nome;
        this.cpf = cpf;
        this.emprestimo = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Emprestimo> getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(ArrayList<Emprestimo> emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public void addEmprestimo(Emprestimo emprestimo)
    {
        emprestimo.add(emprestimo);
    }

    
    
}
