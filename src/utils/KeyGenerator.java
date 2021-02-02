package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.ConnectionToMySQL;

public class KeyGenerator {

	public String GenerateKey() {
		Integer key = 0;
		String db_id = getCurrentDB_ID()[0];
		String sclock = getCurrentDB_ID()[1];
		
		if (db_id == null) {
			//First use of the database, thus generate a db_id and set the clock
			long rnum = System.nanoTime();
			String srnum = rnum + "";
			srnum = srnum.substring(0, 4);
			try {
				ConnectionToMySQL connect = new ConnectionToMySQL();
				Connection connection = connect.connectToDatabase();
				PreparedStatement preparedStatement = connection
						.prepareStatement("insert into globals (db_id, logical_clock) values (?,?)");
				preparedStatement.setString(1, srnum);
				preparedStatement.setInt(2, 0);
				preparedStatement.executeUpdate();
				
				return srnum;
				
			}catch (Exception e) {
				e.printStackTrace();
			}	
		}
		else {
			//Generate the key using db_id and the clock of the system

			Integer incrementedClock = (Integer.parseInt(sclock) + 1);
			try {
				ConnectionToMySQL connect = new ConnectionToMySQL();
				Connection connection = connect.connectToDatabase();
				PreparedStatement preparedStatement = connection
						.prepareStatement("delete from globals; insert into globals (db_id, logical_clock) values (?,?)");
				preparedStatement.setString(1, db_id);
				preparedStatement.setInt(2, incrementedClock);
				preparedStatement.executeUpdate();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			incrementedClock*=10000;
			key = Integer.parseInt(db_id) + incrementedClock;
			return key + "";
			
		}
		
		return null;
	}
	
	private String[] getCurrentDB_ID() {
		String key = null;
		String clock = null;
		try {
			ResultSet result = null ;
			ConnectionToMySQL connect = new ConnectionToMySQL();
			Connection connection = connect.connectToDatabase();
			PreparedStatement preparedStatement = connection
					.prepareStatement("SELECT * FROM genorobotics.globals");
			result = preparedStatement.executeQuery();
			while(result.next()) {
			 key = result.getString(1);
			 clock = result.getString(2);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new String[]{key, clock};
	}
}
