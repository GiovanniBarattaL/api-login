package br.sp.etec.sebrae.api_login.entity

import jakarta.persistence.*

@Entity
@Table(name = "prest_contas")
class PrestContas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var descricao: String? = null

    var valor: Double? = null

    var data: String? = null

    var tipo: String? = null
}