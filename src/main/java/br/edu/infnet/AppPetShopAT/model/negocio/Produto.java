package br.edu.infnet.AppPetShopAT.model.negocio;

public abstract class Produto {
    private String nome;
    private String desc;
    private boolean producaoPropria;
    private int qtd;
    private float valor;

    public Produto(String nome, String desc, boolean producaoPropria, int qtd, float valor){
        this.nome = nome;
        this.desc = desc;
        this.producaoPropria = producaoPropria;
        this.qtd = qtd;
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNome());
        sb.append(";");
        sb.append(this.getDesc());
        sb.append(";");
        sb.append(this.isProducaoPropria());
        sb.append(";");
        sb.append(this.getQtd());
        sb.append(";");
        sb.append(this.getValor());
        return sb.toString();
    }

    public abstract float calcularValorVenda();


    public String getNome() {
        return nome;
    }


    public String getDesc() {
        return desc;
    }


    public int getQtd() {
        return qtd;
    }


    public float getValor() {
        return valor;
    }


    public boolean isProducaoPropria() {
        return producaoPropria;
    }

}
