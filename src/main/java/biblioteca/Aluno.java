/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.util.ArrayList;
import java.util.List;



public class Aluno extends Socio 
{ 
    private String matriculaAluno;
    
    public Aluno() {
        super();
    }

    public Aluno(String nome, String cpf, ArrayList<Emprestimo> emprestimo, String matriculaAluno) {
        super(nome, cpf, emprestimo);
        this.matriculaAluno = matriculaAluno;
    }
    public List<Emprestimo> getEmprestimo() {
        return emprestimo;
    }
    public String getMatriculaAluno() {
        return matriculaAluno;
    }
    public void setEmprestimo(List<Emprestimo> emprestimo) {
        this.emprestimo = (List<Emprestimo>) emprestimo;
    }
    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }
    
    
    public void mostrarDados() {
        System.out.println("--------- Aluno ------------ " );
        System.out.println(" " );
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Matrícula: " + getMatriculaAluno());
        System.out.println("Emprestimos:");
        for (Emprestimo emprestimo : getEmprestimo()) {
            System.out.println("\tData de empréstimo: " + emprestimo.getDataEmprestimo());
            System.out.println("\tData de entrega: " + emprestimo.getDatadeEntrega());
            System.out.println("\tExemplar:");
            System.out.println("\t\tID: " + emprestimo.getExemplar().getNumero());
            System.out.println("\t\tLivro:");
            System.out.println("\t\t\tNome: " + emprestimo.getExemplar().getLivro().getNome());
            System.out.println("\t\t\tID: " + emprestimo.getExemplar().getLivro().getId());
            System.out.println("\t\t\tPreço: " + emprestimo.getExemplar().getLivro().getPreco());
            System.out.println("\t\t\tISBN: " + emprestimo.getExemplar().getLivro().getIsbn());
            System.out.println("\t\tSócio:");
            System.out.println("\t\t\tNome: " + emprestimo.getSocio().getNome());
            System.out.println("\t\t\tCPF: " + emprestimo.getSocio().getCpf());
        }
        System.out.println(" " );
        System.out.println("---------------------------- " );
        System.out.println(" " );
   
    }

    
}
