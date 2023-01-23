package Classes;

import Enum.EstadoAnimal;
import Enum.Porte;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class  Animal{

    private String nome;
    private LocalDate nascimento;
    private String raca;
    private Porte porte;
    private Double peso;
    public static EstadoAnimal estadoAnimal;
    List<EsquemaVacinal> vacinas = new ArrayList<EsquemaVacinal>();
    public String observacoes;


    public Animal(String nome, LocalDate nascimento, String raca, Porte porte, Double peso, String observacoes, EstadoAnimal estadoAnimal, List<EsquemaVacinal> vacinas) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.raca = raca;
        this.porte = porte;
        this.peso = peso;
        this.observacoes = observacoes;
        this.estadoAnimal = estadoAnimal;
        this.vacinas = vacinas;
    }

    public Animal() {

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public EstadoAnimal getEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(EstadoAnimal estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    public List<EsquemaVacinal> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<EsquemaVacinal> vacinas) {
        this.vacinas = vacinas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome= " + nome +'\'' +
                ", nascimento= " + nascimento +
                ", raca= " + raca + '\'' +
                ", porte= " + porte +
                ", peso(Kg)= " + peso +
                ", observacoes= " +  observacoes + '\'' +
                ", estadoAnimal= " + estadoAnimal +
                ", vacinas= " + vacinas +
                '}';
    }
}
