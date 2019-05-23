// <CLASE GENERICA>


public class Nodo<T>
{
 
	private T dato;
    private Nodo<T> sig;

    public Nodo( T dato )
    {
        this.dato = dato;
        this.sig = null;
        
        /*
        List a = new ArrayList<>();
        */
        
    }
    
    public void setDato( T dato  ){
        this.dato = dato;
    }
    
    public void setSig( Nodo<T> sig  ){
        this.sig = sig;
    }
    
    public T getDato(){
        return this.dato;
    }
    
    public Nodo<T> getSig(){
        return this.sig;
    }

}
