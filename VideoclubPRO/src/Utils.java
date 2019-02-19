import java.util.ArrayList;
import java.util.List;

public class Utils {
		
	
	 //creacion de listas
	
	 List<Pelicula> peliculasStock = new ArrayList<>();
	 List<Pelicula> peliculasAlquiladas = new ArrayList<>();

	public Utils(List<Pelicula> peliculasStock) {

		this.peliculasStock = peliculasStock;

	}
	
	//definicion de metedos

	public void alquilar(Pelicula pelicula) {

		this.peliculasStock.remove(peliculasStock.indexOf(pelicula));
		this.peliculasAlquiladas.add(pelicula);

	}

	public void devolver(Pelicula pelicula) {

		this.peliculasAlquiladas.remove(peliculasAlquiladas.indexOf(pelicula));
		this.peliculasStock.add(pelicula);

	}
	
	public void pintarListaPelicula(List<Pelicula> lista){
		for (Pelicula pelicula : lista) {
			System.out.println("Pelicula----> "+pelicula.toString());
		}
		
	}

}
