package mj.java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="receipes_master")
public class Receipe {
	private Long id;
    private String name;
    private String type;
    private String ingredients;
    private String receipe_detail;

    protected Receipe() {
    }

    public Receipe(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getReceipe_detail() {
        return receipe_detail;
    }

    public void setReceipe_detail(String receipedetail) {
        this.receipe_detail = receipedetail;
    }


    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipe receipe = (Receipe) o;
        return id.equals(receipe.id) && Objects.equals(name, receipe.name) && Objects.equals(type, receipe.type) && Objects.equals(ingredients, receipe.ingredients) && Objects.equals(receipedetail, receipe.receipedetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, ingredients, receipedetail);
    }

    @Override
    public String toString() {
        return "Receipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", receipedetail='" + receipedetail + '\'' +
                '}';
    }*/
}
