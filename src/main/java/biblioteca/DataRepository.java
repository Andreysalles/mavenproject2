package biblioteca;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataRepository {
    
    public static List<Livro> getLivrosFromJson(String caminhoArquivo) {
        try {
            // Criação de um objeto ObjectMapper do Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // Leitura do arquivo JSON e desserialização para um objeto Java
           List<Livro> livros = objectMapper.readValue(new File(caminhoArquivo), new TypeReference<List<Livro>>() {});

            // Retorna o objeto Livro com os dados carregados do JSON
            return livros;
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Tratamento adequado de erro, você pode lançar uma exceção ou retornar um valor padrão
        }
    }

    public static List<Exemplar> getExemplaresFromJson(String caminhoArquivo) {
        try {
            // Criação de um objeto ObjectMapper do Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // Leitura do arquivo JSON e desserialização para um objeto Java
            List<Exemplar> exemplares = objectMapper.readValue(new File(caminhoArquivo), new TypeReference<List<Exemplar>>() {});
            // Retorna o objeto Exemplar com os dados carregados do JSON
            return exemplares;
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Tratamento adequado de erro, você pode lançar uma exceção ou retornar um valor padrão
        }
    }

    public static List<Emprestimo> getEmprestimosFromJson(String caminhoArquivo) {
        try {
            // Criação de um objeto ObjectMapper do Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // Leitura do arquivo JSON e desserialização para um objeto Java
            List<Emprestimo> emprestimos = objectMapper.readValue(new File(caminhoArquivo), new TypeReference<List<Emprestimo>>() {});

            // Retorna o objeto Emprestimo com os dados carregados do JSON
            return emprestimos;
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Tratamento adequado de erro, você pode lançar uma exceção ou retornar um valor padrão
        }
    }

    public static List<Professor> getProfessoresFromJson(String caminhoArquivo) {
        try {
            // Criação de um objeto ObjectMapper do Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // Leitura do arquivo JSON e desserialização para um objeto Java
            List<Professor> professores = objectMapper.readValue(new File(caminhoArquivo), new TypeReference<List<Professor>>() {});
            // Retorna o objeto Professor com os dados carregados do JSON
            return professores;
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Tratamento adequado de erro, você pode lançar uma exceção ou retornar um valor padrão
        }
    }

    public static  List<Reserva> getReservasFromJson(String caminhoArquivo) {
        try {
            // Criação de um objeto ObjectMapper do Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // Leitura do arquivo JSON e desserialização para um objeto Java
            List<Reserva> reservas = objectMapper.readValue(new File(caminhoArquivo), new TypeReference<List<Reserva>>() {});

            // Retorna o objeto Reserva com os dados carregados do JSON
            return reservas;
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Tratamento adequado de erro, você pode lançar uma exceção ou retornar um valor padrão
        }
    }

    public static  List<Aluno> getAlunosFromJson(String caminhoArquivo) {
        try {
            // Criação de um objeto ObjectMapper do Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // Leitura do arquivo JSON e desserialização para um objeto Java
            List<Aluno> alunos = objectMapper.readValue(new File(caminhoArquivo), new TypeReference<List<Aluno>>() {});


            // Retorna o objeto Aluno com os dados carregados do JSON
            return alunos;
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Tratamento adequado de erro, você pode lançar uma exceção ou retornar um valor padrão
        }
    }

    public static List<Autor> getAutoresFromJson(String caminhoArquivo) {
        try {
            // Criação de um objeto ObjectMapper do Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // Leitura do arquivo JSON e desserialização para um objeto Java
            List<Autor> autores = objectMapper.readValue(new File(caminhoArquivo), new TypeReference<List<Autor>>() {});

            // Retorna o objeto Autor com os dados carregados do JSON
            return autores;
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Tratamento adequado de erro, você pode lançar uma exceção ou retornar um valor padrão
        }
    }

    public static List<Socio> getSociosFromJson(String caminhoArquivo) {
        try {
            // Criação de um objeto ObjectMapper do Jackson
            ObjectMapper objectMapper = new ObjectMapper();

            // Leitura do arquivo JSON e desserialização para um objeto Java
            List<Socio> socios = objectMapper.readValue(new File(caminhoArquivo), new TypeReference<List<Socio>>() {});
            // Retorna o objeto Socio com os dados carregados do JSON
            return socios;
        } catch (IOException e) {
            e.printStackTrace();
            return null; // Tratamento adequado de erro, você pode lançar uma exceção ou retornar um valor padrão
        }
    }

}
