
public class ListaSimple<T>
{
    private  Nodo<T> inicio;

    public ListaSimple(){
        inicio = null;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    public void insertarInicio( T dato  ){
        Nodo<T>  nuevo = new Nodo<T>( dato );
        
        if( !esVacia() ){
            nuevo.setSig( inicio );
        }
        
        inicio = nuevo;
        
    }
    
    public void insertarFinal( T dato ){
    	
    	Nodo<T> nuevo = new Nodo<T>( dato ) ;
    	
    	if ( esVacia()  ) {
			inicio = nuevo;
		}
    	else{
    		Nodo<T> actual = inicio;
    		
    		while( actual.getSig() != null ){
    			actual = actual.getSig();
    		}
    		actual.setSig( nuevo );
    	}	
    }
    
    public void eliminar( int pos ){
    	Nodo<T> anterior = null;
    	Nodo<T> actual = inicio;
    	
    	int it = 0;
    	
    	while( actual != null && it != pos ){
    		anterior = actual;
    		actual = actual.getSig();
    		it++;
    	}
    	
    	if( actual != null  ){
    		if( anterior != null ){
    			anterior.setSig(  actual.getSig()  );
    		}
    		else{
    			inicio = actual.getSig();
    		}
    	}
    } 
    
    
    public void imprimir(){
        
        for( Nodo<T> x = inicio ; x != null ; x = x.getSig() ){
            System.out.println( x.getDato() );
        }
    
    }
    
    
}
