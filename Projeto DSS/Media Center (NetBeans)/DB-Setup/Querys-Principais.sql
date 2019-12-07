
#Selecionar o conteúdo de um utilizador

select 
    a.idAlbum,
    c.idConteudo
from
    Utilizador u,
    AlbunsDoUtilizador adu,
    Album a,
    ConteudoDoAlbum cda,
    Conteudo c
where
	u.email = adu.idUserADU
    and adu.idAlbumADU = a.idAlbum
    and cda.idAlbumCDA = a.idAlbum
    and cda.idConteudoCDA = c.idConteudo
    and u.email = "pedro.jose@outlook.pt";
    
#group by c.Categoria_idNomeCategoria
#order by count(c.Categoria_idNomeCategoria) desc;
    
select * from Conteudo c;

select a.idAlbum from Utilizador u, AlbunsDoUtilizador adu, Album a
where u.email = adu.idUserADU and adu.idAlbumADU = a.idAlbum and u.email = "test";








delete from ConteudoDoAlbum where idConteudoCDA = "Remen.mp3";
delete from ConteudoDoAlbum where idConteudoCDA = "Minor.mp3";
delete from Conteudo where idConteudo = "Remen.mp3";
delete from Conteudo where idConteudo = "Minor.mp3";
delete from AlbunsDoUtilizador where idAlbumADU = "AlbumNovoFixe";
delete from AlbunsDoUtilizador where idAlbumADU = "Album2";
delete from Album where idAlbum = "AlbumNovoFixe";
delete from Album where idAlbum = "Album2";

delete from AmigosDoUtilizador where Utilizador_email = "test";
delete from Amigo where emailAmigo = "test";

select * from Conteudo;
select * from Amigo;
select * from Album;
select * from AlbunsDoUtilizador;
select * from ConteudoDoAlbum;







