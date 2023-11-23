/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package biblioteca;
import  java.util.List;
import java.util.Scanner;
public class Biblioteca {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        // List<Autor> autores =  DataRepository.getAutoresFromJson("json/autor.json");
        // List<Aluno>  alunos =  DataRepository.getAlunosFromJson("json/aluno.json");
        // List<Exemplar>  exemplares = DataRepository.getExemplaresFromJson("json/exemplar.json");
        // List<Emprestimo>  emprestimos =  DataRepository.getEmprestimosFromJson("json/emprestimo.json");
        // List<Professor>  professores =  DataRepository.getProfessoresFromJson("json/professor.json");
        // List<Reserva>  reservas =  DataRepository.getReservasFromJson("json/reserva.json");
        // List<Livro> livros =  DataRepository.getLivrosFromJson("json/livro.json");
        // List<Socio>  socios =  DataRepository.getSociosFromJson("json/socio.json");
        

        while (true) {
            System.out.println("===== Menu Principal =====");
            System.out.println("1. Mostrar dados das classes");
            System.out.println("2. Mostrar dados estatísticos");
            System.out.println("3. Sair");

            // Leitura da escolha do usuário
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    mostrarDadosDasClasses();
                    break;

                case 2:
                    mostrarDadosEstatisticos();
                    break;

                case 3:
                    System.out.println("Saindo do programa. Até logo!");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void mostrarDadosEstatisticos() {
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
            System.out.println("===== Escolha o Dado Estatístico que deseja mostrar =====");
            System.out.println("1. Contagem de Livros por Autor");
            System.out.println("2. Média de Emprestimos por Aluno");
            System.out.println("3. Verificar Disponibilidade de Exemplares");
            System.out.println("4. Voltar ao Menu Principal");
    
            System.out.print("Escolha um dado estatístico ou 5 para voltar: ");
            int escolhaEstatistica = scanner.nextInt();
    
            switch (escolhaEstatistica) {
                case 1:
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.println("===== Contagem de Livros por Autor =====");
                    Estatisticas.contarLivrosPorAutor(DataRepository.getAutoresFromJson("json/autor.json"));
                    System.out.print(" ");
                    System.out.print(" ");
                    break;
            
                case 2:
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.println("===== Média de Empréstimos por Aluno =====");
                    System.out.println("Média de Empréstimos por Aluno: " +
                            Estatisticas.calcularMediaDeEmprestimos(DataRepository.getAlunosFromJson("json/aluno.json")));
                    System.out.print(" ");
                    System.out.print(" ");
                    break;
            
                case 3:
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.println("===== Verificar Disponibilidade de Exemplares por ID =====");
                    System.out.print("Digite o ID do livro: ");
                    String idLivro = scanner.next();
                    boolean disponivel = Estatisticas.verificarDisponibilidadeExemplaresPorId(
                            DataRepository.getLivrosFromJson("json/livro.json"), idLivro);
                    System.out.println("Exemplar disponível do livro com ID " + idLivro + ": " + disponivel);
                    System.out.print(" ");
                    System.out.print(" ");
                    break;
            
                case 4:
                    // Voltar ao Menu Principal
                    System.out.println("Retornando ao Menu Principal.");
                  return;
            
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }


     public static void mostrarDadosDasClasses() {
        Scanner scanner = new Scanner(System.in);

        // Submenu para escolher a classe
        while (true) {
            System.out.println("===== Escolha a Classe que deseja mostrar os dados =====");
            System.out.println("1. Autor");
            System.out.println("2. Aluno");
            System.out.println("3. Exemplar");
            System.out.println("4. Emprestimo");
            System.out.println("5. Professor");
            System.out.println("6. Reserva");
            System.out.println("7. Livro");
            System.out.println("8. Socio");
            // Adicione as outras classes conforme necessário
            System.out.println("9. Voltar ao Menu Principal");

            // Leitura da escolha do usuário
            System.out.print("Escolha uma classe ou 9 para voltar: ");
            int escolhaClasse = scanner.nextInt();

            switch (escolhaClasse) {
                case 1:
                    List<Autor> autores =  DataRepository.getAutoresFromJson("json/autor.json");
                    autores.forEach( autor -> autor.mostrarDados());
                    break;

                case 2:
                    List<Aluno>  alunos =  DataRepository.getAlunosFromJson("json/aluno.json");
                    alunos.forEach( aluno -> aluno.mostrarDados());
                    break;
                case 3:
                    List<Exemplar>  exemplares = DataRepository.getExemplaresFromJson("json/exemplar.json");
                    exemplares.forEach( exemplar -> exemplar.mostrarDados());
                    break;
                case 4:
                   List<Emprestimo>  emprestimos =  DataRepository.getEmprestimosFromJson("json/emprestimo.json");
                    emprestimos.forEach( emprestimo -> emprestimo.mostrarDados());
                    break;
                case 5:
                    List<Professor>  professores =  DataRepository.getProfessoresFromJson("json/professor.json");
                     professores.forEach( professor -> professor.mostrarDados());
                    break;
                case 6:
                     List<Reserva>  reservas =  DataRepository.getReservasFromJson("json/reserva.json");
                     reservas.forEach( reserva -> reserva.mostrarDados());
                    break;
                case 7:
                    List<Livro> livros =  DataRepository.getLivrosFromJson("json/livro.json");
                    livros.forEach( livro -> livro.mostrarDados());
                    break;
                case 8:
                            List<Socio>  socios =  DataRepository.getSociosFromJson("json/socio.json");
                    socios.forEach( socio -> socio.mostrarDados());
                    break;

                // Adici    one os casos para as outras classes conforme necessário

                case 9:
                    // Voltar ao Menu Principal
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
