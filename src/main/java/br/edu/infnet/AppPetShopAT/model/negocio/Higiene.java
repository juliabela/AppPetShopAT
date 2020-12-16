package br.edu.infnet.AppPetShopAT.model.negocio;

import br.edu.infnet.AppPetShopAT.model.exception.IdadeRecomendadaInvalidaException;
import br.edu.infnet.AppPetShopAT.model.exception.MarcaInvalidaException;

public class Higiene extends Produto {

    private String idaderecomendada;
    private String marca;

    public Higiene(String nome, String desc, boolean producaoPropria, int qtd, float valor) {
        super(nome, desc, producaoPropria, qtd, valor);
    }


    //Definir preço especial para produção propria
    @Override
    public float calcularValorVenda() {
        return getValor() + (this.isProducaoPropria()? 0:3);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(";");
        sb.append(this.getIdaderecomendada());
        sb.append(";");
        sb.append(this.getMarca());

        return sb.toString();
    }

    public String getIdaderecomendada() {
        return idaderecomendada;
    }

    public void setIdaderecomendada(String idaderecomendada) throws IdadeRecomendadaInvalidaException {
        if (idaderecomendada == null){
            throw new IdadeRecomendadaInvalidaException("Idade recomendada Invalida");
        }
        this.idaderecomendada = idaderecomendada;
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
