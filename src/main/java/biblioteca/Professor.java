/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Professor extends Socio{
    private String matriculaProfessor;
    
    public Professor() {
        super();
    }

    public Professor(String nome, String cpf, List<Emprestimo> emprestimo, String matriculaProfessor) {
        super(nome, cpf, emprestimo);
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(String matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

   

    public void mostrarDados() {
        System.out.println("--------- Professor ------------ " );
        System.out.println(" " );
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Matrícula: " + getMatriculaProfessor());
        for (Emprestimo emprestimo : getEmprestimo()) {
            System.out.println("Data de empréstimo: " + emprestimo.getDataEmprestimo());
            System.out.println("Data de entrega: " + emprestimo.getDatadeEntrega());
            System.out.println("ID do exemplar: " + emprestimo.getExemplar().getNumero());
            System.out.println("Nome do livro: " + emprestimo.getExemplar().getLivro().getNome());
            System.out.println("ID do livro: " + emprestimo.getExemplar().getLivro().getId());
            System.out.println("Preço do livro: " + emprestimo.getExemplar().getLivro().getPreco());
            System.out.println("ISBN do livro: " + emprestimo.getExemplar().getLivro().getIsbn());
            System.out.println("Nome do sócio: " + emprestimo.getSocio().getNome());
            System.out.println("CPF do sócio: " + emprestimo.getSocio().getCpf());
        }
        System.out.println(" " );
        System.out.println("---------------------------- " );
        System.out.println(" " );
    }
         
    
}
