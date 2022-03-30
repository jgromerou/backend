package com.portfolio.backend.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portfolio.backend.model.Usuario;
import com.portfolio.backend.repository.UserRepository;

@Service
public class UsuarioDetallesServiceImpl implements UserDetailsService {
  @Autowired
  UserRepository userRepository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
    Usuario usu = userRepository.findByUsername(usuario)
        .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + usuario));

    return UsuarioDetallesImpl.build(usu);
  }

}
