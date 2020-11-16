package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Tecnico implements Serializable {

    private Integer id;
    private String name;
    private String email;
    private Integer telefone;

    public Tecnico() {
    }

    public Tecnico(Integer id, String name, String email, Integer telefone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tecnico tecnico = (Tecnico) o;
        return Objects.equals(id, tecnico.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
