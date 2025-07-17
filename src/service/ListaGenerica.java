package service;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica<T> {
    private List<T> lista = new ArrayList<>();

    public void adicionar(T item) {
        lista.add(item);
    }

    public List<T> listar() {
        return lista;
    }
}
