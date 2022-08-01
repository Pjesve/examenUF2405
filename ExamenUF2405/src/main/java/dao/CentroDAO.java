package dao;

import java.util.List;

import modelo.Centros;

public interface CentroDAO {

	List<Centros> getCentro();
	Centros getEmpleado(int codCentro);
	int insertarCentro(Centros emp);
	int actualizarCentro(Centros emp);
	int eliminarCentro(int codCentros);
	
}
