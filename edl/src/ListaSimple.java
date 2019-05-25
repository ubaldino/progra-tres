import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author ubaldino zurita
 *
 * @param <T>
 */
public class ListaSimple< T extends Comparable<T> > {
    private  Nodo<T> inicio;

    public ListaSimple() {
        inicio = null;
    }
    public boolean esVacia() {
        return inicio == null;
    }
    
    public void insertarInicio( T dato ) {
        Nodo<T>  nuevo = new Nodo<T>( dato );
        
        if( !esVacia() ) {
            nuevo.setSig( inicio );
        }
        
        inicio = nuevo;
    }
    
    public void insertarFinal( T dato ){
    	
    	Nodo<T> nuevo = new Nodo<T>( dato ) ;
    	
    	if ( esVacia() ) {
			inicio = nuevo;
		}
    	else {
    		Nodo<T> actual = inicio;
    		
    		while( actual.getSig() != null ) {
    			actual = actual.getSig();
    		}
    		actual.setSig( nuevo );
    	}	
    }
    
    /**
     * Inserta un elemento en la posicion dada
     * 
     * @param dato
     * @param pos
     */
    public void insertar( T dato, int pos ){
    	
    	Nodo<T> nuevo = new Nodo<T>( dato ) ;
    	
    	Nodo<T> actual = inicio;
    	Nodo<T> anterior = null;
    	int i = 0;
    	
    	
    	
    	while( actual != null && i != pos ) {
    		anterior = actual;
    		actual = actual.getSig();
    		i++;
    	}
    	
    	if ( actual == null ) {
			inicio = nuevo;
		}
    	else {
    		nuevo.setSig( actual );
    		if ( anterior == null ) {
				inicio = nuevo;
			}
    		else {
    			anterior.setSig( nuevo );
    			inicio = anterior;
    		}
    	}
    	
    	
    }
    
    /**
     * Elimina un elemento a partir de una posicion dada
     * @param pos
     */
    public void eliminar( int pos ) {
    	Nodo<T> anterior = null;
    	Nodo<T> actual = inicio;
    	
    	int it = 0;
    	
    	while( actual != null && it != pos ){
    		anterior = actual;
    		actual = actual.getSig();
    		it++;
    	}
    	
    	if( actual != null  ) {
    		if( anterior != null ) {
    			anterior.setSig( actual.getSig() );
    		}
    		else {
    			inicio = actual.getSig();
    		}
    	}
    }
    
    /**
     * Elimina un elemento a partir de un Objeto dado
     * @param T Object
     */
    public void eliminar( T dato ) {
    	Nodo<T> anterior = null;
    	Nodo<T> actual = inicio;
    	
    	int it = 0;
    	
    	while( actual != null && actual.getDato().compareTo( dato ) != 0 ) {
    		anterior = actual;
    		actual = actual.getSig();
    		it++;
    	}
    	
    	if( actual != null ) {
    		if( anterior != null ) {
    			anterior.setSig( actual.getSig() );
    		}
    		else {
    			inicio = actual.getSig();
    		}
    	}
    }
    
    /**
	  * Devuelve la longitud de la lista
	*/
    public int longitud() {
		int contador = 0;
		
		for ( Nodo<T> x = inicio ; x != null ; x = x.getSig() ) {
			contador++;
		}
		return contador;
	}
	
    /**
	 * Devuelve el elemento de una posicion
	 *
	 * @param pos
	 * @return T
	*/
	public T obtener( int pos ) {
		int i = 0;
		Nodo<T> actual = inicio;
		while( actual != null  && i != pos ) {
			actual = actual.getSig();
			i++;
		}
		return actual == null ? null : actual.getDato() ;
	}
	
	/**
	 * Devuelve el indice en el que se encuentra el elemento
	 *
	 * @param dato
	 * @return int
	 */
	public int buscar( T dato ) {
		int res = 0;
		Nodo<T> actual = inicio;
		
		while( actual != null && !actual.getDato().equals( dato ) ) {
			actual = actual.getSig();
			res++;
		}
		return actual != null ? res : -1;
	}
	
	/**
	 * Verifica si el elemento ya existe en la lista
	 * @param dato
	 * @return true or false
	 */
	public boolean contiene( T dato ) {
		
		Nodo<T> actual = inicio;
		
		while( actual != null && actual.getDato().equals(dato) ) {
			actual = actual.getSig();
		}
		
		return actual != null;
	}
	
	
	/**
	 * Reemplaza el valor de un elemento segun el index
	 * @param dato
	 * @param pos
	 */
	public void reemplazar( T dato, int pos ) {
		Nodo<T> actual = inicio;
		
		while( actual != null && pos > 0 ) {
			actual = actual.getSig();
			pos--;
		}
		
		if( actual != null )
			actual.setDato( dato );
	}
	
	public void ordenar() {
	     Nodo<T> actual , siguiente;
	     T auxiliar;
	     
	     actual = inicio;
	     
	     while( actual.getSig() != null ) {
	    	 siguiente = actual.getSig();
	          while( siguiente != null ) {
	        	  if( actual.getDato().compareTo( siguiente.getDato() ) > 0 ) {
	        		  auxiliar = siguiente.getDato();
	        		  siguiente.setDato( actual.getDato() ) ;
	        		  actual.setDato( auxiliar );          
	        	  }
	        	  siguiente = siguiente.getSig();                    
	          }
	          actual    = actual.getSig();
	          siguiente = actual.getSig();
	     }
	}
	
	public void invertir() {
		
		Nodo<T> anterior = null;
		Nodo<T> actual = inicio;
		Nodo<T> auxiliar;
		
		while ( actual != null ) {
			auxiliar = actual.getSig();
			actual.setSig( anterior ) ;
			anterior = actual;
			actual = auxiliar;
		}
		inicio = anterior;     
	}
	
	/**
	 * Devuelve un vector con los indices encontrados para el elemento
	 * @param dato
	 * @return Integer[]
	 */
	public Integer[] indices( T dato ) {
		
		Nodo<T> actual = inicio;

		ListaSimple<Integer> listaIndices = new ListaSimple<Integer>();
		int i = 0;
		
		while( actual != null ) {
			if( actual.getDato().compareTo( dato ) == 0 ) {
				listaIndices.insertarFinal( i );
			}
			actual = actual.getSig();
			i++;
		}
		
		return listaIndices.toArray();
	}

	
	/**
	 * Devuelve un vector con los elementos de la lista
	 * @return T[]
	 */
	@SuppressWarnings("unchecked")
	public T[] toArray( ) {
		
		T[] elementos = (T[]) Array.newInstance( 
								this.inicio.getDato().getClass() ,
								this.longitud()
							);
		
		Nodo<T> actual = inicio;
		
		int i = 0;
		while( actual != null ) {
			elementos[i] = actual.getDato();
			actual = actual.getSig();
			i++;
		}

		return elementos;
	}
	
	/**
	 * Devuelve la cantidad de elementos repetidos 
	 * @param dato
	 * @return int
	 */
	public int cantidadRepetidos( T dato ) {
		Nodo<T> actual = inicio;
		int cantidad = 0;
		
		while( actual != null ) {
			if( actual.getDato().compareTo( dato ) == 0 ) {
				cantidad++;
			}
			actual = actual.getSig();
		}
		return cantidad>0 ? cantidad-1:cantidad;
	}
	
    public void imprimir() {
        
        for( Nodo<T> x = inicio ; x != null ; x = x.getSig() ){
            System.out.println( x.getDato() );
        }
    
    }
}
