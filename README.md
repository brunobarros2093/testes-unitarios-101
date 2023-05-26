# Testes com Java e Spring 101



Repositório de estudos sobre testes unitários em Java com jUnit 5, testes integrados, test container etc no contexto do spring boot e APIs. 
#### Seguindo o 'livro vermelho' do TDD, `TDD by Example` 

- Capitulo 1 ao 4: Implementação da classe dollar e pilares de testes (fail, make it work, refactor) (red, green, better)
- Capitulo 5: Adicionado a moeda Franco e usado o mesmo código do Dollar (repetição de código: ruim)
- Capitulo 6-7: Fala sobre privacidade dos campos, tornando o `amount` private, quebrando o teste, refatora para funcionar. 
- Capitulos 8-10: Abstraído métodos para a classe Money para remover ainda mais os métodos duplicados nas classes filhas, mesmo com herança
- Capitulo 11 `root of all evil` : novamente, fala sobre duplicação de código. Nesta etapa, excluimos as classes Dollar e Franc, pois ficaram obsoletas/inuteis quando extraímos os métodos delas para a unica classe chamada 'Money', que por si só pode representar as duas moedas (ou mais).

