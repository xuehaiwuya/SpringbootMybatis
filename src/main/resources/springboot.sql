CREATE TABLE tb_user (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(15) DEFAULT 'admin',
  pwd varchar(15) DEFAULT '123456',
  email varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_user(name,pwd,email)VALUES("panxiang","1234","1195994564@qq.com");