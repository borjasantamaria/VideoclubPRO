
public class Pelicula {
	
	public int id;
	public String titulo;
	public int anio;
	public String director;
	
	//constructor
	public Pelicula(int id, String titulo, int anio, String director) {
		this.id = id;
		this.titulo = titulo;
		this.anio = anio;
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", anio=" + anio + ", director=" + director + "]";
	}
	
/*
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
*/	
	

}
