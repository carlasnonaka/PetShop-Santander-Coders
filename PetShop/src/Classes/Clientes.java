package Classes;

import java.util.ArrayList;
import java.util.List;

public class Clientes  extends Pessoa {

    private int id;
    public List<Animal> pets = new ArrayList<Animal>();

    public Clientes(String nome, String cpf, String email, Endereco endereco, String telefone, int id, List<Animal> pets) {
        super(nome, cpf, email, endereco, telefone);
        this.id = id;
        this.pets = pets;
    }
    public Clientes() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Animal> getPets() {
        return pets;
    }

    public void setPets(List<Animal> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        super.toString();
        return "Clientes {nome= " + getNome() +
                " id= " + id +
                ", pets= " + pets +
                '}';
    }

}