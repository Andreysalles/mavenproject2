package biblioteca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estatisticas {

    // Método para contar o número de livros por autor
    public static Map<String, Integer> contarLivrosPorAutor(List<Autor> autores) {
        // Mapa para armazenar a contagem de livros por autor
        Map<String, Integer> contagemPorAutor = new HashMap<>();

        // Itera sobre a lista de autores
        for (Autor autor : autores) {
            // Obtém o nome do autor
            String nomeAutor = autor.getNome();
            // Obtém o número de livros associados ao autor
            int numLivros = autor.getLivros().size();

            // Armazena a contagem no mapa
            contagemPorAutor.put(nomeAutor, numLivros);
        }

        // Exibe a contagem de livros por autor no console
        System.out.println("Contagem de Livros por Autor: " + contagemPorAutor);

        // Retorna o mapa de contagem
        return contagemPorAutor;
    }

    // Método para calcular a média de empréstimos por aluno
    public static double calcularMediaDeEmprestimos(List<Aluno> alunos) {
        // Verifica se a lista de alunos é nula ou vazia
        if (alunos == null || alunos.isEmpty()) {
            return 0.0; // Retorna 0.0 se não houver alunos
        }

        // Inicializa a variável para armazenar o total de empréstimos
        int totalEmprestimos = 0;

        // Itera sobre a lista de alunos
        for (Aluno aluno : alunos) {
            // Adiciona o número de empréstimos do aluno ao total
            totalEmprestimos += aluno.getEmprestimo().size();
        }

        // Calcula a média de empréstimos por aluno
        return (double) totalEmprestimos / alunos.size();
    }

    // Método para verificar a disponibilidade de exemplares por ID de livro
    public static boolean verificarDisponibilidadeExemplaresPorId(List<Livro> livros, String idLivro) {
        // Itera sobre a lista de livros
        for (Livro livro : livros) {
            // Verifica se o ID do livro corresponde ao ID fornecido
            if (livro.getId().equals(idLivro)) {
                // Verifica se o livro possui exemplares
                if (livro.getExemplares() != null && !livro.getExemplares().isEmpty()) {
                    // Itera sobre os exemplares do livro
                    for (Exemplar exemplar : livro.getExemplares()) {
                        // Verifica se o exemplar não está emprestado
                        if (!exemplar.isEmprestado()) {
                            return true; // Exemplar disponível
                        }
                    }
                } else {
                    System.out.println("O livro com ID " + idLivro + " não possui exemplares.");
                }
                return false; // Todos os exemplares estão emprestados
            }
        }

        // Retorna false se o livro não for encontrado na lista
        return false;
    }
}
