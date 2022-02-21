package io.github.Juanmy.persona.infrastructure.repository.jpa;

import io.github.Juanmy.persona.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {
    public List<Persona> findByUsuario(String usuario);
    public void deleteById(Integer id);
}
