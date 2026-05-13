package dc.sistemacontactos.repository;

import dc.sistemacontactos.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactoRepository extends JpaRepository<Contacto, Integer> {
}
