package biblioteca;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estatisticas {

    // Método para contar o número de livros por autor
    public static Map<String, Integer> contarLivrosPorAutor(List<Autor> autores) {
        Map<String, Integer> contagemPorAutor = new HashMap<>();

        for (Autor autor : autores) {
            String nomeAutor = autor.getNome();
            int numLivros = autor.getLivros().size();

            contagemPorAutor.put(nomeAutor, numLivros);
        }
        System.out.println("Contagem de Livros por Autor: " + contagemPorAutor);
        return contagemPorAutor;
    }

    public static double calcularMediaDeEmprestimos(List<Aluno> alunos) {
        if (alunos == null || alunos.isEmpty()) {
            return 0.0;
        }

        int totalEmprestimos = 0;
        for (Aluno aluno : alunos) {
            totalEmprestimos += aluno.getEmprestimo().size();
        }

        return (double) totalEmprestimos / alunos.size();
    }

    public static boolean verificarDisponibilidadeExemplaresPorId(List<Livro> livros, String idLivro) {
        for (Livro livro : livros) {
            if (livro.getId().equals(idLivro)) {
                if (livro.getExemplares() != null && !livro.getExemplares().isEmpty()) {
                    for (Exemplar exemplar : livro.getExemplares()) {
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
    
        // Livro não encontrado
        System.out.println("O livro com ID " + idLivro + " não foi encontrado.");
        return false;
    }
}