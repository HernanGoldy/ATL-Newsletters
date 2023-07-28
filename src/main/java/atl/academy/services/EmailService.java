package atl.academy.services;

import atl.academy.entities.Suscriptor;
import atl.academy.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public void guardarEmail(Suscriptor suscriptor) {

        emailRepository.save(suscriptor);
    }

    public void eliminarEmail(Long id) {
        emailRepository.deleteById(id);
    }
}
