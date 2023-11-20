# MC322

Curso de Programação Orientada a Objetos na UNICAMP, 

feito em dupla com @RaphaelSVSouza.

### OBS: foram utilizados os princípios SOLID neste sistema. Como por exemplo:
 
## S: Single Responsibility Principle

-  **O que?** 

	Como o nome sugere, de acordo com esse princípio cada classe deve ter uma única responsabilidade principal.
	
- **Por que?**

	Usamos esse princípio pois ele torna o programa devidamente modular, logo evitando excesso de acoplamentos que poderiam tornar o sistema mais complexo, além do fato de que sempre que precisarmos alterar uma classe, só faremos isso com um único propósito, o que facilita possíveis refatorações.
- **Como?**

	Analisamos a função principal da classe e tornamos elas exclusivas para aquela função. Alguns exemplo: as classes Empréstimo, Devolução, Renovação e Reserva apenas registram as informações de suas respectivas operações, enquanto EmpréstimoService, DevoluçãoService, RenovaçãoService e ReservaService executam de fato as operações.

## O: Open-Closed Principle

-  **O que?** 

	Esse princípio diz que as classes devem ser abertas para expansões sem que isso afete o seu funcionamento prévio. 
	
- **Por que?**
	
	Dessa forma, caso o cliente solicite novas funcionalidades, não será necessário refatorações no que já foi feito, deixando o trabalho apenas para a nova implementação.
	
- **Como?**
	
	Na biblioteca, um exemplo sólido de aplicação desse princípio é o uso de heranças e polimorfismo ao representar os itens, como a criação de novos tipos de exemplares físicos, como livros ou DVDs, que foram implementados sem que fosse preciso alterar os contratos da superclasse ExemplarFisico.

## L: Liskov Substitution Principle

-  **O que?** 

	 Segundo ela, todo objeto de uma classe filha deve ser capaz de exercer a mesma funcionalidade do que um objeto de sua classe pai. 
	 
- **Por que?**

	Usamos a Liskov Substitution para garantirmos que as abstrações do sistema estejam corretas, principalmente em relação às heranças, como no exemplo dado anteriormente no "princípio O".
	
- **Como?**

	Aplicamos esse princípio principalmente através do desenvolvimento correto das heranças. Um exemplo que tira proveito disso é a estrutura de dados ItemBiblioteca, em que nele podemos utilizar qualquer itemMultimidia, ou seja, filhos dessa classe.

## I: Interface Segregation Principle

-  **O que?** 

	Pode-se dizer que este princípio é um reflexo dos três últimos princípios, porém aplicado à interfaces. Sua definição diz que uma classe não deve ser forçada a implementar interfaces que ela não utiliza.
- **Por que?**

	Ela é implementada para evitar interfaces mal dimensionadas, que forçam as classes a implementarem métodos que não são relevantes para elas. Isso contribui para uma melhor coesão no código, o que facilita muito o entendimento de todos os programadores envolvidos no desenvolvimento.
- **Como?**

	Definimos interfaces mais específicas, contendo apenas os métodos relevantes para as classes que a implementam. Alguns exemplo são as interfaces do package Controller, em que Biblioteca, Membro e Relatorio possuem uma interface cada.
