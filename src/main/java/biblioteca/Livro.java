/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.io.File;
import java.io.IOException;
import  java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Livro 
{
    private String nome;
    private String id;
    private float preco;
    private int isbn;
    private List<Exemplar> exemplares;
    private String cpfEmprestimo;
    private List<Autor> autores;

    public Livro(){
        
    }
    public Livro(String nome, String id, float preco, int isbn, List<Exemplar> exemplares, String cpfEmprestimo,
            List<Autor> autores) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.isbn = isbn;
        this.exemplares = exemplares;
        this.cpfEmprestimo = cpfEmprestimo;
        this.autores = autores;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getId() 
    {
        return id;
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    public float getPreco() 
    {
        return preco;
    }

    public void setPreco(float preco) 
    {
        this.preco = preco;
    }

    public int getIsbn() 
    {
        return isbn;
    }

    public void setIsbn(int isbn) 
    {
        this.isbn = isbn;
    }

    public List<Exemplar> getExemplares() 
    {
        return exemplares;
    }

    public void setExemplares(List<Exemplar> exemplares) 
    {
        this.exemplares = exemplares;
    }

    public String getCpfEmprestimo() 
    {
        return cpfEmprestimo;
    }

    public void setCpfEmprestimo(String cpfEmprestimo) 
    {
        this.cpfEmprestimo = cpfEmprestimo;
    }

    public List<Autor> getAutores() {
        return autores;
    }
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    

    public void mostrarDados() {
        System.out.println("--------- Livro ------------ " );
        System.out.println(" " );
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Preço: " + preco);
        System.out.println("ISBN: " + isbn);
        System.out.println("Exemplares:");
        for (Exemplar exemplar : exemplares) {
            System.out.println("\tNúmero: " + exemplar.getNumero());
            System.out.println("\tEmprestado: " + exemplar.isEmprestado());
        }
        System.out.println("CPF de empréstimo: " + cpfEmprestimo);
        System.out.println("Autores:");
        for (Autor autor : autores) {
            System.out.println("\tNome: " + autor.getNome());
            System.out.println("\tRNA: " + autor.getRna());
        }
        System.out.println(" " );
        System.out.println("------------------------------ " );
    }

    
}
