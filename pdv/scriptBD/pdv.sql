create database pdv;


-- Tabela para a entidade Loja
CREATE TABLE loja (
    id_loja INT PRIMARY KEY auto_increment,
	nome VARCHAR(255)
    
);

-- Tabela para a entidade Produto
CREATE TABLE produto (
    id_produto INT PRIMARY KEY auto_increment,
    nome VARCHAR(255),
    preco DECIMAL(10, 2)
);

-- Tabela para a entidade Vendedor
CREATE TABLE vendedor (
    id_vendedor INT PRIMARY KEY auto_increment,
    nome VARCHAR(255)
    
);


-- Tabela para a entidade Venda
CREATE TABLE venda (
    id_venda INT PRIMARY KEY auto_increment,
    data_venda DATE,
    id_loja INT,
    id_vendedor INT,
    FOREIGN KEY (id_loja) REFERENCES Loja(id_loja),
    FOREIGN KEY (id_vendedor) REFERENCES Vendedor(id_vendedor)
);

-- Tabela para a entidade Item
CREATE TABLE item (
    id_item INT PRIMARY KEY auto_increment,
    quantidade INT,
    id_produto INT,
    id_venda INT,
    FOREIGN KEY (id_produto) REFERENCES Produto(id_produto),
    FOREIGN KEY (id_venda) REFERENCES Venda(id_venda)
);


