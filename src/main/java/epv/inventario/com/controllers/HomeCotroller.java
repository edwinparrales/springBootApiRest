package epv.inventario.com.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epv.inventario.com.entities.Dispositivo;
import epv.inventario.com.services.DispositivoService;

@RestController
@RequestMapping("/api/usuarios")
public class HomeCotroller {
	@Autowired
	private DispositivoService dispositivoService;
	@GetMapping("/saludar")
	public String saludar() {
		
		return "Hola mundo desde";
	}
	
	@GetMapping("/dispositivos")
	public ArrayList<Dispositivo> obtenerDispositivos() { 
      return dispositivoService.obtenerDispositivos();
	}
	
	

}
