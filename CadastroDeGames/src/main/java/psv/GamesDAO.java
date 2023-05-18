/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

/**
 *
 * @author CAMARGO
 */
public class GamesDAO {
    
    private Connection con;
    public GamesDAO(Connection con){
        setCon(con);
    }
    public Connection getCon(){
        return con;
    }
    public void setCon(Connection con){
        this.con = con;
    }
    
    public String inserir(GamesBean Games){
        String sql = 
                "insert into Games(nome, sobrenome, email, senha, anoNascimento, nomeJogo, personagem, posicao, empresaPreferida, compra, veVideos, tipoJogo) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, Games.getNome());
            ps.setString(2, Games.getSobrenome());
            ps.setString(3, Games.getEmail());
            ps.setString(4, Games.getSenha());
            ps.setString(5, Games.getAnoNascimento());
            ps.setString(6, Games.getNomeJogo());
            ps.setString(7, Games.getPersonagem());
            ps.setString(8, Games.getPosicao());
            ps.setString(9, Games.getEmpresaPreferida());
            ps.setString(10, Games.getCompra());
            ps.setString(12, Games.getVeVideos());
            ps.setString(13, Games.getTipoJogo());
            
            if(ps.executeUpdate() > 0){
                return "Inserido com sucesso";
            }else{
                return "erro ao inserir";
            }
        
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    
    public String alterar(GamesBean carro){
        String sql = "update carro set cor = ?, descricao = ?, ano = ?";
        sql += " where placa = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, Games.getNome());
            ps.setString(2, Games.getSobrenome());
            ps.setString(3, Games.getEmail());
            ps.setString(4, Games.getSenha());
            ps.setString(5, Games.getAnoNascimento());
            ps.setString(6, Games.getNomeJogo());
            ps.setString(7, Games.getPersonagem());
            ps.setString(8, Games.getPosicao());
            ps.setString(9, Games.getEmpresaPreferida());
            ps.setString(10, Games.getCompra());
            ps.setString(11, Games.getVeVideos());
            ps.setString(12, Games.getTipoJogo());

            
            if(ps.executeUpdate() > 0){
                return "Alterado com sucesso";
            }else{
                return "Erro ao alterar";
            }
            
        }catch(SQLException e){
            return e.getMessage();
        }
        
    }
    
    public String excluir(GamesBean carro){
        String sql = "delete carro where placa = ? ";

        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, Games.getNome());
            ps.setString(2, Games.getSobrenome());
            ps.setString(3, Games.getEmail());
            ps.setString(4, Games.getSenha());
            ps.setString(5, Games.getAnoNascimento());
            ps.setString(6, Games.getNomeJogo());
            ps.setString(7, Games.getPersonagem());
            ps.setString(8, Games.getPosicao());
            ps.setString(9, Games.getEmpresaPreferida());
            ps.setString(10, Games.getCompra());
            ps.setString(11, Games.getVeVideos());
            ps.setString(12, Games.getTipoJogo());

            
            
            if(ps.executeUpdate() > 0){
                return "Excluido com sucesso";
            }else{
                return "Erro ao excluir";
            }
            
        }catch(SQLException e){
            return e.getMessage();
        }
        
    }
    
    public List<GamesBean> listarTodos(){
        String sql = "select * from carro ";
        
        List<GamesBean> listaGames = new ArrayList<>();
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    GamesBean cb = new GamesBean();
                    cb.setNome(rs.getString(1));
                    cb.setSobrenome(rs.getString(2));
                    cb.setEmail(rs.getString(3));
                    cb.setSenha(rs.getString(4));
                    cb.setAnoNascimento(rs.getString(5));
                    cb.setNomeJogo(rs.getString(6));
                    cb.setPersonagem(rs.getString(7));
                    cb.setPosicao(rs.getString(8));
                    cb.setEmpresaPreferida(rs.getString(9));
                    cb.setCompra(rs.getString(10));
                    cb.setVeVideos(rs.getString(11));
                    cb.setTipoJogo(rs.getString(12));
                    
                    
                    listaGames.add(cb);
                }
                
                return listaGames;
            }else{
                return null;
            }
            
        }catch(SQLException e){
            return null;
        }
        
    }
    
}
