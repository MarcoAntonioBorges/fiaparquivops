# Conteúdo de Estudo para as Provas Semestrais da FIAP
Todos os arquivos de estudo para as PS.

## ENTERPRISE APPLICATION DEVELOPMENT
> THIAGO TOSHIYUKI I. YAMAMOTO (github: https://github.com/thiagoyama/2TDSG)

### Exercício 05
>Link Video Mapeamento Avancado: www.google.com.br

O vídeo mostra sobre o Mapeamento das Entidades do PDF https://github.com/MarcoAntonioBorges/fiaparquivops/blob/master/Exercicio_05__Mapeamento_Avancado(1).pdf, assim como tratamento de Exceções, criação da Classe EntityManagerFactorySingleton, Todos os DAO e DAOImpl, contento também GenericDAO e GenericDAOImpl.

#### Atenção!
> Para as Entidades T_VEICULO_MOTORISTA e T_DADOS_MOTORISTA, houve um mapeamento diferente, não foi necessário ser criado uma classe para essas Entidades, pois primeiro a Entidade T_VEICULO_MOTORISTA contém apenas as Chaves Primárias da Entidade T_MOTORISTA e T_VEICULO, ou seja, uma relação muitos-para-muitos, quando se usa a anotação @ManyToMany o Hibernate por trás já cria uma Entidade Associativa, e segundo a Entidade T_DADOS_MOTORISTA contém como Chave Primária o nr_carteira da Entidade T_MOTORISTA, ou seja, esse atributo é tanto chave primária quanto chave estrangeira, e nesse caso, a Entidade não possui chave primária própria, então foi feito a seguinte solução:

 - Passar todos os atributos da Entidade T_DADOS_MOTORISTA para a Entidade T_MOTORISTA.
 - Criação da anotação @SecondaryTable(name="T_DADOS_MOTORISTA").
 - Todos os atrbutos que vieram para Entidade T_MOTORISTA foram mapeados com a anotação @Column(table="T_DADOS_MOTORISTA") obrigatoriamente.

