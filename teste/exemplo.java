
import java.sql.*;

import java.util.Scanner;



public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Connection conexao = null;



        try {

            // 1. Conexão com banco PostgreSQL (ajuste os dados da URL conforme seu ambiente)

            String url = "jdbc:postgresql://localhost:5432/seu_banco";

            String usuario = "seu_usuario";

            String senha = "sua_senha";

            conexao = DriverManager.getConnection(url, usuario, senha);



            // 2. Criar tabela se não existir

            String criarTabela = "CREATE TABLE IF NOT EXISTS usuarios (" +

                                 "id SERIAL PRIMARY KEY, " +

                                 "nome TEXT)";

            Statement stmt = conexao.createStatement();

            stmt.execute(criarTabela);



            // 3. Menu CRUD

            int opcao;

            do {

                System.out.println("\n1 - Adicionar");

                System.out.println("2 - Listar");

                System.out.println("3 - Atualizar");

                System.out.println("4 - Deletar");

                System.out.println("0 - Sair");

                System.out.print("Escolha: ");

                opcao = scanner.nextInt();

                scanner.nextLine(); // limpar buffer



                switch (opcao) {

                    case 1:

                        // Exibe a mensagem pedindo o nome do novo usuário
                        System.out.print("Nome: ");
                        
                        // Lê o nome digitado pelo usuário e armazena na variável 'nome'
                        String nome = scanner.nextLine();
                        
                        // Prepara uma instrução SQL para inserir um novo nome na tabela 'usuarios'
                        // O uso do '?' evita SQL Injection (injeção de código malicioso)
                        PreparedStatement insert = conexao.prepareStatement("INSERT INTO usuarios (nome) VALUES (?)");
                        
                        // Substitui o primeiro '?' do SQL pelo valor da variável 'nome'
                        insert.setString(1, nome);
                        
                        // Executa o comando de inserção no banco de dados
                        insert.executeUpdate();
                        
                        // Fecha o PreparedStatement para liberar recursos
                        insert.close();
                        
                        // Informa o usuário que o dado foi inserido com sucesso
                        System.out.println("Usuário adicionado!");
                        
                        // Encerra o bloco do case 1 e volta para o menu


                    case 2:

                        ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");

                        while (rs.next()) {

                            System.out.println("ID: " + rs.getInt("id") + " | Nome: " + rs.getString("nome"));

                        }

                        rs.close();

                        break;



                    case 3:

                        System.out.print("ID do usuário a atualizar: ");

                        int idAtualizar = scanner.nextInt();

                        scanner.nextLine(); // limpar buffer

                        System.out.print("Novo nome: ");

                        String novoNome = scanner.nextLine();

                        PreparedStatement update = conexao.prepareStatement("UPDATE usuarios SET nome = ? WHERE id = ?");

                        update.setString(1, novoNome);

                        update.setInt(2, idAtualizar);

                        update.executeUpdate();

                        update.close();

                        System.out.println("Usuário atualizado!");

                        break;



                    case 4:

                        System.out.print("ID do usuário a deletar: ");

                        int idDeletar = scanner.nextInt();

                        PreparedStatement delete = conexao.prepareStatement("DELETE FROM usuarios WHERE id = ?");

                        delete.setInt(1, idDeletar);

                        delete.executeUpdate();

                        delete.close();

                        System.out.println("Usuário deletado!");

                        break;



                    case 0:

                        System.out.println("Encerrando...");

                        break;



                    default:

                        System.out.println("Opção inválida.");

                }

            } while (opcao != 0);



            stmt.close();

            conexao.close();

            scanner.close();



        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}




Buscar

Refletir
