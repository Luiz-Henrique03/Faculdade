#include <stdio.h>
#include <stdbool.h>

/*
    ----------------Atividade 1 -----------------------
    
int main(){
	int vet[] = {1,2,45,12,23,17,8,9,6,10};
	int i, x;
	bool encontrado = false;
	
	printf("\nDigite um valor: ");
	scanf("%d",&x);
	
	for(i = 0; i < 10; i++){
		if(vet[i] == x){
			encontrado = true;
		}
	}
	
	if(encontrado){
		printf("\nValor encontrado\n");
	}else{
		printf("\nValor nao encontrado\n");
	}
	
}
*/

/*
---------------------------Atividade 2 ------------------------------
int main(){
	
	int vet[] = {1,7,45,12,23,7,8,9,6,6};
	int i, x,indice[10],enc=0;
	bool encontrado = false;
	
	printf("\nDigite um valor: ");
	scanf("%d",&x);
	
	for(i = 0; i < 10; i++){
		if(vet[i] == x){
			encontrado = true;
			indice[enc] = i;
			enc++;
		}
	}
	
for(i = 0; i < 10; i++){
	if(encontrado && indice[i] < 10 && indice[i] != 0){
		printf("\nValor encontrado na(s) posicao(oes): %d\n",indice[i]);
	}else if(!encontrado){
		printf("\nValor nao encontrado\n");
		break;
	}
}	

		
}

*/

/*
 ------------------- Atividade 3 -----------------------------------
int main(){
	int i, x, esquerda, direita,meio;
	int vet[] = {0,1,2,3,4,5,6,7,8,9.10,11,12,13,14};
	bool encontrado = false;
	
	printf("\nDigite um numero\n");
	scanf("%d",&x);
	
	esquerda = 0;
	direita = 9;
	meio = (esquerda + direita) / 2;
	
	while(encontrado != true && esquerda <= direita){
		if(vet[meio] == x){
			encontrado = true;
		}else{
			if(x > vet[meio]){
				esquerda = meio + 1;
			}else if(x < vet[meio]){
				direita = meio - 1;
			}
		}
		meio = (esquerda + direita) / 2;
	}
	
	if(encontrado){
		printf("Valor encontrado");
	}else{
		printf("Valor nao encontrado");
	}
}

*/

/*
-------------------------------- Atividade 4 ------------------------
int main(){
	int i, x, esquerda, direita,meio;
	int vet[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	bool encontrado = false;
	
	printf("\nDigite um numero\n");
	scanf("%d",&x);
	
	esquerda = 0;
	direita = 15;
	meio = (esquerda + direita) / 2;
	
	while(encontrado != true && esquerda <= direita){
		printf("Valores descartados na busca: %d\n", direita - meio);
		if(vet[meio] == x){
			encontrado = true;
		}else{
			if(x > vet[meio]){
				esquerda = meio + 1;
			}else if(x < vet[meio]){
				direita = meio - 1;
			}
		}
		meio = (esquerda + direita) / 2;
	}
	
	if(encontrado){
		printf("Valor encontrado");
	}else{
		printf("Valor nao encontrado");
	}
}
*/


/*
=------------------------------- Atividade 5 -------------------------------=

Para iniciarmos a busca pegaremos o tamanho do vetor(18) e vamos dividir por 2, com isso vamos para o índice 9, 
esquerda vai receber  9 + 1 o valor do meio vai ser 10, precisa de mais uma iteraçãopara que o emio receba o valor 11 cujo indice possuí o valor de 100.  seriam
feitas 5 comparações sequencial seria 11 comparações 

*/

/*
-------------------------------- Atividade 6 --------------------------------

Falso

*/

/*
-------------------------------- Atividade 7 --------------------------------

Verdadeiro

*/

