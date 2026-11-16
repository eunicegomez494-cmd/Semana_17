package Ejercicios.Uped;

public class SocioNoEncontradoException extends Exception {
    public SocioNoEncontradoException(int id) {
        super("No existe el socio " + id);
    }
}