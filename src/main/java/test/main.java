package test;

import entity.formation;
import services.serviceformation;

import java.sql.SQLException;

public class main {
    public static void main(String[] args)
    {
       // MyDB db1=new MyDB();
       // MyDB db2=new MyDB();

        formation f1=new formation(2,"javascript","xxxxx","30jour","3eme","12janvier","2000DT","javascript");
        formation f2=new formation(3,"c++ Master","wwwwwwww","30jour","3eme","30janvier","1500DT","c++");
        formation f3=new formation(4," senior data scientist","zzzzzzz","30jour","3eme","30avril","3000DT","python");

        serviceformation services = new serviceformation();

        //ajouter
       try {
           services.ajouter(f3);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
       }


        // modification
        try {
            services.modifier(f2);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //supprimer

        try {
            services.supprimer(f1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Affichage

        try {
            System.out.println(services.afficher());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
    }

