package br.edu.infnet.AppPetShopAT.model.negocio;

import java.time.LocalDateTime;

public class Venda {
    private LocalDateTime data;
    private int CodProduto;
    private String proprietarioAnimal;

    public Venda(){
        this.data = LocalDateTime.now();

    }

    @Override
    public String toString() {

        return String.format("%s",this.getData(),";%x",this.getCodProduto(), ";%s", this.getProprietarioAnimal());
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getCodProduto() {
        return CodProduto;
    }

    public void setCodProduto(int codProduto) {
        CodProduto = codProduto;
    }

    public String getProprietarioAnimal() {
        return proprietarioAnimal;
    }

    public void setProprietarioAnimal(String proprietarioAnimal) {
        this.proprietarioAnimal = proprietarioAnimal;
    }
}
