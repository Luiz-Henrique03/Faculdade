function ativ_03(){
    var num = window.prompt("Informe o numero: ");
    window.alert(`O numero informado pelo usuário foi ${num}. Antes do
    número ${num}, temos o número ${parseInt(num) - 1}. Após o número ${num}, temos o número ${parseInt(num) + 1}`)
}

function ativ_06(){
    var valor_reais = window.prompt("Informe o valor em reais ")
    var cotação_dolar = window.prompt("Informe a cotação do dolar ");
    var valor_dolares = valor_reais / cotação_dolar;

    document.getElementById("resultado").innerHTML = "Voce tem "+valor_dolares.toFixed(2)+" dolares";
}

function ativ_04(){
    var prod = window.prompt("Informe o produto: ");
    var preço = window.prompt("Informe o preço: ")
    var entrega = window.prompt("Informe o quanto você vai dar em dinheiro: ")
    var receba = entrega - preço

    window.alert(`Você comprou um produto ${prod} por R$ ${parseFloat(preço).toFixed(2)} e entregou ao
    vendedor R$ ${parseFloat(entrega).toFixed(2)} em dinheiro. Você vai receber R$ ${parseFloat(receba).toFixed(2)} de troco. Volte sempre!`)
}

function ativ_05(){
    var temp = window.prompt("Digite a temperatura: ")
    document.getElementById("temp").innerHTML = `Temperatura em Fahrenheit ${temp * (9/5) + 32}`
}