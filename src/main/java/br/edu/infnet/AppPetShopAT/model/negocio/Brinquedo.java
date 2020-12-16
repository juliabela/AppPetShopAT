package br.edu.infnet.AppPetShopAT.model.negocio;

import br.edu.infnet.AppPetShopAT.model.exception.MarcaInvalidaException;
import br.edu.infnet.AppPetShopAT.model.exception.MaterialInvalidoException;
import br.edu.infnet.AppPetShopAT.model.exception.ModeloInvalidoException;

public class Brinquedo extends Produto {


    private String modelo;
    private String material;
    private String marca;
    private boolean marcaPromo;


    public Brinquedo(String nome, String desc,boolean producaoPropria, int qtd, float valor) {
        super(nome, desc,producaoPropria, qtd, valor);
    }

    //Definir preço especial para produção propria
    @Override
    public float calcularValorVenda() {

        if("casa".equalsIgnoreCase(this.getMarca())){
            marcaPromo = true;
        }

        return getValor() + (this.isProducaoPropria()? 2:6) + (this.isMarcaPromo() ? -1 : 0);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(";");
        sb.append(this.getModelo());
        sb.append(";");
        sb.append(this.getMaterial());
        sb.append(";");
        sb.append(this.getMarca());

        return sb.toString();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) throws ModeloInvalidoException {
        if (modelo == null){
            throw new ModeloInvalidoException("Modelo invalido");
        }
        this.modelo = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) throws MaterialInvalidoException {
        if (material == null){
            throw new MaterialInvalidoException("Material Invalido");
        }
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws MarcaInvalidaException {
        if (marca == null){
            throw new MarcaInvalidaException("Marca Invalida");
        }
        this.marca = marca;
    }

    public boolean isMarcaPromo() {
        return marcaPromo;
    }

    public void setMarcaPromo(boolean marcaPromo) {
        this.marcaPromo = marcaPromo;
    }
}

