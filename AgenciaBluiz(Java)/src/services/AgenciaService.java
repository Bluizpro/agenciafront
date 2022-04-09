package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connector.Conexaobanco;
import model.Agencia;

public class AgenciaService {

	public void save() {
		Scanner sc = new Scanner(System.in);
		Agencia nome = new Agencia(); 
		
		System.out.println("Digite seu Nome");
		nome.setNome(sc.nextLine());
		System.out.println("Digite seu Endereco");
		nome.setEndereco(sc.nextLine());
		System.out.println("Digite seu Destino");
		nome.setDestino(sc.nextLine());
	
		
		String sql = "INSERT INTO Agenciaviagem(nome, endereco , destino )VALUES(?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = Conexaobanco.createConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1,nome.getNome());
			pstm.setString(2, nome.getEndereco());
			pstm.setString(3,nome.getDestino());
			
		
		pstm.execute();
		System.out.println("Cadastro realizado com sucesso!!");
		conn.close();
		pstm.close();
		
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
	
		}
		
	}
	public void update() {
		Scanner sc = new Scanner(System.in);
		Agencia nome = new Agencia(); 
		
		System.out.println("Digite o id da pessoa");
		nome.setId(sc.nextInt());
		System.out.println("Digite seu Nome");
		nome.setNome(sc.nextLine());
		System.out.println("Digite seu Endereco");
		nome.setEndereco(sc.nextLine());
		System.out.println("Digite seu Destino");
		nome.setDestino(sc.nextLine());
		
		String sql ="UPDATE Agenciaviagem set Nome = ?, Endereco = ?, Destino = ? where id = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = Conexaobanco.createConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1,nome.getNome());
			pstm.setString(2, nome.getEndereco());
			pstm.setString(3, nome.getDestino());
			pstm.setInt(4, nome.getId());
		
		
			pstm.execute();
			
			System.out.println("Atualizaçao  com sucesso!!");
			conn.close();
			pstm.close();
		
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		
	}
}
