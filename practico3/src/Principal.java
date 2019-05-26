
import java.util.Collections;
import java.util.List;
import java.util.Scanner; 
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		listas milistas = new listas();
		
		milistas.ins_despues(  new nodo(80)  );
		milistas.ins_despues(  new nodo(20)  );
		milistas.ins_despues(  new nodo(10)  );
		milistas.ins_despues(  new nodo(20)  );
		milistas.ins_despues(  new nodo(30)  );
		milistas.ins_despues(  new nodo(40)  );
		milistas.ins_despues(  new nodo(50)  );
		milistas.ins_despues(  new nodo(60)  );


		
		System.out.println( "mostrando lista" );
		milistas.imprimir();
		
		
		System.out.println( "\nLeyendo datos por posicion" );
		System.out.println(  milistas.leer( 15 ) );		
		System.out.println(  milistas.leer( 3 ) );		
		
		
		
		System.out.println( "\nInsertando datos en un posicion" );
		milistas.insertar( new nodo( 20  ), 5 );
		milistas.ins_despues( new nodo(20) );
		milistas.imprimir();
		
		
		System.out.println( "\nNumero de copias de 20 " );
		System.out.println( milistas.numeroCopias( new nodo( 20 ) ) );
		 
		
		System.out.println( "\ninvertir" );
		milistas.Invertir();
		milistas.imprimir();
		
		System.out.println( "\neliminarOcurrencias" );
		milistas.eliminarOcurrencias( new nodo(20) );
		milistas.imprimir();
		
		System.out.println( "\nOrdenar de forma ascendente" );
		milistas.ordenar( milistas , "ascendente" );
		milistas.imprimir();
		
		System.out.println( "\nOrdenar de forma descendente" );
		milistas.ordenar( milistas , "descendente" );
		milistas.imprimir();
		
		
		
		
		
		//nodo nodoh=new nodo(5);
		
//		milistas.ins_antes(nodoh);
//		milistas.ins_antes(new nodo(6));
//		milistas.imprimir();
		/*
		System.out.println("                MENU                   \n");
	
		int op;
		 
		System.out.println("1.- insertar antes");
		System.out.println("2.- insertar despues");
		System.out.println("3.- imprimir");
		System.out.println("4.- lista vacia");
		System.out.println("5.- elemento a buscar y devuleve la posicion");
		System.out.println("6.- buscar elementos a partir de una posicion");
		System.out.println("7.- insertar elemento a partir de una posicion");
		System.out.println("8.- eliminar todas las ocurrencias");
		System.out.println("9.- ordenar lista de criterio ascendente o descendente");
		System.out.println("10.- el numeros de copias del elemento" );
		System.out.println("11.- ordenar la lista de forma ascendente");
		System.out.println("12.- invertir los elementos de una lista");
		System.out.println("13.- los numeros de elementos son");
		System.out.println("14.- salir");
		do {
			System.out.println("introdusca la opsion del (1 al 10) \n "); 
			op=teclado.nextInt();
			switch( op ) {
				case 1:{
					System.out.println("ingrese el valor a ingresar");
					int ele = teclado.nextInt();
					nodo n = new nodo( ele );
					milistas.ins_antes( n );
					break;
				}
				case 2:{
					System.out.println("ingrese el valor a ingresar");
					int ele = teclado.nextInt();
					nodo n = new nodo(ele);
					milistas.ins_despues(n);
					break;
				}
				case 3:{
					milistas.imprimir();
					break;
				}
				case 4:{
					break;
				}
				case 5:{
					//en este se busca la primera ocurrencia del elmente a buscar
					System.out.println("ingrease el elemento a buscar");
					int b = teclado.nextInt();
					int r = milistas.buscar(b, b);
					if( r == 0 )
						System.out.println("0");
					else
						System.out.println("encontrado en posicon"+r);
					break;
				}
				case 6:{
					System.out.println("ingrease el elemento a buscar");
					int b = teclado.nextInt();
					System.out.println("ingrese posicion a partir de la cual buscar");
					int p = teclado.nextInt();
					milistas.buscar2( b, p );
					break;
				}
				case 7:{
					break;
				}
				case 8:{
					System.out.println( "ingrese el elmento a eliminar" );
					int e = teclado.nextInt();
					milistas.eliminar( e );
					break;
				}
				case 9:{
					break;
				}
				case 10:{
					System.out.println("ingrese los numeros de copias");
					int c = teclado.nextInt();
					milistas.buscarRepetido(c);
					break;
				}
				case 11:{
					break;
				}
				case 12:{
					System.out.println("la lista imvertida es:");
					milistas.invertir();
					break;
				}
				case 13:{
					System.out.println("la lista tiene: "+milistas.contarElemento()+" elementos");
					break;
				}
			}
		}
		while( op < 14 );
		System.out.println("FIN DEL PROGRAMA EJECUTA DE NUEVO");
		*/
		
	}
}

