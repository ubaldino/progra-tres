
public class Principal {

	public static void main(String[] args) {
		
		ListaSimple<Integer> lista = new ListaSimple<>();
		
		lista.insertarFinal( 1 );
		lista.insertarFinal( 2 );
		lista.insertarFinal( 3 );
		lista.insertarFinal( 4 );
		
	
		
		
		lista.imprimir();
	
		System.out.println( " eliminando 1" );
		
		lista.eliminar( 0 );
		
		lista.imprimir();
	}

}