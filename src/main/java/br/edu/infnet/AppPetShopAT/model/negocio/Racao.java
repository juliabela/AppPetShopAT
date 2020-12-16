package br.edu.infnet.AppPetShopAT.model.negocio;

import br.edu.infnet.AppPetShopAT.model.exception.MarcaInvalidaException;
import br.edu.infnet.AppPetShopAT.model.exception.PesoInvalidoException;
import br.edu.infnet.AppPetShopAT.model.exception.SaborInvalidoException;
import br.edu.infnet.AppPetShopAT.model.exception.TipoInvalidoException;

public class Racao extends Produto {

    private float peso;
    private String sabor;
    private String tipo;
    private String marca;


    public Racao(String nome, String desc,boolean producaoPropria, int qtd, float valor) {
        super(nome, desc,producaoPropria, qtd, valor);
    }

    @Override
    public float calcularValorVenda() {

        return this.getValor() + (this.isProducaoPropria() ? 2 : 0) + this.getPeso() * 0.5f;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(this.getPeso());
        sb.append(";");
        sb.append(this.getSabor());
        sb.append(";");
        sb.append(this.getTipo());
        sb.append(";");
        sb.append(this.getMarca());

        return sb.toString();
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws PesoInvalidoException{

        if (peso <= 0){
            throw new PesoInvalidoException("Medida Invalida");
        }
        this.peso = peso;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) throws SaborInvalidoException{

        if (sabor == null){
            throw new SaborInvalidoException("Sabor Invalido");
        }

        this.sabor = sabor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws TipoInvalidoException {
        if (tipo == null){
            throw new TipoInvalidoException("Tipo invalido");
        }
        this.tipo = tipo;
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
