package br.edu.infnet.AppPetShopAT.model.negocio;

import br.edu.infnet.AppPetShopAT.model.exception.NomeAnimalInvalidoException;
import br.edu.infnet.AppPetShopAT.model.exception.NomeResponsavelInvalidoException;
import br.edu.infnet.AppPetShopAT.model.exception.RacaInvalidaException;
import br.edu.infnet.AppPetShopAT.model.exception.TelContatoInvalidoException;
import org.springframework.boot.env.RandomValuePropertySource;

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


    public String getRaca() {
        return raca;
    }

    public String getNomeDoResponsavel() {
        return nomeDoResponsavel;
    }

    public String getTelContato() {
        return telContato;
    }

}
