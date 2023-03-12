
/* BackEnd del Proyecto Integrador Final Argentina Programa  desarrollado por Rivelino Padilla */

package tech.rivernet.BackEnd.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tech.rivernet.BackEnd.model.User;
import tech.rivernet.BackEnd.repository.UserRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    
    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         User user =  userRepo
                  .findOneByUsername(username)
                  .orElseThrow(() -> new UsernameNotFoundException("El usuario " + username + " no existe."));
                  
         return new UserDetailsImpl(user);
    }
    
    
    
}
