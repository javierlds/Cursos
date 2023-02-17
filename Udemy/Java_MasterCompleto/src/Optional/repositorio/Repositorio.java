package Optional.repositorio;

import Optional.Computador;

public interface Repositorio <T>{
    Computador filtrar(String nombre);

}
