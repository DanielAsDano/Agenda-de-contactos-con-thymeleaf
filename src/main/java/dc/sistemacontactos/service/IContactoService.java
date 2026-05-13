package dc.sistemacontactos.service;

import dc.sistemacontactos.model.Contacto;

import java.util.List;

public interface IContactoService {
    public List<Contacto> listarContactos();
    public Contacto buscarContactoPorId(Integer id);
    public void guardarContacto(Contacto contacto);
    public void eliminarContacto(Contacto contacto);
}
