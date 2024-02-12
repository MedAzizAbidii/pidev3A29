package entities;


import java.util.Arrays;

public class etudiant {
    int ide;
    String rank;
    int score ;
    byte[] cv  ;

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public byte[] getCv() {
        return cv;
    }

    public void setCv(byte[] cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "etudiant{" +
                "ide=" + ide +
                ", rank='" + rank + '\'' +
                ", score=" + score +
                ", cv=" + Arrays.toString(cv) +
                '}';
    }

    public etudiant(int ide, String rank, int score, byte[] cv) {
        this.ide = ide;
        this.rank = rank;
        this.score = score;
        this.cv = cv;
    }

    public etudiant(String rank, int score, byte[] cv) {
        this.rank = rank;
        this.score = score;
        this.cv = cv;
    }
}


