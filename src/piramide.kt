fun piramide() {

    println("Selecione o simbolo que a pirâmide será feita: ");
    var simbolo = pegarSimbolo();
    println();

    println("Quantidade de linhas da pirâmide: ");
    var linhasQtd = pegarQuantidadeDeLinhas();
    println();

    var linhaAtual = 1;
    var linha = simbolo;

    while (linhaAtual <= linhasQtd) {
        println(linha);
        linha += simbolo;
        linhaAtual++;
    }
}

fun pegarSimbolo(): String {
    return readLine()!!.toString();
}

fun pegarQuantidadeDeLinhas(): Int {
    while (true) {
        runCatching { readLine()!!.toInt(); }
            .onFailure { println("Por favor! Insira um número: "); }
            .onSuccess { return it; }
    }
}