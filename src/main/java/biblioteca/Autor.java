/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import  java.util.List;

public class Autor 
{
    private String nome;
    private String rna;
    private List<Livro> livros;

    public Autor() {
        // Construtor padrão vazio necessário para a desserialização do Jackson
    }

    public Autor(String nome, String rna, List<Livro> livros) {
        this.nome = nome;
        this.rna = rna;
        this.livros = livros;
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
   
    public void mostrarDados() {
        System.out.println("--------- Autor ------------ " );
        System.out.println(" " );
        System.out.println("Nome do Autor: " + nome);
        System.out.println("RNA do Autor: " + rna);

        if (livros != null && !livros.isEmpty()) {
            System.out.println("Livros do Autor:");
            for (Livro livro : livros) {
                System.out.println("  - Nome do Livro: " + livro.getNome());
                System.out.println("    ID do Livro: " + livro.getId());
             
            }
        } else {
            System.out.println("O autor não possui livros.");
        }
        System.out.println(" " );
        System.out.println("---------------------------- " );
        System.out.println(" " );
    }
    


}
