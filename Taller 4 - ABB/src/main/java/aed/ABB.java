package aed;

import java.util.*;

// Todos los tipos de datos "Comparables" tienen el método compareTo()
// elem1.compareTo(elem2) devuelve un entero. Si es mayor a 0, entonces elem1 > elem2
public class ABB<T extends Comparable<T>> {
    private Nodo raiz;
    private int cardinal;
    private Nodo nodoActual;

    // Agregar atributos privados del Conjunto

    private class Nodo {
        private T valor;
        private Nodo izq;
        private Nodo der;
        private Nodo padre;

        // Crear Constructor del nodo
        Nodo(T v) {
            valor = v;
            izq = null;
            der = null;
            padre = null;
        }
    }

    public ABB() {
        raiz = null;
        cardinal = 0;
        nodoActual=raiz;
    }

    public int cardinal() {
        return cardinal;
    }

    public T minimo(){
        Nodo nodoActual=raiz;
        while (nodoActual.izq!=null){
            nodoActual=nodoActual.izq;

        }
        
        return nodoActual.valor;

        
    }

    public T maximo(){
        Nodo nodoActual=raiz;
        while (nodoActual.der!=null){
            nodoActual=nodoActual.der;

        }
        return nodoActual.valor;
    }

    public void insertar(T elem){
        if (cardinal==0){
            Nodo nuevaRaiz = new Nodo(elem);
            raiz = nuevaRaiz;
            cardinal++;
        }

        else if(nodoActual.valor==elem){
            return;
        }

        else{
            int c = nodoActual.valor.compareTo(elem);
                if (c>0){
                    if (nodoActual.izq!=null){
                        nodoActual=nodoActual.izq;
                        insertar(elem);
                    }
                    else{
                        Nodo insertado = new Nodo(elem);
                        nodoActual.izq = insertado;
                        cardinal++;
                        nodoActual=raiz;
        
                    }
                }
                else {
                    if (nodoActual.der!=null){
                        nodoActual=nodoActual.der;
                        insertar(elem);
                    }
                    else{
                        Nodo insertado = new Nodo(elem);
                        nodoActual.der = insertado;
                        cardinal++;}
                        nodoActual=raiz;
                    }}
                        
                    

        }
        
    

    public boolean pertenece(T elem){
        Nodo raiz_ = raiz;
        if (cardinal==0){
            return false;
        }
        else if(raiz_.valor==elem){
            return true;
        }
        else{
            int c = raiz_.valor.compareTo(elem);
                if (c>0){
                    raiz_=raiz_.izq;
                }
                else{
                    raiz_=raiz_.der;
                }
        return pertenece(elem);

            }

        }

        

        
    

    public void eliminar(T elem){
        throw new UnsupportedOperationException("No implementada aun");
    }

    public String toString(){
        throw new UnsupportedOperationException("No implementada aun");
    }

    public class ABB_Iterador {
        private Nodo _actual;

        public boolean haySiguiente() {            
            throw new UnsupportedOperationException("No implementada aun");
        }
    
        public T siguiente() {
            throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public ABB_Iterador iterador() {
        return new ABB_Iterador();
    }

}
