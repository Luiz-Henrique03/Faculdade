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

function exer5(){
    var num = window.prompt("Informe um numero");

    if(num %3==0 && num%2==0){
        document.getElementById("res").innerHTML = "Numero divisivel por 2 e por 3"
    }else{
        document.getElementById("res").innerHTML = "Número informado não divisível por 2 e por 3"
    }

}

function exer6(){
    var num = window.prompt("Informe um numero");

    if(num %7==0 || num%2==0){
        document.getElementById("res").innerHTML = "Numero divisivel por 2 ou por 7"
    }else{
        document.getElementById("res").innerHTML = "Número informado não divisível nem por 2 e nem por 7"
    }

}

function exer7(){
    var dia = window.prompt("Informe o número de um dia")
    switch(dia){
        case '1':
            document.getElementById("dia").innerHTML="Domingo"
            break;
        case '2':
             document.getElementById("dia").innerHTML="Segunda-Feira"
             break;
         case '3':
            document.getElementById("dia").innerHTML="Terça-Feira"
            break;
        case '4':
            document.getElementById("dia").innerHTML="Quarta-Feira"
            break;
        case '5':
            document.getElementById("dia").innerHTML="Quinta-Feira"
            break;
        case '6':
            document.getElementById("dia").innerHTML="Sexta-Feira"
            break;
        case '7':
            document.getElementById("dia").innerHTML="Sábado"
            break;
        default:
            document.getElementById("dia").innerHTML="Informe um dia correto"
            break;                                      
    }
}

function exer8(){
    var soma=0;

    for(i = 0; i < 20; i++){
        if(i%2==0){
            parseInt(soma+=i)
        }
    }
    document.getElementById("soma").innerHTML = soma
}

function exer9(){
var multi = window.prompt("Digite um número")

for(i=1; i <= 10; i++){
    document.getElementById("res"+i).innerHTML= `O resultado de ${multi} x ${i} é: ${parseInt(multi * i)} \n`
}
}
