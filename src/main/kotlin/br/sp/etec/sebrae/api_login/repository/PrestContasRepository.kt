package br.sp.etec.sebrae.api_login.repository

import br.sp.etec.sebrae.api_login.entity.PrestContas
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PrestContasRepository :
    JpaRepository<PrestContas, Long>