
public class Principal {

	public static void main(String[] args) {
		
		ListaSimple< String > lista = new ListaSimple<>();
		
		
		
		Persona p1 = new Persona("Jose1", 80 );
		Persona p2 = new Persona("Dario2", 40 );
		Persona p3 = new Persona("pepe3", 70 );
		Persona p4 = new Persona("Jose4", 11 );
		
		lista.insertarFinal( "aabb" );
		lista.insertarFinal( "aabbc" );
		lista.insertarFinal( "aabbd" );
		lista.insertarFinal( "aabb" );
		lista.insertarFinal( "aabbe" );
		lista.insertarFinal( "aabbf" );
		lista.insertarFinal( "aabb" );
		lista.insertarFinal( "aabbg" );
		lista.insertarFinal( "aabbf" );

		lista.imprimir();
		
		//lista.ordenar();
		System.out.println( "---------------- eliminar " );
		// lista.ordenar();
		
		
		lista.eliminarRepetidos();
    	
		
		
		/*
    	for( i = 0 ; i <  ; i++ ){
    		//System.out.println(  listaRepetidos.obtener(i) );
    		this.eliminar( listaRepetidos.obtener(i) );
    	}*/
		
		System.out.println( "elementos eliminados");
		lista.imprimir();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		lista.insertarFinal( "aaaa" );
		lista.insertarFinal( "babb" );
		lista.insertarFinal( "caba" );
		lista.insertarFinal( "abbb" );
		lista.insertarFinal( "aaab" );
		lista.insertarFinal( "ccbb" );
		lista.insertarFinal( "caab" );
		*/
		/*
		System.out.println(  "hola".compareTo( "hola" ) );
		
		lista.insertarFinal( new Persona("Javier"  , 4845858 ) );
		lista.insertarFinal( new Persona("Lucas"   , 3252666 ) );
		lista.insertarFinal( new Persona("Jimena"  , 1594509 ) );
		lista.insertarFinal( new Persona("Andrea"  , 2456433 ) );
		lista.insertarFinal( new Persona("Enrique" , 5567677 ) );
		
		lista.imprimir();
	
		System.out.println( " Lista ordenada" );
		lista.ordenar();
		lista.imprimir();
		 
		System.out.println( " Lista invertida" );
		lista.invertir();
		lista.imprimir();
		
		System.out.println( "Eliminando Jimena" );
		lista.eliminar(  new Persona("Jimena"  , 1594509 ) );
		lista.imprimir();
		*/
		
		/*
		lista.insertarFinal( 3 );
		lista.insertarFinal( 4 );
		lista.insertarFinal( 6 );
		lista.insertarFinal( 4 );
		lista.insertarFinal( 6 );
		lista.insertarFinal( 4 );
		lista.insertarFinal( 4 );
		
		lista.imprimir();
		System.out.println("Indices");
		Integer[] indices = lista.indices( 6 );
		for (int i = 0; i < indices.length; i++) {
			System.out.println( indices[i] );
		}
		// System.out.println( lista.toArray() );
		// lista.insertar( 9 , 7  );
		
		// lista.imprimir();
		
		System.out.println( "Cantidad de repetidos");
		System.out.println( lista.cantidadRepetidos(  6 ) );
		*/
	}

}