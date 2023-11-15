/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.util.ArrayList;
import  java.util.List;
/**
 *
 * @author carlos
 */
public class Livro 
{
    private String nome;
    private String id;
    private float preco;
    private int isbn;
    private List<Autor> autores;
    private List<Exemplar> exemplares;
    private String cpfEmprestimo;

    public Livro(String nome, String id, float preco, int isbn) 
    {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.isbn = isbn;
        this.autores = new ArrayList<>();
        this.exemplares = new ArrayList<>();
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

    public List<Autor> getAutores() 
    {
        return autores;
    }

    public void setAutores(List<Autor> autores) 
    {
        this.autores = autores;
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
    
}
