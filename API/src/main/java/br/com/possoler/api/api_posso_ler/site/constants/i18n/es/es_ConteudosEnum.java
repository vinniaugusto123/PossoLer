package br.com.possoler.api.api_posso_ler.site.constants.i18n.es;

import lombok.Getter;

public enum es_ConteudosEnum {
    LABEL_QUANTIDADE_CONTEUDOS(" contenidos exclusivos ya se ha accedido libremente");

    @Getter
    private String label;

    es_ConteudosEnum(String label) {
        this.label = label;
    }
}