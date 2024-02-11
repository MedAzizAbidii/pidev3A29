package services;
import entity.formation;
import util.MyDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class serviceformation implements iservice<formation> {
    private Connection connection;

    public serviceformation() {
        connection = MyDB.getInstance().getConnection();
    }

    @Override
    public void ajouter(formation formation) throws SQLException {
        String req = "insert into formation (Nom_de_Formation,Description,Durée,Niveau,Date_Fin,Coût,Langue)" + "values('" + formation.getNom_de_Formation() + "','" + formation.getDescription() + "','" + formation.getDurée() + "','" + formation.getNiveau() + "','" + formation.getDate_Fin() + "','" + formation.getCoût() + "','" + formation.getLangue() + "')";
        Statement ste = connection.createStatement();
        ste.executeUpdate(req);

    }

    @Override
    public void modifier(formation formation) throws SQLException {
        String req = "update formation set Nom_de_Formation=? , Description=?, Durée=?, Niveau=?,  Coût=?, Langue=? where ID_de_Formation=?";
        PreparedStatement pre = connection.prepareStatement(req);
        pre.setString(1, formation.getNom_de_Formation());

        pre.setString(2, formation.getDescription());
        pre.setString(3, formation.getDurée());
        pre.setString(4, formation.getNiveau());
        pre.setString(5, formation.getCoût());
        pre.setString(6, formation.getLangue());
        pre.setInt(7, formation.getID_de_Formation());
        pre.executeUpdate();
    }

    @Override
    public void supprimer(formation formation) throws SQLException {
        String req = "delete from formation where ID_de_Formation=?";
        PreparedStatement pre = connection.prepareStatement(req);
        pre.setInt(1, formation.getID_de_Formation());
        pre.executeUpdate();

    }

    public List<formation> afficher() throws SQLException {

        String req = "select * from formation ";
        Statement ste = connection.createStatement();
        ResultSet res = ste.executeQuery(req);
        List<formation> list = new ArrayList<>();
        while (res.next()) {
            formation p = new formation();
            p.setID_de_Formation(res.getInt(1));
            p.setNom_de_Formation(res.getString(2 ));

            p.setDescription(res.getString(3));

            p.setDurée(res.getString("Durée"));
            p.setNiveau(res.getString("Niveau"));

            p.setCoût(res.getString("Coût"));

            p.setLangue(res.getString("Langue"));

            list.add(p);
        }
        return list;

    }

}