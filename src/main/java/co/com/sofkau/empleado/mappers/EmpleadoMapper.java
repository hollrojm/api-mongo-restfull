package co.com.sofkau.empleado.mappers;

import co.com.sofkau.empleado.collections.Empleado;
import co.com.sofkau.empleado.dtos.EmpleadoDTO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class EmpleadoMapper {

    public Empleado fromDTO(EmpleadoDTO dto) {
        Empleado empleado = new Empleado();
        empleado.setId(dto.getId());
        empleado.setNombre(dto.getNombre());
        empleado.setRol(dto.getRol());
        return empleado;
    }

    public EmpleadoDTO fromCollection(Empleado collection) {
        EmpleadoDTO empleadoDTO = new EmpleadoDTO();
        empleadoDTO.setId(collection.getId());
        empleadoDTO.setNombre(collection.getNombre());
        empleadoDTO.setRol(collection.getRol());
        return empleadoDTO;
    }

    public List<EmpleadoDTO> fromCollectionList(List<Empleado> collection) {
        if (collection == null) {
            return null;

        }
        List<EmpleadoDTO> list       = new ArrayList(collection.size());
        Iterator          listTracks = collection.iterator();

        while(listTracks.hasNext()) {
            Empleado empleado = (Empleado)listTracks.next();
            list.add(fromCollection(empleado));
        }

        return list;
    }

}
