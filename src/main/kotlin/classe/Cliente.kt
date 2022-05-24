package classe

class Cliente constructor(private val nome: String) {

    init {

        if (nome == "") {

            throw Exception("A classe foi instanciada de maneira incorreta!")

        }

    }

    var telefone = ""
    var endereço = ""
    val listaProdutos = mutableListOf<String>()


    constructor(nome: String, telefone: String, endereço: String) : this(nome) {

        this.telefone = telefone
        this.endereço = endereço

    }

    fun addProduto(produto: String) {

        if (produto != "") {

            listaProdutos.add(produto)
            println("Produto adicionado com sucesso!")

        } else {

            println("Digite algum produto antes de adiciona-lo ")

        }

    }

    fun removerProduto(produtoDigitado: String) {

        if (listaProdutos.contains(produtoDigitado)) {

            listaProdutos.remove(produtoDigitado)

            println("Produto removido com sucesso!")

        } else {

            println("O produto digitado não contém na lista!")
        }
    }

    fun mostrarProdutos() {


        listaProdutos.forEach{
            println(it)

        }

    }

}




