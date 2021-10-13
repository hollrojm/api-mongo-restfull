package co.com.sofkau.empleado.repository;

import co.com.sofkau.empleado.collections.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEmpleado extends MongoRepository<Empleado, String> {
}
