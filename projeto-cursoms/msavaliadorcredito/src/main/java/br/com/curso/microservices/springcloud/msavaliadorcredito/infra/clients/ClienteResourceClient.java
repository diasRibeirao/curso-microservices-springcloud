package br.com.curso.microservices.springcloud.msavaliadorcredito.infra.clients;

import br.com.curso.microservices.springcloud.msavaliadorcredito.domain.model.DadosCliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "msclientes", path = "/clientes")
public interface ClienteResourceClient {

    @GetMapping(params = "cpf")
    ResponseEntity<DadosCliente> dadosCliente(@RequestParam("cpf") String cpf);

}
