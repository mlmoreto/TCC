
CREATE TABLE estabelecimento (
    id_local BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome_local VARCHAR(50) NOT NULL,
    cnpj       VARCHAR(50) NOT NULL,
    endereco   VARCHAR(50) NOT NULL,
    telefone   VARCHAR(30) NOT NULL,
    email      VARCHAR(50) NOT NULL,
    id_profissional BIGINT(20) NOT NULL,
    FOREIGN KEY (id_profissional) REFERENCES profissional(id_profissional)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	
CREATE TABLE profissional (
    id_profissional BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome_profissional VARCHAR(80) NOT NULL,
    cpf VARCHAR(20) NOT NULL,
    telefone VARCHAR(30) NOT NULL,
    email VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO profissional VALUES (0, 'Maria');
INSERT INTO profissional VALUES (0, 'Laura');
INSERT INTO profissional VALUES (0, 'Joana');
INSERT INTO profissional VALUES (0, 'Sula');