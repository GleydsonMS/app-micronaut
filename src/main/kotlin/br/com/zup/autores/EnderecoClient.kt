package br.com.zup.autores

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("http://localhost:8081/cep/")
interface EnderecoClient {

    @Get( value = "{cep}", consumes = [ MediaType.APPLICATION_XML])
    fun consulta(cep: String) : HttpResponse<EnderecoResponse>
}