/*
select
                    LEFT(p.produto,6) codprod,
                    p.grupo codgrupo,right(p.nome,50) descricao, right(p.marca,50) campolivre3,right(p.volume,6) unidadeent,
                    right(f.volume,6) unidadesaida,right(f.cst,3) codtribut00,right(p.ncm,8) campolivre1,f.vrvend preco
                    from produto p
                    inner join produtofisco f on p.produto=f.produto

select
                    c.cliente codcliente,
                    left(c.pessoa,1) pessoa_FJ,
                    left(c.cpf,18)cgccpf,
                    left(c.nome,60) nome,
                    left(l.email,60) email,
                    left(l.rg,20) campolivre1,
                    left(l.ie,15) inscest, 
                    left(e.cep,8) cep, 
                    left(e.nro,5) numeronfe,
                    right(e.endereco,60) endereco
                    from cliente c
                    inner join CLI_COMP l on c.cliente=l.cliente
                    inner join CLI_ENDE e on c.cliente=e.cliente
                    where c.status ='A' and c.cpf <>''

select 
right('000000')
from FORNECEDOR f where f.STATUS='A'

select
g.grupo codgrupo,g.nome descricao
from grupo g

select distinct(p.ncm) from produto p where char_length(p.ncm)=8

select distinct(p.MARCA) from produto p where p.MARCA<>''


select
p.produto codprod,'R' tipoprod,'00' CODTIPOPRODUTO,
p.grupo codgrupo,p.nome descricao, p.marca campolivre3,p.volume unidadeent,
f.volume unidadesaida,f.cst codtribut00,p.ncm campolivre4,f.vrvend preco
from produto p
inner join produtofisco f on p.produto=f.produto
select
f.produto codprod, f.qtdestoque quantidade,'00' codempresa,
'02.10.2015' datainv,'02102015' documento,'N' processado,
'ADMIN' usuario,'002' codcausa,'0000' codgrade,'0.000' precocusto
from produtofisco f
*/

