package entity;


public class formation {
    int ID_de_Formation;
    String Nom_de_Formation,Description,Durée,Niveau,Date_Fin,Coût,Langue ;

    public int getID_de_Formation() {
        return ID_de_Formation;
    }

    public void setID_de_Formation(int ID_de_Formation) {
        this.ID_de_Formation = ID_de_Formation;
    }

    public String getNom_de_Formation() {
        return Nom_de_Formation;
    }

    public void setNom_de_Formation(String nom_de_Formation) {
        Nom_de_Formation = nom_de_Formation;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDurée() {
        return Durée;
    }

    public void setDurée(String durée) {
        Durée = durée;
    }

    public String getNiveau() {
        return Niveau;
    }

    public void setNiveau(String niveau) {
        Niveau = niveau;
    }

    public String getDate_Fin() {
        return Date_Fin;
    }

    public void setDate_Fin(String date_Fin) {
        Date_Fin = date_Fin;
    }

    public String getCoût() {
        return Coût;
    }

    public void setCoût(String coût) {
        Coût = coût;
    }

    public String getLangue() {
        return Langue;
    }

    public void setLangue(String langue) {
        Langue = langue;
    }

    @Override
    public String toString() {
        return "formation{" +
                "ID_de_Formation=" + ID_de_Formation +
                ", Nom_de_Formation='" + Nom_de_Formation + '\'' +
                ", Description='" + Description + '\'' +
                ", Durée='" + Durée + '\'' +
                ", Niveau='" + Niveau + '\'' +
                ", Date_Fin='" + Date_Fin + '\'' +
                ", Coût='" + Coût + '\'' +
                ", Langue='" + Langue + '\'' +
                '}';
    }

    public formation() {
    }

    public formation(int ID_de_Formation, String nom_de_Formation, String description, String durée, String niveau, String date_Fin, String coût, String langue) {
        this.ID_de_Formation = ID_de_Formation;
        Nom_de_Formation = nom_de_Formation;
        Description = description;
        Durée = durée;
        Niveau = niveau;
        Date_Fin = date_Fin;
        Coût = coût;
        Langue = langue;
    }

    public formation(String nom_de_Formation, String description, String durée, String niveau, String date_Fin, String coût, String langue) {
        Nom_de_Formation = nom_de_Formation;
        Description = description;
        Durée = durée;
        Niveau = niveau;
        Date_Fin = date_Fin;
        Coût = coût;
        Langue = langue;
    }
}