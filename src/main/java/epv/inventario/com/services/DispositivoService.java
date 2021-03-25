package epv.inventario.com.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epv.inventario.com.repository.DispositivoRepository;
import epv.inventario.com.entities.Dispositivo;

@Service
public class DispositivoService {

	@Autowired
	private DispositivoRepository dispositivoRepository;
	
	public ArrayList<Dispositivo> obtenerDispositivos(){
		return (ArrayList<Dispositivo>) dispositivoRepository.findAll();
	}
}
