package com.algaworks.algafood.domain.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemPedidoModel {
	
	private Long produtoId;
	private String produtoNome;
	private BigDecimal precoUnitario;
	private BigDecimal precoTotal;
	private Integer quantidade;
	private String observacao;

}
