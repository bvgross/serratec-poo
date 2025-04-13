package src.teste;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conexao = null;
		
		
		try {
			String url = "jdbc:postgresql://localhost:5432/biblioteca";
			String usuario = "postgres";
			String senha = "";

			// 1. Conexão com banco SQLite
			conexao = DriverManager.getConnection(url, usuario, senha);
			
			// 2. Criar tabela se não existir
			String criarTabela = "CREATE TABLE IF NOT EXISTS biblioteca.teste2 ("
					+ "id SERIAL PRIMARY KEY,"
					+ "nome VARCHAR(100))";
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
                
                opcao = sc.nextInt();
                
                sc.nextLine();
                
                switch (opcao) {
                	
                	case 1:
                		
                		System.out.println("Nome: ");
                		String nome = sc.nextLine();
                		PreparedStatement insert = conexao.prepareStatement("INSERT INTO biblioteca.teste (nome) VALUES (?)");
                		insert.setString(1, nome);
                		insert.executeUpdate();
                		insert.close();
                		System.out.println("Usuário adicionado!");
                }
				
			} while (opcao == 1);
			
		} catch (SQLException e) {
            e.printStackTrace();
		}
	}
}
