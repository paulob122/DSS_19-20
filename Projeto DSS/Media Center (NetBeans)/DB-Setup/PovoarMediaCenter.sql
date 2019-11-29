
/*Default variables setup*/

SET GLOBAL log_bin_trust_function_creators = 1;

/*Povoar as diferentes tabelas*/

#Utilizadores
insert into Utilizador values ("testuser@testmail.com", "Test User", "test", 0, 0);
insert into Utilizador values ("abel.soares.1234@gmail.com", "Abel Soares", "mypasswordishard", 0, 0);
insert into Utilizador values ("fernanda.moreira.mail@hotmail.com", "Fernanda Moreira", "mypetiscute", 0, 0);
insert into Utilizador values ("phenriques1999@gmail.com", "Pedro Henriques", "findme", 0, 0);
insert into Utilizador values ("pedrito533@outlook.pt", "Pedro", "pedritopass", 0, 0);

#Categorias
insert into Categoria values ("Content_Category_1_test");
insert into Categoria values ("Album_Category_1_test");

#Conteudos
insert into Conteudo values ("artist_test-musicName", "artist_test", 1, 0, "filetest.mp3", "Content_Category_1_test");

#Albuns
insert into Album values (1, "PlaylistTest", "Album_Category_1_test");

#Associação: Conteudo do Album
insert into ConteudoDoAlbum values (1, 1, "artist_test-musicName");
#Associação: Album do Utilizador
insert into AlbunsDoUtilizador values (1, "testuser@testmail.com", 1);

/*Para visualizar o resultado das querys*/

select * from Utilizador;
select * from Categoria;
select * from Conteudo;
select * from Album;
select * from AlbunsDoUtilizador;
select * from ConteudoDoAlbum;