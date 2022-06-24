-- -----------------------------------------------------
-- Banco de Dados sistservice
-- -----------------------------------------------------

DROP DATABASE IF EXISTS sistservice;

CREATE DATABASE sistservice;

\c sistservice;

-- -----------------------------------------------------
-- Table clientes
-- -----------------------------------------------------
CREATE TABLE clientes (
  id SERIAL NOT NULL,
  nome VARCHAR(150) NOT NULL,
  email VARCHAR(150) NOT NULL,
  endereco VARCHAR(150) NOT NULL,
  numero VARCHAR(5) NOT NULL,
  complemento VARCHAR(150),
  bairro VARCHAR(30) NOT NULL,
  cidade VARCHAR(30) NOT NULL,
  cep VARCHAR(10) NOT NULL,
  cpf VARCHAR(20),
  cnpj VARCHAR(20),
  telefone VARCHAR(20) NOT NULL,
  status CHAR NOT NULL,
  PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table fornecedores
-- -----------------------------------------------------
CREATE TABLE fornecedores (
  id SERIAL NOT NULL,
  nome VARCHAR(150) NOT NULL,
  email VARCHAR(150) NOT NULL,
  endereco VARCHAR(150) NOT NULL,
  numero VARCHAR(5) NOT NULL,
  complemento VARCHAR(150),
  bairro VARCHAR(30) NOT NULL,
  cidade VARCHAR(30) NOT NULL,
  cep VARCHAR(10) NOT NULL,
  cnpj VARCHAR(20),
  telefone VARCHAR(20) NOT NULL,
  status CHAR NOT NULL,
  PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table servicos
-- -----------------------------------------------------
CREATE TABLE servicos (
  id SERIAL NOT NULL,
  descricao VARCHAR(150) NOT NULL,
  valor NUMERIC(10,2) NOT NULL,
  status CHAR NOT NULL,
  PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table materiais
-- -----------------------------------------------------
CREATE TABLE materiais (
  id SERIAL NOT NULL,
  descricao VARCHAR(150) NOT NULL,
  valor NUMERIC(10,2) NOT NULL,
  status CHAR NOT NULL,
  PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table compra
-- -----------------------------------------------------
CREATE TABLE compra (
  id SERIAL NOT NULL,
  data DATE NOT NULL,
  fornecedores_id INT NOT NULL,
  CONSTRAINT fk_compra_fornecedores1
    FOREIGN KEY (fornecedores_id)
    REFERENCES fornecedores (id),
  PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table item_compra
-- -----------------------------------------------------
CREATE TABLE item_compra (
  id SERIAL NOT NULL,
  qtde NUMERIC(10,2) NOT NULL,
  valor NUMERIC(10,2) NOT NULL,
  compra_id INT NOT NULL, 
  materiais_id INT NOT NULL,
  CONSTRAINT fk_item_compra_compra1
    FOREIGN KEY (compra_id)
    REFERENCES compra (id),
  CONSTRAINT fk_item_compra_materiais1
    FOREIGN KEY (materiais_id)
    REFERENCES materiais (id),
  PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table orcamento
-- -----------------------------------------------------
CREATE TABLE orcamento (
  id SERIAL NOT NULL,
  data DATE NOT NULL,
  observacao VARCHAR(500) NOT NULL,
  clientes_id INT NOT NULL,
  CONSTRAINT fk_orcamento_clientes1
    FOREIGN KEY (clientes_id)
    REFERENCES clientes (id),
  PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table 
-- -----------------------------------------------------
CREATE TABLE item_orcamento (
  id SERIAL NOT NULL,
  qtde NUMERIC(10,2) NOT NULL,
  valor_item NUMERIC(10,2) NOT NULL,
  orcamento_id INT NOT NULL, 
  servicos_id INT NOT NULL,
  materiais_id INT NOT NULL,
  CONSTRAINT fk_item_orcamento_orcamento1
    FOREIGN KEY (orcamento_id)
    REFERENCES orcamento (id),
  CONSTRAINT fk_item_orcamento_servicos1
    FOREIGN KEY (servicos_id)
    REFERENCES servicos (id),
  CONSTRAINT fk_item_orcamento_materiais1
    FOREIGN KEY (materiais_id)
    REFERENCES materiais (id),
  PRIMARY KEY (id)
);

-- -----------------------------------------------------
-- Table usuarios
-- -----------------------------------------------------
CREATE TABLE usuarios (
  id SERIAL NOT NULL,
  nome VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  senha VARCHAR(100) NOT NULL,
  situacao VARCHAR(1) NOT NULL
);

-- -----------------------------------------------------
-- Inserts 
-- -----------------------------------------------------


INSERT INTO clientes VALUES (default, 'Jose J', 'jj@email', 'Rua Reta', '123', 'Apto.101', 'Centro', 'Lajeado', '95.900-346', '346.643.567-23', '89.234.754/0001-35', '(51)9 4561-9511', 'a');
INSERT INTO clientes VALUES (default, 'Agnaldo Timoteo', 'agt@email.com', 'Rua do AG', '456', 'Ap. 951', 'Centro', 'Lajeado', '95.905-464', '784.615.132-13', '98.465.132/1321-32', '(51) 4 3215-1516', 'a');

INSERT INTO usuarios VALUES (default, 'Flavio', 'flavio@email.com', md5('123456'), 'a');
INSERT INTO usuarios VALUES (default, 'Felipe Busch', 'felipe@email.com', md5('654321'), 'a');





