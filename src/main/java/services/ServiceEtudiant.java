package services;

import entities.etudiant;
import entities.user;
import utils.MyDB;

import java.sql.*;

import java.util.List;

public class ServiceEtudiant implements IService<etudiant> {
    private Connection connection;

    public ServiceEtudiant() {

        connection = MyDB.getInstance().getConnection();
    }

    @Override
    public void ajouter(etudiant etudiant) throws SQLException {
        // Préparer la requête rank
        String sql = "INSERT INTO etudiant (ide, rank, score,cv) VALUES (?, ?, ?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        // Définir les valeurs des paramètres
        statement.setInt(1, etudiant.getIde());

        statement.setString(2, etudiant.getRank());
        statement.setInt(3, etudiant.getScore());
        statement.setBytes(4, etudiant.getCv());


        // Exécuter la requête
        statement.executeUpdate();

    }

    @Override
    public void modifier(etudiant etudiant) throws SQLException {

    }

    @Override
    public void supprimer(etudiant etudiant) throws SQLException {
       /* String req = "delete from user where ide=?";
        PreparedStatement pre = connection.prepareStatement(req);
        pre.setInt(1, etudiant.getIde());
        pre.executeUpdate();*/

    }

    @Override
    public List<etudiant> afficher() throws SQLException {
        return null;
    }


}
