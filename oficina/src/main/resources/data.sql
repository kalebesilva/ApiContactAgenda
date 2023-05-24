SET SESSION FOREIGN_KEY_CHECKS=0;

INSERT INTO contatos (anotacoes, cont_firstname, cont_lastname, data_nasc) values 
("Cuidado, estou de dieta","Paulo","Sempão","1800-09-18"),
 ("Adieta nao ta tankando", "kalebe", "advogado", "1999-02-03"),
 ("Liga-me em 4 minutos", "Joao", "falido", "1979-02-07");
 
 INSERT INTO `user` (`user_email`, `user_first_name`,`user_last_name`,`user_pass`)
 VALUES ("PauloSemPao@gmail.com","Paulo","Sempao","12345678");
 
 INSERT INTO `contatos_email`(`email`,`contato_id_cont_id`)
 VALUES ("PauloSemPao@hotmail.com",1),
 ("MacaxeiraGames@hotmail.com",2),
 ("Marracao@hotmail.com",2),
 ("TeamFortress@hotmail.com",3),
 ("JoseJaja@hotmail.com",3);
 
 INSERT INTO `contatos_telefone` (`telefone`,`contato_id_cont_id`)
 VALUES ("9999-9999",1),
 ("7777-6666",2),
 ("5555-4444",2),
 ("3333-2222",3),
 ("2222-1111",3);
 
 INSERT INTO `contatos_endereco` ( `bairro`
 , `cidade`, `estado`, `numero`,
 `pais`, `rua`, `contato_id_cont_id`)
 VALUES ("Calderao","DoHulk","Amapa",4444,"Brasil","Rua 2",1),
  ("MAringa","Rio Azul","Rio de janeiro",5555,"Brasil","Rua 3",2),
   ("Batata","Batatais","Sao paulo",9999,"Brasil","Rua 4",3);
   
INSERT INTO `agenda` (`contato_id_cont_id`,`user_id_user_id`) 
VALUES (1, 1),
(2, 1),
(3, 1);



SET SESSION FOREIGN_KEY_CHECKS=1;
