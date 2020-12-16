package br.edu.infnet.AppPetShopAT.model.negocio;

import br.edu.infnet.AppPetShopAT.model.exception.IdadeRecomendadaInvalidaException;
import br.edu.infnet.AppPetShopAT.model.exception.MarcaInvalidaException;

public class Higiene extends Produto {

    private boolean filhote;
    private String marca;

    public Higiene(String nome, String desc, boolean producaoPropria, int qtd, float valor) {
        super(nome, desc, producaoPropria, qtd, valor);
    }


    //Definir preço especial para produção propria
    @Override
    public float calcularValorVenda() {
        return getValor() + (this.isProducaoPropria()? 0:3) + (this.isFilhote() ? 2 : 0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(";");
        sb.append(this.isFilhote());
        sb.append(";");
        sb.append(this.getMarca());

        return sb.toString();
    }

    public boolean isFilhote() {
        return filhote;
    }

    public void setFilhote(boolean filhote) {
        this.filhote = filhote;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws MarcaInvalidaException {
        if (marca == null){
            throw new MarcaInvalidaException("Marca invalida");
        }
        this.marca = marca;
    }
}
