package services;

import entities.user;
import utils.MyDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceUser implements IService<user> {

    private Connection connection;

    public ServiceUser() {

        connection = MyDB.getInstance().getConnection();
    }

    @Override
    public void ajouter(user user) throws SQLException {
        String req = "insert into user (nom,prenom,email,mdp,tel)" +
                "values('" + user.getNom() + "','" + user.getPrenom() + "','" + user.getEmail() + "','" + user.getMdp() + "'," + user.getTel() + ")";
        Statement ste = connection.createStatement();
        ste.executeUpdate(req);
    }

    @Override
    public void modifier(user user) throws SQLException {
        String req = "update user set nom=?,prenom=?,email=?,mdp=?,tel=? where id=?";
        PreparedStatement pre = connection.prepareStatement(req);
        pre.setString(1, user.getNom());
        pre.setString(2, user.getPrenom());
        pre.setString(3, user.getEmail());
        pre.setString(4, user.getMdp());
        pre.setString(5, user.getTel());
        pre.setInt(6, user.getId());
        pre.executeUpdate();
    }

    @Override
    public void supprimer(user user) throws SQLException {
        String req = "delete from user where id=?";
        PreparedStatement pre = connection.prepareStatement(req);
        pre.setInt(1, user.getId());
        pre.executeUpdate();
    }

    @Override
    public List<user> afficher() throws SQLException {
        String req = "select * from user";
        Statement ste = connection.createStatement();
        ResultSet res = ste.executeQuery(req);
        List<user> list = new ArrayList<>();
        while (res.next()) {
            user u = new user();
            u.setId(res.getInt(1));
            u.setNom(res.getString("nom"));
            u.setPrenom(res.getString(3));
            u.setEmail(res.getString(4));
            u.setMdp(res.getString(5));
            u.setTel(res.getString(6));
            list.add(u);
        }

            return list;}


}
