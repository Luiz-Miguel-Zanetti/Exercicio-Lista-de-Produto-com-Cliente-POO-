import classe.Cliente

fun main() {

    /*

    Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos mais duas opções de
    construtores conforme sua percepção, com os atributos: nome (String),
    endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

   A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
   Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio
   jogue uma exceção. Ao instanciar a classe cliente na função main(),
   não esquecer de colocar dentro de um bloco try catch.

     */
    print("Digite seu nome: ")
    val nome = readln()

    print("Digite seu endereço: ")
    val endereço = readln()

    print("Digite seu telefone: ")
    val telefone = readln().toString()

    val cliente = Cliente(nome, telefone, endereço)

    try {

        while (true) {

            println("1- Adicionar novo produto")
            println("2- Remover produto")
            println("3- Mostrar produtos")
            println("4- Finalizar cadastro")
            println("Qual das quatro opçoes deseja escolher?")
            val opçãoEscolhida = readln().toInt()

            when (opçãoEscolhida) {

                1 -> {

                    println("Digite o nome do produto que deseja adicionar: ")
                    val produtoDigitado = readln()
                    cliente.addProduto(produtoDigitado)

                }

                2 -> {

                    println(cliente.mostrarProdutos())
                    println()
                    println("Digite o nome do produto que deseja remover: ")
                    val produtoDigitado = readln()
                    cliente.removerProduto(produtoDigitado)


                }

                3 -> {

                    println()
                    cliente.mostrarProdutos()

                }

                4 -> {

                    println()
                    println("Compra finalizada!")
                    break

                }


            }


        }

    } catch (e: Exception) {
        e.message


    }


}