package com.algaworks.algafood.api.v2.openapi.model;

import java.util.List;

import com.algaworks.algafood.api.v1.model.CozinhaModel;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@ApiModel("CozinhasModel")
@Setter
@Getter
public class CozinhasModelV2OpenApi {
    
    private CozinhasEmbeddedModelOpenApi _embedded;
    private PageModelV2OpenApi page;
    
    @ApiModel("CozinhasEmbeddedModel")
    @Data
    public class CozinhasEmbeddedModelOpenApi {
        
        private List<CozinhaModel> cozinhas;
        
    }
    
}
