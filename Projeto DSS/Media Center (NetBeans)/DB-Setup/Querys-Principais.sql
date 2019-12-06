
#Selecionar o conteúdo de um utilizador

select
    count(*)
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
    and c.idConteudo = "Solina.mp3"
    and u.email = "test";
    
#group by c.Categoria_idNomeCategoria
#order by count(c.Categoria_idNomeCategoria) desc;
    
select * from Conteudo c;

select a.idAlbum from Utilizador u, AlbunsDoUtilizador adu, Album a
where u.email = adu.idUserADU and adu.idAlbumADU = a.idAlbum and u.email = "test";

select a.idAlbum, a.Categoria_idNomeCategoria from Utilizador u, AlbunsDoUtilizador adu, Album a
where u.email = adu.idUserADU and adu.idAlbumADU = a.idAlbum and u.email = "test";
