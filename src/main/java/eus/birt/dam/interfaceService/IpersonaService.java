package eus.birt.dam.interfaceService;

import java.util.List;
import java.util.Optional;

import eus.birt.dam.modelo.Persona;

public interface IpersonaService {
	
	public List<Persona>listar();
	public Optional<Persona>listarID(int id);
	public int save(Persona p);	
	public void delete (int id);

}
