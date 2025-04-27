/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.servixos.dao;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
//import java.sql.Connection;

/**
 *
 * @author Smaug
 */
public class ModuloConexao {

    // Método responsavel por estabelecer a conexão com o banco
    public static java.sql.Connection connector() {
        java.sql.Connection conexao = null;
        // Chama o driver
        String driver = "com.mysql.jdbc.Driver";
        // Armazena informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbservixos";
        String user = "root";
        String password = "";
        // Estabelecendo a conexão
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

}
