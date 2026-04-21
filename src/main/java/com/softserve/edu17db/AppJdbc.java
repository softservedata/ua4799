package com.softserve.edu17db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppJdbc {

    public static void main(String[] args) throws SQLException {
        System.out.println("Start...");
        //
        Connection con = null;
        String username = "pmp2026";
        String password = "Pmp#2026";
       //String url = "jdbc:mysql://localhost:3306/su_dev_2?useUnicode=true&characterEncoding=UTF-8";
        //String url = "jdbc:mysql://localhost:3306/su_dev_2?enabledTLSProtocols=TLSv1.2";
        //String url = "jdbc:mysql://localhost:3306/su_dev_2?useUnicode=true&characterEncoding=UTF-8";
        //String url = "jdbc:mysql://localhost:3306/su_dev_2?useSSL=false&serverTimezone=UTC&autoReconnect=true";
        //String url = "jdbc:mysql://127.0.0.1:23306/su_dev_2?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
        //
        String url = "jdbc:mysql://192.168.6.137:3306/";
        //String url = "jdbc:mysql://192.168.6.137:3306/test12";
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        System.out.println("Connect...");
        con = DriverManager.getConnection(url, username, password);
        if (con != null) {
            System.out.println("Connection Successful! \n");
        } else {
            System.out.println("Connection ERROR \n");
            System.exit(1);
        }
        Statement st = con.createStatement();
        //st.execute("CREATE DATABASE test12;");
        st.execute("use test12;");
        /*
        String query = "CREATE TABLE temp"
                + "( id integer NOT NULL,"
                + "name character varying(255),"
                + "login character varying(255),"
                + "password character varying(255),"
                + "age integer,"
                + "CONSTRAINT id_key PRIMARY KEY (id),"
                + "CONSTRAINT uniq UNIQUE (id));";
        */
        //String query = "INSERT INTO temp (id,name,login,password,age) VALUES (1,'Petro','pet','123456',22);";
        String query = "INSERT INTO temp (id,name,login,password,age) VALUES (2,'Ivan','iva','123456',23);";
        st.execute(query);
        //
        if (st != null) {
            st.close();
        }
        if (con != null) {
            con.close();
        }
        System.out.println("DONE");
    }
}           