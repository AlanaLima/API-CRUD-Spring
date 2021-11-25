package br.alana.teste.services;

import br.alana.teste.models.User;
import br.alana.teste.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User salvar(User user) {
        return userRepository.save(user);
    }

    public List<User> listar() {
        return userRepository.findAll();
    }

    public User listarporId(long iduser){
        Optional<User> user = userRepository.findById(iduser);
        return user.get();
    }

    public void alterar ( long iduser,User user){
        userRepository.findById(iduser);
        user.setIduser(iduser);
        userRepository.save(user);
    }
    public void deletar(long iduser){
        userRepository.deleteById(iduser);

    }

}
