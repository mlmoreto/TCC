package br.edu.ifsp.arq.sice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.edu.ifsp.arq.sice.service.CadastroEstabelecimentoService;


@Configuration
@ComponentScan(basePackageClasses = CadastroEstabelecimentoService.class)
public class ServiceConfig {

}