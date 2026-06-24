package br.sp.etec.sebrae.api_login.controller

import br.sp.etec.sebrae.api_login.entity.PrestContas
import br.sp.etec.sebrae.api_login.repository.PrestContasRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/prestcontas")
class PrestContasController {

    @Autowired
    lateinit var repository: PrestContasRepository

    @PostMapping
    fun salvar(
        @RequestBody prestContas: PrestContas
    ): PrestContas {

        return repository.save(prestContas)
    }

    @GetMapping
    fun listar(): List<PrestContas> {
        return repository.findAll()
    }
}