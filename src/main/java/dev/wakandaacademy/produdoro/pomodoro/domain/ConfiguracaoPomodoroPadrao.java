package dev.wakandaacademy.produdoro.pomodoro.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collation = "ConfiguracaoPadraoPomodoro")
@Getter
public class ConfiguracaoPomodoroPadrao {
	private static final String CODIGO_DEFAULT = "DEFAULT";
	@Builder.Default
	@MongoId(targetType = FieldType.STRING)
	private String codigo = CODIGO_DEFAULT;
	private Integer tempoMinutosFoco;
	private Integer tempoMinutosPausaCurta;
	private Integer tempoMinutosPausaLonga;
	private Integer repeticoesParaPausaLonga;

}
