import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//pelicula debe de tener titulo string, año int, director string y id tipo entero

		//declaracion de varios objetos
		
		//clase  //objeto
		
		Pelicula pelicula = new Pelicula(1,"LOS VENGADORES",2012,"Pepe");
		Pelicula pelicula2 = new Pelicula(2,"Como entrenarb a tu dragon",2019,"Izaskun");
		Pelicula pelicula3 = new Pelicula(3,"Casa Blanca",1902,"Ni idea");
		Pelicula pelicula4 = new Pelicula(4,"Origen",2016,"Un mago");
		
		//lista de peliculas 
		
		List<Pelicula> peliculas = new ArrayList<>();
			peliculas.add(pelicula);
			peliculas.add(pelicula2);
			peliculas.add(pelicula3);
			peliculas.add(pelicula4);
			
		//creamos objeto util
		
		Utils util = new Utils(peliculas);
		
		
		//creamos dos listas con valores de las listas definidad en la clase utils
		
		List<Pelicula> stock = util.peliculasStock;
		List<Pelicula> alquiladas = util.peliculasAlquiladas;
		
		//alquilamos todas las peliculas
		
		util.alquilar(pelicula);
		util.alquilar(pelicula2);
		util.alquilar(pelicula3);
		util.alquilar(pelicula4);
		
		
		System.out.println("Lista de Alquiladas");
		/*
		for (Pelicula item : alquiladas) {
			
			System.out.println("Pelicula ->"+item.toString());
			
		}
		System.out.println("Lista de stock");
		
		for (Pelicula item : stock) {
			
			System.out.println("Pelicula ->"+item.toString());
			
		}
		*/
		
		util.pintarListaPelicula(alquiladas);
		
		System.out.println("Lista de stock");
		
		util.pintarListaPelicula(stock);
		
		//devolvemos la peli 
		
		util.devolver(pelicula);
		util.devolver(pelicula2);
		util.devolver(pelicula3);
		util.devolver(pelicula4);
		
		
		System.out.println("Lista de Alquiladas");
	
		util.pintarListaPelicula(alquiladas);
		
		System.out.println("Lista de stock");
		
		util.pintarListaPelicula(stock);
		
	}

}
