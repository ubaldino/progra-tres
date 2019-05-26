

public class listas {
	
	nodo cabeza = null;
	
	public void ins_antes(nodo n) {
		if( cabeza == null )//si lista vacia
			cabeza = n ;
		else{
			n.sgte = cabeza;
			cabeza = n;	
		}

	}
	
	public void imprimir() {
		if(cabeza == null)
			System.out.println("lista vacia");
		else {
			nodo x = cabeza;
			while ( x!=null ) {
				System.out.print(x.dato+ ",");//imprime el dato del nodo
				x=x.sgte;
			}
			System.out.println("");
		}

	}

	public void ins_despues( nodo n ) {
		if ( cabeza==null )
			cabeza = n;
		else {
			nodo x = cabeza;
			while( x.sgte!=null )
				x = x.sgte;
			x.sgte = n;//nodo n se combierte el el siguiente del ultimo nodo
		}

	}
	
	public int buscar(int elemento, int elemnto) {
		int posicion = 1;
		nodo x = cabeza ;

		while( x!=null ){
			if( x.dato==elemento ){
				return posicion;

			}
			else{
				x = x.sgte;
				posicion++;
			}
		}
		return 0;
	}
	
	public void buscarRepetido( int elemento ) {
		int posicion = 1;
		nodo x = cabeza ;
		boolean encontrado = false;
		while( x!=null ){
			if( x.dato==elemento ){
				System.out.println( posicion );
				x = x.sgte;
				posicion++;
				encontrado = true;
			}
			else{
				x = x.sgte;
				posicion++;
			}
		}
		if( encontrado==false ) {
			System.out.println("No encontrado");
		}

	}
	
	////
	public void buscar2( int elemento, int posicion ) {
		if( cabeza==null )
			System.out.println( "lista vacia" );
		else {
			int cont = 1 ;
			nodo x = cabeza;
			int sw = 0;
			while( x!=null ) {
				if ( cont<posicion ) {
					cont++;
					x = x.sgte;
				}
				else {
					if( elemento==x.dato ) {
						System.out.println("encontrado en pasion"+cont);
						sw = 1;
						break;
					}
					else {
						x = x.sgte;
						cont++;
					}
				}
			}

			System.out.println("cont="+cont);
			if ( posicion >= cont && sw==0 )
				System.out.println("posicion incorrecta");
			if( sw==0 )
				System.out.println("elemento no encontrado");
		}
	}

	//public void imprimir2() {
	//	if(cabeza==null)
	//		System.out.println("lista vacia");
	//	else {
	//		nodo y=cabeza;
	//		while (y!=null) {
	//			System.out.print(cabeza+ ",");//imprime el dato del nodo
	//			y=y;
	//			
	//		}
	//		System.out.println("");
	//	}
	// }

	public void eliminar ( int elemento ) {
		boolean encontrado = false;
		if( cabeza==null ) {
			System.out.println("lista vacia no hay elementos para borrar");
		}
		else {
			if( elemento==cabeza.dato ) {
				cabeza = cabeza.sgte;
				encontrado = true;
			}
			else {
				nodo x = cabeza;
				while ( (x!=null) && (encontrado!=true) ) {
					if( x.sgte!=null ) {
						if( elemento==x.sgte.dato ) {
							x.sgte = x.sgte.sgte;
							encontrado = true;
						}
					}
					x = x.sgte;
				}
				if( encontrado ) 
					System.out.println("elemento borrado");
				else 
					System.out.println("elemento no encontrado");

			}
		}
	}
	
	public int contarElementos() {
		if (cabeza==null)
			return 0;
		else {
			nodo x=cabeza;
			int cont=1;
			while(x.sgte!=null) {
				x=x.sgte;
				cont++;
			}
			return cont;
		}
	}
	
	public void invertir() {
		nodo x=cabeza;
		while (x!=null) {
			x=x.sgte;
			if(x.sgte==null) {
				x=cabeza;

			}else {
				x=x.sgte;
			}
			System.out.println(x.dato);
		}
	
	}
	
	
	/* PREGUNTAS DE LA PRACTICA */
	
	/**
	 * 1. estaVacia(),
	 *	determina si la lista está vacía (Verdad: si esta vacia, falso: si no está vacia).
	 *
	 */
	public boolean estaVacia() {
		return this.cabeza == null;
	}
	
	/**
	 * 2. busqueda (elemento)
	 * devuelve el o los índices de las posiciones donde se encuentre
	 * el elemento y cero si éste no existe.
	*/
	public void busqueda ( int elemento ) {
		int posicion = 1;
		nodo x = cabeza ;
		boolean encontrado = false;
		while( x!=null ){
			if( x.dato == elemento ) {
				System.out.println( posicion );
				x = x.sgte;
				posicion++;
				encontrado = true;
			}
			else {
				x = x.sgte;
				posicion++;
			}
		}
		if( encontrado==false ) {
			System.out.println("0");
		}
	}
	
	/**
	 * 3. leer (posicion), devuelve el elemento que se encuentra en ‘posición’.
	 */
	public int leer( int posicion ) {

		nodo x = cabeza ;
		int i = 1;
		
		while( x!=null && i!=posicion ){
			x = x.sgte;
			i++;
		}
		
		return x != null ? x.dato : -1;
	}
	
