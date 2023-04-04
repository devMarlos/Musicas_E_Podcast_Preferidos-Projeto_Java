# Musicas_E_Podcast_Preferidos-Projeto_Java
Projeto feito para praticar meu conhecimento em programação orientada a objetos e seus pilares como herança, polimorfismo entre outros. 
Projeto desenvolvido no curso da alura

<br>

# Detalhes
Neste projeto implementei uma aplicação para cadastrar músicas ou podcasts preferidos, modelando as classes utilizando os conceitos de programação
orientada a objetos: abstração, herança, encapsulamento e polimorfismo.

<br>

# 🔨 Faça você também

<ul> 
  <li>Criar uma classe Audio com os atributos (titulo, totalReproducoes, totalCurtidas e classificacao). </li>
  <li>Utilizar encapsulamento, deixando os atributos privados e 
  criando os getters e setters para acessar e modificar os atributos. </li>
  <li>Criar dois métodos sem retorno: curte() e reproduz(), 
  que irão incrementar as variáveis totalCurtidas e totalReproducoes, respectivamente. </li>
  <li>Organizar o código em pacotes. </li>
  <li>Criar uma classe Musica estendendo de Audio, com os atributos adicionais album, cantor e genero. </li>
  <li>Criar uma classe Podcast estendendo de Audio, com os atributos adicionais apresentador e descricao. </li>
  <li>Criar uma classe Principal e instancie um objeto do tipo Musica e outro do tipo Podcast, 
  preenchendo seus atributos; </li>
  <li>Criar um loop para chamar os métodos curte() e reproduz() a fim de simular um número grande de reproduções e curtidas. </li>
  <li>Fazer uma sobrescrita do método getClassificacao na classe Musica, definindo que se a mesma tiver mais de 2000 reproduções a classificação será 10 e para valores inferiores a classificação será 8. </li>
  <li>Fazer uma sobrescrita do método getClassificacao na classe Podcast, definindo que se o mesmo tiver mais de 500 curtidas a classificação será 10 e para valores inferiores, a classificação será 7. </li>
  <li>Criar uma classe chamada MusicasPreferidas ou apenas Preferencias, com um método sem retorno (void) chamado inclui, que receberá como parâmetro um Audio. </li>
  <li>No método inclui, trabalharemos o polimorfismo, onde iremos utilizar o getClassificacao (de acordo com a subclasse que for passada aqui como parâmetro) para exibir alguma mensagem. Para classificação igual ou superior a 9, iremos imprimir no terminal uma mensagem e se for inferior, imprimiremos uma outra mensagem. </li>
  <li>Finalizar instanciando um objeto do tipo MusicasPreferidas ou Preferencias e incluindo a música e podcast instanciados anteriormente. </li>
</ul>

<br>

Exemplo/Sugestão de mensagem a exibir para classificação superior ou inferior a 9.

<b>Deixe-me-ir é considerado sucesso absoluto e um dos títulos preferidos da galera!
Dia a dia de um programador é um dos títulos que todo mundo está curtindo. Não deixe de ouvir também</b>
<br>
<br>
Bom desafio!
