package br.edu.infnet.AppPetShopAT.model.negocio;

import java.time.LocalDateTime;

public class Venda {
    private LocalDateTime data;
    private Produto produto;
    private Animal animal;

    public Venda(){
        this.data = LocalDateTime.now();

    }

    @Override
    public String toString() {


        return String.format("%s",this.data,"%s",this.produto.toString(), "%s", this.animal.toString());
    }

    public LocalDateTime getData() {
        return data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
