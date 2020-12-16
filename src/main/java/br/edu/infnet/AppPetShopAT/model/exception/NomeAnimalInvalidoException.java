package br.edu.infnet.AppPetShopAT.model.exception;

public class NomeAnimalInvalidoException extends Exception{
    public NomeAnimalInvalidoException(String mensagem){
        super(mensagem);
    }
}
