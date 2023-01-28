package br.com.possoler.api.api_posso_ler.site.constants.i18n.pt_br;

import lombok.Getter;

public enum br_BlocoPerguntasEnum {
    LABEL_PERGUNTAS_FREQUENTES("Perguntas frequentes"),
    LABEL_1("Como o \"Posso Ler?\" remove os bloqueios?"),
    LABEL_2("Mas isso não é ilegal ou imoral?"),
    LABEL_3("Como faço para reportar um bug ou dar uma sugestão/feedback?"),
    LABEL_4("O que é Cache Mock"),
    LABEL_5("Observações sobre o Cache Mock"),
    LABEL_6("E se sair uma atualização, como vou ficar sabendo?"),
    LABEL_7("O site entrou em manutenção, e agora?"),
    LABEL_8("O que é a Chave de Acesso e pra que ela serve?"),
    LABEL_9("Qual é o problema de usar uma cópia disponibilizada por terceiros?"),
    LABEL_10("E se eu usar uma cópia disponibilizada por terceiros?"),
    LABEL_11("Como o \"Posso Ler?\" remove os bloqueios?"),
    LABEL_12("Logo após todo o conteúdo da página ser carregado e renderizado, o script realiza manipulação da "),
    LABEL_13("DOM"),
    LABEL_14(" para mudar as propriedades dos elementos da página e excluir todos os bloqueios exibidos para o usuário não assinante. Dentre essas alterações, estão remoções de scripts dentro da página que são responsáveis por esses bloqueios."),
    LABEL_15("Mas isso não é ilegal ou imoral?"),
    LABEL_16("Como dito anteriormente, todas as modificações feitas pela extensão ocorrem na DOM (somente na exibição de cada site no respectivo aparelho em que está sendo acessado). Desta forma, a ferramenta não utiliza nenhum método de roubo ou violação de dados, como por exemplo, invadir um banco de dados protegido para ter acesso a tal informação para disponibilizá-la. O que ela faz, é somente mudar o modo de exibição da informação "),
    LABEL_17("já fornecida pelos sites"),
    LABEL_18(" de forma que os usuários consigam vê-las sem nenhum bloqueio de exibição."),
    LABEL_19("As empresas responsáveis pelos sites poderiam adotar outras formas mais eficazes para o bloqueio da exibição da informação, como por exemplo, verificar primeiro se o usuário está logado com sua conta de assinante, e caso positivo, disponibilizar o conteúdo. Contudo, há um grande problema em fazer isso, pois, adotando esse método, as empresas teriam que abrir mão do "),
    LABEL_20("SEO"),
    LABEL_21(" (conjunto de técnicas que têm como objetivo posicionar uma ou mais páginas de destino entre os melhores resultados dos motores de pesquisa.)"),
    LABEL_22("LEMBRE-SE: "),
    LABEL_23("Os jornais precisam pagar seus funcionários e as assinaturas são uma fonte de renda para isso. Ao usar o \"Posso Ler?\" "),
    LABEL_24("NÃO USE"),
    LABEL_25(" Ad blockers, pois os jornais também necessitam de uma fonte de renda para manter seu funcionamento."),
    LABEL_26("Como faço para reportar um bug ou dar uma sugestão/feedback?"),
    LABEL_27("Caso tenha encontrado algum bug ou queira dar uma sugestão/feedback, deixe seu recado na "),
    LABEL_28("seção de comentários"),
    LABEL_29(". Caso precise falar comigo com urgência ou em particular, escreva um email para "),
    LABEL_30("thomazf.dev@gmail.com"),
    LABEL_31(". Tentarei responder o mais rápido possível, pois estarei ocupado me dedicando à faculdade e ao meu serviço."),
    LABEL_32("O que é Cache Mock?"),
    LABEL_33("Cache Mock"),
    LABEL_34(" (Simulação por Cache) é uma técnica que desenvolvi para conseguir burlar "),
    LABEL_35("de forma legal"),
    LABEL_36(" alguns sites que utilizam "),
    LABEL_37("hard paywall"),
    LABEL_38(". Essa técnica se define em utilizar o "),
    LABEL_39("cache"),
    LABEL_40(" da própria página gerado pelo Google e, partir dela, pegar todo o conteúdo e renderizá-lo para o usuário. Como o "),
    LABEL_41("cache"),
    LABEL_42(" é uma \"cópia\" do conteúdo estático de uma página, geralmente estas não possuem nenhum tipo de bloqueio de conteúdo, possibilitando o acesso a eles."),
    LABEL_43("Observações sobre o Cache Mock"),
    LABEL_44("Alguns sites utilizam proteção de "),
    LABEL_45("hard paywall"),
    LABEL_46(" em seus conteúdos. Geralmente, conteúdos com esse nível de proteção ficam armazenados no servidor e só são renderizados na tela do usuário (cliente) quando o sistema tem a certeza de que o mesmo se encontra logado em sua conta de assinante. A solução encontrada para contornar este caso, foi utilizar o cache da página gerado pelo Google, como foi explicado no tópico acima. Contudo, caso a notícia seja muito recente, é capaz do cache da página em questão não ter sido gerado ainda, e caso esse seja o ocorrido, ao tentar desbloquear a notícia, a extensão informará a você por um pop-up que "),
    LABEL_47("não foi possível desbloquear o conteúdo no momento e que você poderá tentar mais tarde"),
    LABEL_48(". Ou seja, nem sempre será possível desbloquear todos os conteúdos. Pode ocorrer também da "),
    LABEL_49("API"),
    LABEL_50(" que faz a conexão entre a extensão e o cache "),
    LABEL_51("ficar indisponível"),
    LABEL_52(" devido ao excesso de requisições feitas a partir de um mesmo "),
    LABEL_53("endereço de IP"),
    LABEL_54(" (Isso é uma medida de segurança por parte da Google a fim de evitar "),
    LABEL_55("ataques DDoS"),
    LABEL_56(". Caso isso ocorra ao tentar desbloquear uma notícia, em uma das etapas do desbloqueio, aparecerá um  "),
    LABEL_57("reCAPTCHA"),
    LABEL_58(" e o processo será interrompido. Para retomá-lo, basta resolver o "),
    LABEL_59("reCAPTCHA"),
    LABEL_60("Ponto de atenção: "),
    LABEL_61("Por se tratar de dados obtidos à partir do cache, o conteúdo apresentado pode estar desatualizado em relação a página original caso a mesma tenha sofrido alguma alteração após a última geração de cache feita pelo Google."),
    LABEL_62("E se sair uma atualização, como vou ficar sabendo?"),
    LABEL_63("Simples! A extensão faz uma verificação de atualização a cada vez que é executada. Quando uma atualização for disponibilizada para download, você será notificado com uma mensagem que aparecerá no canto superior de sua tela. Quando ela aparecer, é só clicar em \"Vamos lá\", e você será redirecionado ao site para baixar e instalar a versão mais recente do \"Posso Ler?\"."),
    LABEL_64("O site entrou em manutenção, e agora?"),
    LABEL_65("Manutenções são atividades comuns e necessárias na vida de um programador. Sempre temos novas ideias ou achamos coisinhas que precisam ser corrigidas ou melhoradas. Mas calma! Você não vai ficar na mão. Todos os usuários serão avisados com antecendência por meio de um sistema de notificações que criei e implementei. Então enquanto o site estiver em manutenção, você poderá relaxar e continuar lendo suas notícias ou estudando, pois a extensão não deixará de funcionar. Assim que a manutenção for concluída, será disparado para todos os usuários uma mensagem informando que o site está de volta!"),
    LABEL_66("O que é a Chave de Acesso e para que ela serve?"),
    LABEL_67("A "),
    LABEL_68("chave de acesso"),
    LABEL_69(" é um "),
    LABEL_70("hash"),
    LABEL_71(" que identifica de forma única a extensão baixada. Essa chave de acesso é utilizada para assegurar a autenticidade da extensão, ou seja, ela garante que a extensão foi baixada diretamente do site oficial. Ela também impede que um usuário baixe cópias da extensão e as distribuam. Após instalar extensão, a chave de acesso será solicitada na primeira execução da extensão para a ativação da mesma. Depois que a extensão for ativada, "),
    LABEL_72("a chave de acesso se tornará inválida e poderá ser descartada."),
    LABEL_73("Observação:"),
    LABEL_74(" Caso o Tampermonkey ou o userscript ou a extensão sejam "),
    LABEL_75("desinstalados ou atualizados"),
    LABEL_76(", será necessário gerar novamente uma chave de acesso, pois uma vez utilizada, a chave de acesso se torna inválida."),
    LABEL_77("Qual é o problema de usar uma cópia disponibilizada por terceiros?"),
    LABEL_78("Ao usar uma cópia da extensão disponibilizada por terceiros, além de atrapalhar a divulgação do projeto original, você também corre o risco de estar instalando uma cópia modificada "),
    LABEL_79("com um código malicioso injetado"),
    LABEL_80(", podendo comprometer seus dados pessoais e informações sensíveis, como senhas e dados bancários."),
    LABEL_81("E se eu usar uma cópia disponibilizada por terceiros?"),
    LABEL_82("Caso você usar uma cópia disponibilizada por terceiros, ao tentar executar a extensão, será exibido um aviso informando que você está usando uma extensão com um hash já utilizado por outro usuário. Além disso, caso opte por usar uma cópia, ficarei bastante decepcionado com você. Anualmente, pago aproximadamente "),
    LABEL_83("R$800,00"),
    LABEL_84(" (quase 2/3 de um salário mínimo no Brasil) para deixar online esse site e as APIs que a extensão consome. Faço esse projeto totalmente gratuito para ajudar as pessoas, dedicando um tempo que poderia estar estudando para a faculdade ou para o meu trabalho, ou até mesmo descansando depois de um dia cansativo. Então pense com bastante carinho antes de optar por usar uma versão não oficial, beleza?");

    @Getter
    private String label;

    br_BlocoPerguntasEnum(String label) {
        this.label = label;
    }
}
