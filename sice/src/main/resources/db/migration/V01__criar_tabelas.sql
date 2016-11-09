CREATE TABLE estabelecimento(
	id_local    BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome_local  VARCHAR(255) NOT NULL,
	cnpj	    VARCHAR(255) NOT NULL,
	endereco    VARCHAR(255) NOT NULL,
	telefone    VARCHAR(255) NOT NULL,
	email       VARCHAR(255) NOT NULL
)Engine=InnoDB DEFAULT CHARSET=utf8;