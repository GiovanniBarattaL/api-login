package br.sp.etec.sebrae.api_login.controller

import br.sp.etec.sebrae.api_login.entity.Login
import br.sp.etec.sebrae.api_login.entity.Usuario
import br.sp.etec.sebrae.api_login.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@CrossOrigin(origins = ["*"])
@Controller
class UsuarioController {

    @Autowired
    var repository: UsuarioRepository? = null

    @PostMapping("/cadastro")
    fun cadastrarUsuario(@RequestBody usuario: Usuario): ResponseEntity<Usuario> {
        return ResponseEntity.ok(repository!!.save(usuario))
    }
    @PostMapping("/buscarporemail")
    fun buscarPorEmail(@RequestBody login: Login): ResponseEntity<Usuario> {
        val usuario = repository?.findByEmail(login.email)

        return if (usuario != null) {
            ResponseEntity.ok(usuario)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @PostMapping("/autenticar")
    fun autenticar(@RequestBody login: Login): ResponseEntity<Boolean> {
        val usuario = repository?.findByEmail(login.email)

        return if (usuario != null && usuario.senha == login.senha) {
            ResponseEntity.ok(true)
        } else {
            ResponseEntity.ok(false)
        }
    }

        }

