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
public class Autor 
{
    private String nome;
    private String rna;
    private List<Livro> livros;

    public Autor(String nome, String rna) 
    {
        this.nome = nome;
        this.rna = rna;
        this.livros = new ArrayList<>();
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getRna() 
    {
        return rna;
    }

    public void setRna(String rna) 
    {
        this.rna = rna;
    }

    public List<Livro> getLivros() 
    {
        return livros;
    }

    public void setLivros(List<Livro> livros) 
    {
        this.livros = livros;
    }

}
