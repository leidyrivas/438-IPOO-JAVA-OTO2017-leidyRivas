package baseDeDatos;

public class DBException extends Exception {
	public DBException(){
		super();
	}
	
	public DBException(String mensaje){
		super(mensaje);
	}
}
