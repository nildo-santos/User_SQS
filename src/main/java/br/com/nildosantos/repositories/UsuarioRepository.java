package br.com.nildosantos.repositories;

import br.com.nildosantos.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    @Query("""
                SELECT u FROM Usuario u
                WHERE u.email = :email
            """)
    Usuario findByEmail(@Param("email") String email);
}