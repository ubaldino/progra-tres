
public class Persona implements Comparable <Persona> {
    private String nombre;
    private int ci;

    public Persona( String nombre, int ci ) {
        this.nombre = nombre;
        this.ci = ci;
    }
    
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCi() {
		return ci;
	}
	
	public void setCi(int ci) {
		this.ci = ci;
	}

	public int compareTo( Persona obj ) {
        int resultado=0;
        // Comparacion por el atributo nombre 
        int diferenciaNombre = this.nombre.compareTo( obj.getNombre() );
        
        if ( diferenciaNombre != 0 && this.ci != obj.getCi() ) {
        	// Comparando por el atributo ci
        	if ( this.ci < obj.getCi()) {
            	resultado += -1;
            }
            else if ( this.ci > obj.getCi() ) {
            	resultado += 1;
            }
		}
        return resultado;
    }

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", ci=" + ci + "]";
	}
	
}
