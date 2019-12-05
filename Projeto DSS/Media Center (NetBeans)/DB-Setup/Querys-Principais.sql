
#Selecionar o conteúdo de um utilizador

select
    c.*
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
    and u.email = "test";
    
select * from Conteudo c;

select a.idAlbum from Utilizador u, AlbunsDoUtilizador adu, Album a
where u.email = adu.idUserADU and adu.idAlbumADU = a.idAlbum and u.email = "test";

select a.idAlbum, a.Categoria_idNomeCategoria from Utilizador u, AlbunsDoUtilizador adu, Album a
where u.email = adu.idUserADU and adu.idAlbumADU = a.idAlbum and u.email = "test";
