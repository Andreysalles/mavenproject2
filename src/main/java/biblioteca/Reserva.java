/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Reserva 
{
    private String dataInicio;
    private String cpf;
    private List<Livro> livros;
    Reserva(){

    }
    public Reserva(String dataInicio, String cpf, List<Livro> livros) {
        this.dataInicio = dataInicio;
        this.cpf = cpf;
        this.livros = livros;
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

    public static Reserva carregarDadosDoJson(String caminhoArquivo) {
        try {
            // Criação de um objeto ObjectMapper do Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // Leitura do arquivo JSON e desserialização para um objeto Java
            Reserva reserva = objectMapper.readValue(new File(caminhoArquivo), Reserva.class);

            // Retorna o objeto Reserva com os dados carregados do JSON
            return reserva;
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Tratamento adequado de erro, você pode lançar uma exceção ou retornar um valor padrão
        }
    }

    public void mostrarDados() {
        System.out.println("--------- Autor ------------ " );
        System.out.println(" " );
        System.out.println("Data de início: " + getDataInicio());
        System.out.println("CPF: " + getCpf());
        System.out.println("Livros:");
        for (Livro livro : getLivros()) {
            System.out.println("\tNome: " + livro.getNome());
            System.out.println("\tID: " + livro.getId());
            System.out.println("\tPreço: " + livro.getPreco());
            System.out.println("\tISBN: " + livro.getIsbn());
        }
        System.out.println(" " );
        System.out.println("---------------------------- " );
        System.out.println(" " );
    }
}
