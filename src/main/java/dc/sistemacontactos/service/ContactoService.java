package dc.sistemacontactos.service;

import dc.sistemacontactos.model.Contacto;
import dc.sistemacontactos.repository.IContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService implements IContactoService{

    @Autowired
    IContactoRepository contactoRepository;

    @Override
    public List<Contacto> listarContactos() {
        List<Contacto> contactos = contactoRepository.findAll();
        return contactos;
    }

    @Override
    public Contacto buscarContactoPorId(Integer id) {
        Contacto contactoBuscado = contactoRepository.findById(id).orElse(null);
        return contactoBuscado;
    }

    @Override
    public void guardarContacto(Contacto contacto) {
        contactoRepository.save(contacto);
    }

    @Override
    public void eliminarContacto(Contacto contacto) {
        contactoRepository.delete(contacto);
    }
}
