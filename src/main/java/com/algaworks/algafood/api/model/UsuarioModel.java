package com.algaworks.algafood.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioModel {

	@ApiModelProperty(example = "1")
	private Long id;
	
	@ApiModelProperty(example = "Débora Mendonça")
	private String nome;
	
	@ApiModelProperty(example = "debora.mendoca014@gmail.com")
	private String email;
	
}
