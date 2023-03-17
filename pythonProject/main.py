from flask import Flask,render_template,jsonify,request
from random import randint

app = Flask(__name__)
app.debug = True

@app.route('/')
def principal():
    return 'Gainward'

@app.route('/teste')
def test():
    return render_template("teste.html")

@app.route('/pessoa/<string:nome>/<string:idade>')
def pessoa(nome,idade):
    return jsonify({'nome':nome,'idade':idade})

@app.route('/jogo', methods = ['GET','POST'])
def jogo():
    if request.method == "GET":
        return render_template("jogo.html")
    else:
        numero = randint(1,10)
        palpite = int(request.form.get("name"))

        if numero == palpite:
            return '<h1>Acertou</h1>'
        else:
            return  '<h1>ERRRRRRRRRROUUUU</h1>'

@app.route('/<string:nome>')
def erro(nome):
    variavel = f'pagina {nome} nao encontrada'
    return  render_template("erro.html", varialvel_html = variavel)

app.run()

