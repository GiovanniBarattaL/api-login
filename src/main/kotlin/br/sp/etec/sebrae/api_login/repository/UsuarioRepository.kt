package br.sp.etec.sebrae.api_login.repository

import br.sp.etec.sebrae.api_login.entity.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository : JpaRepository<Usuario, Long> {
    fun findByEmail(email : String) : Usuario?
}