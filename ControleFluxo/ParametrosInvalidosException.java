package ControleFluxo;

public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException() {
        super("Os parâmetros são inválidos");
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}