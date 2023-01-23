import Classes.Clientes;

/*
    Projeto final:
	Após ter construído o nosso projeto se baseando no diagrama de classe feito em aula, é hora de testá-lo, na sua classe main,
	que aqui, utilizaremos ela para validar os retornos dos métodos, faça o seguinte:
    Crie o objeto Petshop OK
    Crie no mínimo dois cliente, com pelo menos um deles tendo mais do que um pet OK

    Testes com o cliente que tem apenas um pet:
    Chame o método atendimentoClinico do petshop, e faça-o retornar no campo observações o pedido do médico para o pet tomar a vacina X OK
    Valide se o retorno do método atendimentoClinico possui o id do serviço, o serviço prestado, o valor e valide principalmente, se há no campo observação do animal, o pedido do médico para a vacina
    Chame o método vacinação do pet shop, e faça o pet tomar a vacina pedido no retorno do atendimentoClinico
    Valide se o retorno do método vacinação possui o esquemaVacinal do pet preenchido com o vacina que foi pedida, o id, o serviço prestado e o valor
    Chame o método higienizar do petshop, e faça-o retornar no campo estado do animal, um valor referente ao serviço prestado ex: se chamou o método apenas pedindo para dar banho, o animal deverá estar limpo no retorno do método
    Valide se o retorno do método higienizar possui id, serviço, preço e se o estado do animal está equivalente ao serviço pedido
    Chame os métodos verRemedio e verAlimentos
    Por último, passe para o método pagamentos, a lista de todos os ids do serviços utilizados mais pelo menos 1 remédio e 1 alimento e valide se a soma dos valores do pedido do cliente está correta

    Testes com o cliente que tem dois ou mais pets:
    repita o todos os fluxos feitos para o cliente com apenas um pet para o que tenha dois, fazendo a seguinte alterações:
    no método atendimentoClinico coloque uma observação diferente para cada animal do cliente (cada animal do cliente deve receber uma vacina diferente para esse caso de testes)
    no método vacinação, vc deve vacinar cada animal conforme pedido no atendimentoClinico e deve checar no retorno o esquemaVacinal de cada animal e constatar a vacina correta em cada um
    Chame os métodos verRemedio e verAlimentos
    Por último, faça  a mesma validação para o método pagamentos ( a lista de todos os ids do serviços utilizados mais pelo menos 2 remédio e 2 alimento e valide se a soma dos valores do pedido do cliente está correta ) lembre se que se foi enviado dois animais para qualquer serviço, o valor será o dobro do serviço feito apenas para um animal

    Problemas:
    criação de listas dos produtos remedio e alimentos
    padronização dos ids preços

* */

import Classes.Cachorro;
import Classes.Gato;
import Classes.EsquemaVacinal;
import Enum.Porte;
import Enum.EstadoAnimal;
import ReponseVO.ResponseVO;


import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PetShop petshop = new PetShop();

        Cachorro rex = new Cachorro();
        rex.setNome("Rex");
        rex.setNascimento(LocalDate.parse("2023-01-01"));
        rex.setRaca("SRD");
        rex.setPorte(Porte.MEDIO);
        rex.setPeso(1.0);
        rex.setObservacoes("");
        rex.setEstadoAnimal(EstadoAnimal.NORMAL);
        rex.setVacinas(null);

        Clientes cliente1 = new Clientes();
        cliente1.setNome("Roberto");
        cliente1.setId(1);
        cliente1.pets.add(rex);

        Cachorro princesa = new Cachorro();
        princesa.setNome("princesa");
        princesa.setNascimento(LocalDate.parse("2020-05-01"));
        princesa.setRaca("pinscher");
        princesa.setPorte(Porte.PEQUENO);
        princesa.setPeso(3.0);
        princesa.setObservacoes("");
        princesa.setEstadoAnimal(EstadoAnimal.SUJO);
        princesa.setVacinas(null);

        Gato thor = new Gato();
        thor.setNome("thor");
        thor.setNascimento(LocalDate.parse("2018-04-01"));
        thor.setRaca("Persa");
        thor.setPorte(Porte.MEDIO);
        thor.setPeso(5.0);
        thor.setObservacoes("");
        thor.setEstadoAnimal(EstadoAnimal.NORMAL);
        thor.setVacinas(null);

        Clientes cliente2 = new Clientes();
        cliente2.setNome("Bruno");
        cliente2.setId(2);
        cliente2.pets.add(princesa);
        cliente2.pets.add(thor);

        ResponseVO atendimentoClinico = petshop.atendimentoClinico(cliente1, cliente1.pets, cliente1.pets.get(0).getObservacoes());

        System.out.println(atendimentoClinico);
    }
}