CREATE TABLE login(
	idUsuario   BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	usuario     VARCHAR(255) NOT NULL,
	senha	    VARCHAR(255) NOT NULL	
)Engine=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE estabelecimento(
	idLocal     BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nomeLocal   VARCHAR(255) NOT NULL,
	cnpj	    VARCHAR(255) NOT NULL,
	endereco    VARCHAR(255) NOT NULL,
	cidade		VARCHAR(255) NOT NULL,
	telefone    VARCHAR(255) NOT NULL,
	email       VARCHAR(255) NOT NULL
)Engine=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE servico(
	idServico   BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nomeServico VARCHAR(255) NOT NULL,
	preco       DECIMAL(10,2) NOT NULL		
)Engine=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE profissional(
	idProfissional  BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nomeProfissional VARCHAR(255) NOT NULL,
	cpf 			VARCHAR(255) NOT NULL,
	telefone 		VARCHAR(255) NOT NULL,
	email 			VARCHAR(255) NOT NULL,	
	idLocal 		BIGINT(20) NOT NULL,
	idServico 		BIGINT(20) NOT NULL,
	FOREIGN KEY(idLocal)   REFERENCES estabelecimento(idLocal),	
	FOREIGN KEY(idServico) REFERENCES servico(idServico)	
)Engine=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE cliente(
	idCliente   BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nomeCliente VARCHAR(255) NOT NULL,
	cpf	        VARCHAR(255) NOT NULL,
	telefone    VARCHAR(255) NOT NULL,
	email       VARCHAR(255) NOT NULL,
	endereco    VARCHAR(255) NOT NULL,
	idUsuario   BIGINT(20) NOT NULL,
	FOREIGN KEY(idUsuario) REFERENCES login(idUsuario)	
)Engine=InnoDB  DEFAULT CHARSET=utf8;

CREATE TABLE agenda(
	idAgenda        BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	dataAgenda      DATE NOT NULL,
	horario         TIME NOT NULL,
	idCliente       BIGINT(20) NOT NULL,	
	idProfissional	BIGINT(20) NOT NULL,	
	idServico       BIGINT(20) NOT NULL,	
	idLocal         BIGINT(20) NOT NULL,
	FOREIGN KEY(idCliente)      REFERENCES cliente(idCliente),
	FOREIGN KEY(idProfissional) REFERENCES profissional(idProfissional),
	FOREIGN KEY(idServico)      REFERENCES servico(idServico),
	FOREIGN KEY(idLocal)        REFERENCES estabelecimento(idLocal)	
)Engine=InnoDB  DEFAULT CHARSET=utf8;
