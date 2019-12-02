
#Selecionar o conteúdo de um utilizador

select
    u.nomeUtilizador as Nome,
    a.Categoria_idNomeCategoria
    #c.idConteudo as Conteudo
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
    #and c.idConteudo = "Guns-N-Roses_November-Rain";
    and u.email = "maria.monteiro@hotmail.com";
    
select c.idConteudo from Conteudo c;