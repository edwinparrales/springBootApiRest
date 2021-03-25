package epv.inventario.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import epv.inventario.com.entities.Dispositivo;

@Repository
public interface DispositivoRepository extends CrudRepository<Dispositivo, Long> {

	
}
