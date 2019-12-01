
#--------------------------------------
#Remover todos os elementos das tabelas

delete from Album;
delete from AlbunsDoUtilizador;
delete from Conteudo;
delete from ConteudoDoAlbum;
delete from Categoria;
delete from Utilizador;

#--------------------------------------
#Apresentar todas as tabelas

select * from Conteudo;
select * from Album;
select * from AlbunsDoUtilizador;
select * from ConteudoDoAlbum;
select * from Utilizador;
select * from Categoria;

#--------------------------------------
#Povoamento de tabelas

insert into Utilizador values ("jose.fernandes@gmail.com", "José Fernandes", "password", 0, 0);
insert into Utilizador values ("maria.monteiro@hotmail.com", "Maria Monteiro", "password", 0, 0);
insert into Utilizador values ("filipe.franco@gmail.com", "Filipe Franco", "password", 0, 0);
insert into Utilizador values ("pedro.jose@outlook.pt", "Pedro José", "password", 0, 0);

insert into Categoria values ("Rock");
insert into Categoria values ("Metal");
insert into Categoria values ("Pop");
insert into Categoria values ("Blues");

insert into Album values ("Músicas de Rock", "Rock");
insert into Album values ("Músicas de Rock v2", "Rock");
insert into Album values ("Músicas de Metal", "Metal");
insert into Album values ("Músicas de Pop", "Pop");
insert into Album values ("Músicas de Blues", "Blues");

insert into AlbunsDoUtilizador (idUserADU, idAlbumADU) values ("filipe.franco@gmail.com", "Músicas de Rock");
insert into AlbunsDoUtilizador (idUserADU, idAlbumADU) values ("maria.monteiro@hotmail.com", "Músicas de Metal");
insert into AlbunsDoUtilizador (idUserADU, idAlbumADU) values ("maria.monteiro@hotmail.com", "Músicas de Rock v2");

insert into Conteudo values ("Guns-N-Roses_November-Rain", "Guns-N-Roses", 1, 0, "Guns-N-Roses_November-Rain.mp3", "Rock");
insert into Conteudo values ("Guns-N-Roses_Sweet-Child-o'-Mine", "Guns-N-Roses", 1, 0, "Guns-N-Roses_Sweet-Child-o'-Mine.mp3", "Rock");
insert into Conteudo values ("Metallica_Fade-to-black", "Metallica", 1, 0, "Metallica_Fade-to-black.mp3", "Metal");
insert into Conteudo values ("Metallica_Nothing-else-matters", "Metallica", 1, 0, "Metallica_Nothing-else-matters.mp3", "Metal");
insert into Conteudo values ("Architecs_Doomsday", "Architects", 1, 0, "Architecs_Doomsday.mp3", "Metal");

#insert into Conteudo values ("Architecs_Doomsday", "Architects", 1, 0, "Architecs_Doomsday.mp3", "Rock");
#delete from Conteudo where idConteudo = "Architecs_Doomsday" and Categoria_idNomeCategoria = "Rock";

insert into ConteudoDoAlbum (idAlbumCDA, idConteudoCDA, idCategoriaCDA) values ("Músicas de Rock", "Guns-N-Roses_November-Rain", "Rock");
insert into ConteudoDoAlbum (idAlbumCDA, idConteudoCDA, idCategoriaCDA) values ("Músicas de Rock", "Guns-N-Roses_Sweet-Child-o'-Mine", "Rock");
insert into ConteudoDoAlbum (idAlbumCDA, idConteudoCDA, idCategoriaCDA) values ("Músicas de Metal", "Metallica_Fade-to-black", "Metal");
insert into ConteudoDoAlbum (idAlbumCDA, idConteudoCDA, idCategoriaCDA) values ("Músicas de Metal", "Metallica_Nothing-else-matters", "Metal");
insert into ConteudoDoAlbum (idAlbumCDA, idConteudoCDA, idCategoriaCDA) values ("Músicas de Metal", "Architecs_Doomsday", "Metal");
insert into ConteudoDoAlbum (idAlbumCDA, idConteudoCDA, idCategoriaCDA) values ("Músicas de Rock v2", "Guns-N-Roses_November-Rain", "Rock");
