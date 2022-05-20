function exer1(){
    var num1 = window.prompt("Digite o primeiro numero: ");
    var num2 = window.prompt("Digite o segundo numero: ");
    
    if(num1 > num2){
        document.getElementById("p").innerHTML  = `${num2} ${num1}`
    }else{
        document.getElementById("p").innerHTML  = `${num1} ${num2}`
    }
}

function exer2(){
    var alt = window.prompt("Digite a altura ")
    var gen; 
    do {
        gen = window.prompt("Digite o genero(M/F) ")

    } while (gen.toUpperCase() !="M" && gen.toUpperCase() != "F");

    if(gen.toUpperCase() == "M"){
        document.getElementById("p").innerHTML = `Peso ideal: ${72.7 * parseFloat(alt) - 58}`
    }else if(gen.toUpperCase() == "F"){
        document.getElementById("p").innerHTML = `Peso ideal: ${62.1 * parseFloat(alt) - 44.7}`
    }
}
    

function exer3(){
    var num1 = Number(window.prompt("Digite o 1º numero"))
    var num2 = window.prompt("Digite o 2º numero")
    var num3 = window.prompt("Digite o 3º numero")
    var menor = num1
    if(menor > num2){
        menor = num2;
    }
    if(menor > num3){
        menor = num3;
    }

    document.getElementById("p").innerHTML = menor;
}

function exer4(){
    var num = window.prompt("Digite um numero")

    if(num > 0 ){
        if(num %2==0){
            document.getElementById("p")
        }
    }
}