	private nodo clonar(nodo inicio) {
		if(inicio == null){
			return null;
		}
		nodo auxiliar = new nodo( inicio.dato );
		auxiliar.sgte = clonar( inicio.sgte );
		return auxiliar;
	 }
	
	/**
	 * 4. insertar (elemento, posición), inserta ‘elemento’ en la ‘posición’ indicada.
	 */
	public void insertar( nodo elemento, int posicion ) {
		nodo x = cabeza ;
		nodo listaClonada = clonar( cabeza );
		int i = posicion;

		if ( posicion <= this.contarElementos() && posicion > 0 ) {
			
			while ( i > 1 ) {
				listaClonada = listaClonada.sgte; 
				i--;
			}
			elemento.sgte = listaClonada;
			listaClonada = elemento;
			 
			i = posicion-1;

			if ( i == 0 ) {
				cabeza = listaClonada;
			}
			else {
				while ( i > 1 ) {
					x = x.sgte;
					i--;
				}
				x.sgte = listaClonada;
			}
		}
	}
	
	/**
	 * 5. eliminar(elemento),
     * elimina todas las ocurrencias del elemento, si existen.
	 */
	public void eliminarOcurrencias( nodo elemento ) {
		nodo x = cabeza;
		
		while ( x != null ) {
			nodo actual = x;
            while ( actual.sgte != null ) {
                if ( actual.sgte.dato == elemento.dato ) {
                	actual.sgte = actual.sgte.sgte ;
                }
                else {
                	actual = actual.sgte;
                }
            }
            x = x.sgte;
        }
		
		if ( cabeza.dato == elemento.dato ) {
			cabeza = cabeza.sgte;
		}
	}
	
	/**
	 * 6. ordenar(lista, criterio);
	 * ordena la lista de acuerdo a criterio (“ascendente” o “descendente”).
	 * 
	 */
	
	public listas ordenar( listas lista , String criterio ) {
		if ( criterio.equals( "ascendente" ) ) {
			lista = this.ordenarAscendente( lista );
		}
		else if( criterio.equals( "descendente" ) ) {
			lista = this.ordenarDescendente( lista );
		}
		return lista;
	}
	
	public listas ordenarAscendente( listas lista ) {
		nodo actual , siguiente;
	    int auxiliar;
	    actual = lista.cabeza;
	     
	    while( actual.sgte != null ) {
	    	siguiente = actual.sgte;
	    	while( siguiente != null ) {
	    		if( actual.dato > siguiente.dato ) {
	    			auxiliar = siguiente.dato;
	    			siguiente.dato = actual.dato ;
	    			actual.dato = auxiliar ;          
	    		}
	    		siguiente = siguiente.sgte;                    
	    	}
	    	actual    = actual.sgte;
	    	siguiente = actual.sgte;
	    }
	    return lista;
	}
	
	public listas ordenarDescendente( listas lista ) {
		nodo actual , siguiente;
	    int auxiliar;
	    actual = lista.cabeza;
	     
	    while( actual.sgte != null ) {
	    	siguiente = actual.sgte;
	    	while( siguiente != null ) {
	    		if( actual.dato < siguiente.dato ) {
	    			auxiliar = siguiente.dato;
	    			siguiente.dato = actual.dato ;
	    			actual.dato = auxiliar ;          
	    		}
	    		siguiente = siguiente.sgte;                    
	    	}
	    	actual    = actual.sgte;
	    	siguiente = actual.sgte;
	    }
	    return lista;
	}
	
	/**
	 * 7. numeroCopias(elemento); 
	 * devuelve el número de veces que aparece el ‘elemento’.
	 */
	
	public int numeroCopias(nodo elemento) {
		nodo x = cabeza;
		int contador = 0;
		while ( x!=null ) {
			if ( x.dato == elemento.dato ) {
				contador++;
			}
			x = x.sgte;
		}
		return contador;
	}
	
	/**
	 * 8. Ordenarasc();
	 * ordenar la lista de forma ascendente (de menor a mayor).
	 */
	public void Ordenarasc() {
		nodo actual , siguiente;
	    int auxiliar;
	     
	    actual = cabeza;
	     
	    while( actual.sgte != null ) {
	    	siguiente = actual.sgte;
	    	while( siguiente != null ) {
	    		if( actual.dato > siguiente.dato ) {
	    			auxiliar = siguiente.dato;
	    			siguiente.dato = actual.dato ;
	    			actual.dato = auxiliar ;          
	    		}
	    		siguiente = siguiente.sgte;                    
	    	}
	    	actual    = actual.sgte;
	    	siguiente = actual.sgte;
	    }
	}
	
	
	/**
	 * 9. Invertir();
     * invierte los elementos de la lista. Si la lista era : {2 3 1} entonces: {1 3 2}
	 */
	public void Invertir() {

		nodo anterior = null;
		nodo actual = cabeza;
		nodo auxiliar;
		
		while ( actual != null ) {
			auxiliar    = actual.sgte;
			actual.sgte = anterior ;
			anterior = actual;
			actual   = auxiliar;
		}
		cabeza = anterior;
	}
	
	
}
