
delete from Album;
delete from AlbunsDoUtilizador;
delete from Conteudo;
delete from ConteudoDoAlbum;
delete from Categoria;
delete from Utilizador;

insert into Utilizador values ("jose.fernandes@gmail.com", "José Fernandes", "password", 0, 0);
insert into Utilizador values ("maria.monteiro@hotmail.com", "Maria Monteiro", "password", 0, 0);
insert into Utilizador values ("filipe.franco@gmail.com", "Filipe Franco", "password", 0, 0);
insert into Utilizador values ("pedro.jose@outlook.pt", "Pedro José", "password", 0, 0);
insert into Utilizador values ("test", "UserTest", "", 0, 0);

insert into Categoria values ("Rock");
insert into Categoria values ("Metal");
insert into Categoria values ("Pop");
insert into Categoria values ("Blues");
insert into Categoria values ("Video");

insert into Album values ("Músicas de Rock", "Rock");

insert into AlbunsDoUtilizador (idUserADU, idAlbumADU) values ("test", "Músicas de Rock");

insert into Conteudo values ("Metallica_Fade-to-black.mp3", "Metallica", 1, 0, "DB/Content/Metallica_Fade-to-black.mp3", "Metal");
insert into Conteudo values ("SampleVideo.mp4", "SampleVideo", 0, 1, "DB/Content/SampleVideo.mp4", "Video");

insert into ConteudoDoAlbum (idAlbumCDA, idConteudoCDA, idCategoriaCDA) values ("Músicas de Rock", "SampleVideo.mp4", "Video");
insert into ConteudoDoAlbum (idAlbumCDA, idConteudoCDA, idCategoriaCDA) values ("Músicas de Rock", "Metallica_Fade-to-black.mp3", "Metal");