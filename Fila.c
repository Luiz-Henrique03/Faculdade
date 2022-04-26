#include <stdio.h>
#include <stdlib.h>

int num, topo, *fila, tam, controle, volta;
int rem;

void Enqueue(int n){
	fila[topo] = n;
    topo++; 
	volta = 1;
}

void Dequeue(){
	if(volta == 1){
		rem = topo - topo;
	}
	fila[rem] = 0;
	rem +=1;
	topo = 0;
}

int isEmpty(){
	if(topo == 0){
		printf("Vetor vazio");
		return 0;
	}
	return 1;
}

int isFull(){
	if(topo >= tam){
	printf("Vetor cheio");
	return 0;
}else{
	return 1;
}
}


int main(){
	int i,opc;
	printf("Digite o tamanho da fila: ");
	scanf("%d",&tam);
	fila = (int *) malloc(tam * sizeof(int));
	for(i = 0; i < tam; i++){
		if(fila[i] != num){
			fila[i] = 0;
		}
	}
	printf("Digite uma opcao: ");
    do{
    	printf("\n1 - Adicionar um elemento\n");
    	printf("2 - Remover um elemento\n");
    	printf("3 - Sair\n");
    	printf("4 - Listar elementos\n");
    	scanf("%d",&opc);
    	
    	switch(opc){
    		case 1:
    			if(isFull() != 0){
    			printf("Digite o numero: ");
    			scanf("%d",&num);
    			Enqueue(num);
				}
    			break;
    		case 2:
    			Dequeue();
    			break;
    		case 3:
    			return 0;
    		case 4:
    			for(i = 0; i < tam; i++){
    				printf("\n%d",fila[i]);
				}
		}
	}while(opc != 3);
}
