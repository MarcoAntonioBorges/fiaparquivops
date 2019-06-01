# Conteúdo de Estudo para as Provas Semestrais da FIAP
Todos os arquivos de estudo para as PS.

## ENTERPRISE APPLICATION DEVELOPMENT
> THIAGO TOSHIYUKI I. YAMAMOTO ([Repositório](https://github.com/thiagoyama/2TDSG "Github"))

### Exercício 05
>Link Video Mapeamento Avancado: [Assistir](https://drive.google.com/open?id=1NMwJQBfu3FwYIdY19PolBm6LGWDCiErl)

O vídeo mostra sobre o Mapeamento das Entidades do [PDF](./Exercicio_05__Mapeamento_Avancado(1).pdf "PDF - Mapeamento Avancado"), assim como tratamento de Exceções, criação da Classe EntityManagerFactorySingleton, Todos os DAO e DAOImpl, contendo também GenericDAO e GenericDAOImpl.

### Atenção!
> Para as Entidades T_VEICULO_MOTORISTA e T_DADOS_MOTORISTA, houve um mapeamento diferente, não foi necessário ser criado uma classe para essas Entidades, pois primeiro a Entidade T_VEICULO_MOTORISTA contém apenas as Chaves Primárias da Entidade T_MOTORISTA e T_VEICULO, ou seja, uma relação muitos-para-muitos, quando se usa a anotação @ManyToMany o Hibernate por trás já cria uma Entidade Associativa, e segundo a Entidade T_DADOS_MOTORISTA contém como Chave Primária o nr_carteira da Entidade T_MOTORISTA, ou seja, esse atributo é tanto chave primária quanto chave estrangeira, e nesse caso, a Entidade não possui chave primária própria, então foi feito a seguinte solução:

 - Passar todos os atributos da Entidade T_DADOS_MOTORISTA para a Entidade T_MOTORISTA.
 - Criação da anotação @SecondaryTable(name="T_DADOS_MOTORISTA").
 - Todos os atrbutos que vieram para Entidade T_MOTORISTA foram mapeados com a anotação @Column(table="T_DADOS_MOTORISTA") obrigatoriamente.

---


## Momento propaganda (brincadeira...)
Para você que usar apenas 1 monitor para fazer as coisas, ou se você ficou interessado, há uma dica que vou te passar.
> Você já conhece o navegador [Maxthon](http://www.maxthon.com/)? Ele é um navagador muito bom para quem usa apenas 1 tela e precisa dividir contéudo, por exemplo assistir ao vídeo que disponibilizei e programar ao mesmo tempo, ele tem um recurso chamado "Reproduzir em uma janela", segue as imagens da função em ação!

Como aparece para utlizar a função.
![maxthon_funcao_reproduzir_em_uma_janela](https://drive.google.com/open?id=1xMRoHI7-v38_n6Kg_57YMpca0sj3r-cE)


Demonstração da função.
[![maxthon_funcao_reproduzir_em_uma_janela_demonstracao](https://drive.google.com/open?id=1ZYFZk0RmkPkqZIvOsftbthEKOwb35nEk)]
