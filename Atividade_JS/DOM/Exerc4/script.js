
function ex_04(atv){
    var elemento = document.createElement("li")
    
    var texto = document.createTextNode(document.getElementById("tarefa").value)

    elemento.appendChild(texto)

    var lista = document.getElementsByTagName("ol")[0]

    lista.appendChild(elemento)
    console.log(lista)

    if(atv == '1'){
        elemento.style.color="red"
    }
}
