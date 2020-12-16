package br.edu.infnet.AppPetShopAT.model.negocio;

public class Animal {

    private String nomeDoAnimal;
    private String raca;
    private String nomeDoResponsavel;
    private String telContato;

    public Animal(String nomeDoAnimal, String raca, String nomeDoResponsavel, String telContato){
        this.nomeDoAnimal = nomeDoAnimal;
        this.raca = raca;
        this.nomeDoResponsavel = nomeDoResponsavel;
        this.telContato = telContato;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNomeDoAnimal());
        sb.append(";");
        sb.append(this.getRaca());
        sb.append(";");
        sb.append(this.getNomeDoResponsavel());
        sb.append(";");
        sb.append(this.getTelContato());
        return sb.toString();
    }

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNomeDoResponsavel() {
        return nomeDoResponsavel;
    }

    public void setNomeDoResponsavel(String nomeDoResponsavel) {
        this.nomeDoResponsavel = nomeDoResponsavel;
    }

    public String getTelContato() {
        return telContato;
    }

    public void setTelContato(String telContato) {
        this.telContato = telContato;
    }
}
