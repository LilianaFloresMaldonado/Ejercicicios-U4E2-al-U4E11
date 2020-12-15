package Main;
public class Arbol {
    int NumeroDeNodos, sumaEdad, promedioEdad;
    Nodo raiz;

    public Arbol() {
        this.NumeroDeNodos = 0;
        this.sumaEdad = 0;
        this.promedioEdad = 0;
        this.raiz = null;
    }

    public boolean EstaVacio() {
        return raiz == null;
    }

    public Nodo getRaiz() {
        return raiz;
    }
    
    //metodo insertar
    public void Insertar(Nodo r, String nom, int año) {
        Nodo nuevo = new Nodo(año, nom);
        if (EstaVacio()) {
            raiz = nuevo;
            NumeroDeNodos++;
        } else if (año <= r.año) {
            if (r.Hijoizquierdo == null) {
                r.Hijoizquierdo = nuevo;
                NumeroDeNodos++;
            } else {
                Insertar(r.Hijoizquierdo, nom, año);
            }
        } else {
            if (r.Hijoderecho == null) {
                r.Hijoderecho = nuevo;
                NumeroDeNodos++;
            } else {
                Insertar(r.Hijoderecho, nom, año);
            }
        }
    }

    //metodo de preOrden
    public void PreOrden(Nodo r) {
        if (r != null) {
            System.out.println(r);
            PreOrden(r.Hijoizquierdo);
            PreOrden(r.Hijoderecho);
        }
    }

    //metodo de InOrden
    public void InOrden(Nodo r) {
        if (r != null) {
            InOrden(r.Hijoizquierdo);
            System.out.println(r);
            InOrden(r.Hijoderecho);
        }
    }
    
    //metodo PostOrden
    public void PostOrden(Nodo r) {
        if (r != null) {
            PostOrden(r.Hijoizquierdo);
            PostOrden(r.Hijoderecho);
            System.out.println(r);
        }
    }

    //metodo para las edades minima y maxima
    public Nodo EdadMin() {
        Nodo min = BuscarMax(raiz);
        return min;
    }

    private Nodo BuscarMax(Nodo r) {
        if (r.Hijoderecho != null) {
            r = BuscarMax(r.Hijoderecho);
        } else if (r == null) {
            return null;
        }
        return r;
    }

    public Nodo EdadMax() {
        Nodo max = BuscarMin(raiz);
        return max;
    }

    private Nodo BuscarMin(Nodo r) {
        if (r.Hijoizquierdo != null) {
            r = BuscarMin(r.Hijoizquierdo);
        } else if (r == null) {
            return null;
        }
        return r;
    }
    //metodo para la diferencia de edades
    
     public int Diferencia() {
        Nodo personaJoven = BuscarMax(raiz);
        Nodo personaAdulta = BuscarMin(raiz);
        int diferencia = personaAdulta.edad - personaJoven.edad;
        return diferencia;
    }
    //metodo para saber la cantidad de personas

    public int getNumeroDeNodos() {
        return NumeroDeNodos;
    }
    //metodo para saber la suma de las edades

    public int getSumaEdades() {
        return sumaEdad = edades(raiz);
    }

    private int edades(Nodo r) {
        if (r != null) {
            return r.edad + (edades(r.Hijoizquierdo) + edades(r.Hijoderecho));
        } else {
            return 0;
        }
    }
    //metodo para saber el promedio de las edades

    public int getPromedioEdad() {
        return promedioEdad = sumaEdad / NumeroDeNodos;
    }
    //metodo de la altura

    public int Altura(Nodo r) {
        if (r != null) {
            return 1 + (Math.max(Altura(r.Hijoizquierdo), Altura(r.Hijoderecho)));
        } else {
            return 1;
        }
    }
}   

