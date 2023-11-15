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
public class Reserva 
{
    private String dataInicio;
    private String cpf;
    private List<Livro> livros;

    public Reserva(String dataInicio, String cpf) 
    {
        this.dataInicio = dataInicio;
        this.cpf = cpf;
        this.livros = new ArrayList<>();
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    
    public void addLivro(Livro livro)
    {
        livros.add(livro);
    }
}
