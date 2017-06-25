CREATE TABLE tb_user (
  id    BIGINT(20) NOT NULL AUTO_INCREMENT,
  name  VARCHAR(15)         DEFAULT 'admin',
  pwd   VARCHAR(15)         DEFAULT '123456',
  email VARCHAR(50)         DEFAULT NULL,
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

INSERT INTO tb_user (name, pwd, email) VALUES ("panxiang", "1234", "1195994564@qq.com");