package evaluacion.primera;
/*
 * author: jorge andres da costa ribeiro
 * 
 *metodo que contiene las llamadas a los metodos de las clases de conexion, intrucciones, regionDTO para 
 *asi recolectar toda la imformacion y guardar la info en un arraylist para que despues el main del programa
 *la muestre en pantalla. 
 *
 * */
public class RegionDao {

	Conexion conexion1 = new Conexion();
	//declaro un nuebo object de conexion para invocar a la conexion que se hace ahora
	Conexion conexion2 = (Conexion) conexion1.establecerconn();
	//creo un segundo objeto para llamar al metodo de establecer conexion
	
	
	
}
