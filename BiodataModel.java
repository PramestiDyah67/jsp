package com.model.mahasiswa;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BiodataModel {
	Connection con;
	Statement st;
	ResultSet rs;
	Biodata biodata;
	ArrayList<Biodata> biodatas = new ArrayList<>();
	
	public BiodataModel() {
		try {
			/*Class.forName("com.mysql.jdbc.Driver");
			con=(Connection)
			DriverManager.getConnection("jdbc:mysql://localhost:3306/mhs");
			*/
			String url ="jdbc:mysql://localhost:3306/mhs?user=root&password=\"";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection(url,user,pass);//koneksi ke database
            st = (Statement) con.createStatement();//statement untuk eksekusi query
            System.out.println("koneksi berhasil;");
				Class.forName("com.mysql.jdbc.Driver");
				 con =(Connection) DriverManager.getConnection(url,user,pass);
				 st = (Statement) con.createStatement();
				 System.out.println("koneksi berhasil;");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("koneksi gagal" +e.getMessage());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Biodata> getData(){
		try {
			st=(Statement) con.createStatement();
			rs=((java.sql.Statement) st).executeQuery("SELECT * FROM biodata");
			while(rs.next()) {
				biodata = new Biodata();
				biodata.setNim(rs.getString(1));
				biodata.setNama(rs.getString(2));
				biodata.setJk(rs.getString(3));
				biodata.setTmpLahir(rs.getString(4));
				biodata.setTglLahir(rs.getString(5));
				biodata.setAlamat(rs.getString(6));
				biodatas.add(biodata);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return biodatas;	
	}
}
