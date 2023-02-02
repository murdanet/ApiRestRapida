package apira.entidats;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Projecte {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    public Projecte() {
    }

    public Projecte(String nom, String estat) {
        this.nom = nom;
        this.estat = estat;
    }

    private String nom;
    private String estat;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEstat() {
        return estat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projecte projecte = (Projecte) o;
        return id == projecte.id && Objects.equals(nom, projecte.nom) && Objects.equals(estat, projecte.estat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, estat);
    }

    @Override
    public String toString() {
        return "Projecte{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", estat='" + estat + '\'' +
                '}';
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }
}
