
function ex_05(atv){
    var elemento = document.createElement("li")
    
    var texto = document.createTextNode(document.getElementById("cidade").value)

    elemento.appendChild(texto)

    var lista = document.getElementsByTagName("ol")[0]

    lista.appendChild(elemento)
    console.log(lista)

    if(atv == '1'){
        elemento.style.color="red"
    }
}
