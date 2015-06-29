/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo2.fabricanavio.DAO;

import br.edu.ifes.poo2.calculadora.naviobridge.Rota;
import br.edu.ifes.poo2.calculadora.naviobridge.Ship;
import br.edu.ifes.poo2.calculadora.naviobridge.Tipos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class RotaDAO extends DAOGeneric implements DAO<Rota>{
    
    public Rota create() {
		
		return new Rota();
	}
	//CRIANDO A TABELA USUARIO
	public void criarTabela() throws ClassNotFoundException, SQLException
	{
		this.openConnection();
		
		this.execute("DROP TABLE Rota");
		
		String sql = "CREATE TABLE Rota " +
					 " (ID INTEGER GENERATED BY DEFAULT AS IDENTITY "+
                     " (START WITH 1, INCREMENT BY 1) NOT NULL," +
					 " cidade1 varchar(255) NOT NULL," +
					 " cidade2 varchar(255) NOT NULL," +
                                         " distancia varchar(255) NOT NULL," +
                                         " idPorto varchar(255) NOT NULL," +
                                         " rota varchar(255) NOT NULL," +
					 " PRIMARY KEY (ID) )";
		
		this.execute(sql);
		
		this.closeConnection();
	}

            public void insert(Rota obj) throws SQLException, ClassNotFoundException {
		
		this.openConnection();
		
		String sql = "INSERT INTO USUARIO (cidade1, cidade2, distancia, idPorto, rota) VALUES ('"+obj.getCidade1()+"','"+obj.getCidade2()+"','"+obj.getDistancia()+"','"+obj.getPortos()+"','"+obj.getRota()+"')"; 
		
		int id = this.executeUpdate(sql);
		
		
		
		this.closeConnection();
		
	}

	public void update(Rota obj) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Rota obj) {
		// TODO Auto-generated method stub
		
	}

	public Rota findbyID(Long id) throws ClassNotFoundException, SQLException {
		//Query para buscar o usuario
		this.openConnection();
		
		String sql = "SELECT * FROM USUARIO WHERE ID ="+id;
		
		ResultSet rs = this.executeQuery(sql);
		
		List<Rota> usuarios = retriveUsuarios(rs);
		
		this.closeConnection();
		
		return usuarios.get(0);
	}
	public List<Rota> findAll() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.openConnection();
		
		String sql = "SELECT * FROM NAVIO ";
		
		ResultSet rs = this.executeQuery(sql);
		
		List<Rota> usuarios = retriveUsuarios(rs);
		
		this.closeConnection();
		
		return usuarios;
	}
	
	private List<Rota> retriveUsuarios(ResultSet rs) throws SQLException
	{
		List<Rota> usuarios = new ArrayList<Rota>();
		
		while (rs.next())
		{
			Ship navio = new Ship();
			
			navio.setPessoas(rs.getInt("qtdPessoas"));
			
			navio.setCarga( Integer.parseInt(rs.getString("qtdCarga")));
                        String tipo = rs.getString("tipo");
                        if (tipo.equals("Escuna"))
			navio.setTipo(Tipos.ESCUNA);
                        if (tipo.equals("Carga"))
			navio.setTipo(Tipos.CARGA);
                        if (tipo.equals("Cruzeiro"))
			navio.setTipo(Tipos.CRUZEIRO);
                        if (tipo.equals("Graneleiro"))
			navio.setTipo(Tipos.GRANELEIRO);
			
			//usuarios.add(navio);
		}
		
		return usuarios;
	}
	

    
}
