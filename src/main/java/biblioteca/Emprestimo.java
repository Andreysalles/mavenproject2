/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Emprestimo {
    private Exemplar exemplar;
    private String dataEmprestimo;
    private String datadeEntrega;
    private Socio socio;
    Emprestimo(){

    }

    public Emprestimo(Exemplar exemplar, String dataEmprestimo, String datadeEntrega, Socio socio) {
        this.exemplar = exemplar;
        this.dataEmprestimo = dataEmprestimo;
        this.datadeEntrega = datadeEntrega;
      
    }
    void add(Emprestimo emprestimo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Exemplar getExemplar() {
        return exemplar;
    }
    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public String getDatadeEntrega() {
        return datadeEntrega;
    }
    public void setDatadeEntrega(String datadeEntrega) {
        this.datadeEntrega = datadeEntrega;
    }
     public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
    public void mostrarDados() {
        System.out.println("Dados do Empréstimo:");
        System.out.println("Livro emprestado: " + exemplar.getLivro().getNome());
        System.out.println("Data de Empréstimo: " + dataEmprestimo);
        System.out.println("Data de Entrega: " + datadeEntrega);
        System.out.println("Sócio: " + socio.getNome());
    }

   

}
