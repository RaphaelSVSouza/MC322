# MC322

Curso de Programação Orientada a Objetos na UNICAMP, 

feito em dupla com @RaphaelSVSouza.

### OBS: foram utilizados os princípios SOLID neste sistema. Como por exemplo:
 
## S: Single Responsibility Principle

-  **Por que?** 

	Usamos esse princípio pois ele torna o programa devidamente modular, logo evitando excesso de acoplamentos que poderiam tornar o sistema mais complexo, além do fato de que sempre que precisarmos alterar uma classe, só faremos isso com um único propósito, o que facilita possíveis refatorações.
- **Como?**

	Analisamos a função principal da classe e tornamos elas exclusivas para aquela função. Alguns exemplo: as classes Empréstimo, Devolução, Renovação e Reserva apenas registram as informações de suas respectivas operações, enquanto EmpréstimoService, DevoluçãoService, RenovaçãoService e ReservaService executam de fato as operações.
	
## O: Open-Closed Principle

-  **Por que?** 

	Esse princípio diz que as classes devem ser abertas para expansões sem que isso afete o seu funcionamento prévio. Dessa forma, caso o cliente solicite novas funcionalidades, não será necessário refatorações no que já foi feito, deixando o trabalho apenas para a nova implementação.
	
- **Como?**
	
	Na biblioteca, um exemplo sólido de aplicação desse princípio é o uso de heranças e polimorfismo ao representar os itens, como a criação de novos tipos de exemplares físicos, como livros ou DVDs, que foram implementados sem que fosse preciso alterar os contratos da superclasse ExemplarFisico.