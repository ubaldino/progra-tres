
public class Principal {

	public static void main(String[] args) {
		
		ListaSimple<Integer> lista = new ListaSimple<>();
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
		
	}

}