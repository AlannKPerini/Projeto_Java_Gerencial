/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CONEXAO_BANCO.Banco_Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alann Kelly
 */
public class LoginDao {
        Banco_Dados bd = new Banco_Dados();
    
    public boolean acessoLogin(String nome, String senha, String idtipo) {

        if (bd.getConnection()) {
            boolean check = false;
            try {
                String sql = "select * from funcionario where login=? and senha=? and idtipo = ?";
                PreparedStatement pst = bd.connection.prepareStatement(sql);
                ResultSet rs;
                pst.setString(1, nome);
                pst.setString(2, senha);
                pst.setString(3, idtipo);
                rs = pst.executeQuery();
             
                if (rs.next()) { 
                   
                     check = true;  
                 
                }  
           } catch (SQLException e) {  

                e.printStackTrace();  
           }  
           return check;  
        }
   
 }
