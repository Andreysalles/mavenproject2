/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;


public class Exemplar 
{   private Livro livro;
    private int numero;
    private boolean emprestado;

    public Exemplar(int numero, boolean emprestado) {
        this.numero = numero;
        this.emprestado = emprestado;
    }

    public Exemplar(){

    }

    public boolean isEmprestado() {
        return emprestado;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public  void mostrarDados() {
            System.out.println("--------- Exemplar ------------ " );
            System.out.println(" " );
            System.out.println("Número: " + getNumero());
            System.out.println("Emprestado: " + isEmprestado());
            System.out.println("Livro:");
            System.out.println("\tNome: " + getLivro().getNome());
            System.out.println("\tID: " + getLivro().getId());
            System.out.println("\tPreço: " + getLivro().getPreco());
            System.out.println("\tISBN: " + getLivro().getIsbn());
            System.out.println(" " );
            System.out.println("------------------------------- " );
            
       
    }



    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
}
