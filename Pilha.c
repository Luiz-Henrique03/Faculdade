#include <stdio.h>
#include <stdlib.h>

int tam, topo,capa;



void push(int *pilha, int c){
	topo++;
	pilha[topo] = c;
}


int estacheio(){
 if(topo >= tam){
 	return 1;
 	printf("\nPilha chei\n");
 }
}


int estavazio(){
 if(topo == -1){
 	return 1;
 }
}

float pop (int *pilha){

   float aux = pilha[topo];
   topo--;
   return aux;
}



int main(){
	
	int esc,aux,i,num;
	
	printf("Digite o tamanho da pilha: ");
	scanf("%d",&tam);
	int vet[tam];
	do{	
	printf("\n1-Adicionar elemento na pilha.");
	printf("\n2-Remover elemento da pilha");
	printf("\n3-Mostrar o primeiro elemento da pilha");
	printf("\n4-Mostrar o último elemento da pilha");
	printf("\n5-Buscar elemento na pilha");
	printf("\n6-Listar os elemento da pilha");
	printf("\n7-Sair\n");

	scanf("%d",&esc);
	
    switch(esc){
    	case 1:
    	   if(estacheio() == 1){
    	   	  printf("Esta cheio");
    	   	  break;
		   }
    		printf("Digite o numero a ser colocado na pilha\n ");
    		scanf("%d",&num);
    		push(vet,num);
    	
    		break;
    	case 2:
    		if(estavazio() == 1){
    			  printf("Esta vazio");
    	   	  break;
			}
    		pop(vet);
    	
    		break;
    	case 3:
    			if(estavazio() == 1){
    			  printf("Esta vazio");
    	   	  break;
			}
			printf("Primeiro elemento : %d",vet[1]);
			
			break;
		case 4:
				if(estavazio() == 1){
    			  printf("Esta vazio");
    	   	  break;
			}
			printf("ultimo elemento : %d",vet[topo]);
			
			break;
		case 5:
	    	if(estavazio() == 1){
    			  printf("Esta vazio");
    	   	  break;
			}
			printf("Digite um numero a ser procurado ");
			scanf("%d",&aux);
			
			for(i = 0;i < tam; i++){
				if(vet[i] == aux){
					printf("Numero achado na posicao: %d",i+1);
				}
			}
			
			break;
		case 6:	
			for(i = 0;i < topo; i++){
			
					printf(" \n\n%d\n ",vet[i+1]);
				
			}
		
			break;
		case 7:
			return 0;
		default:
			printf("Digite um numero que condiz com as opcoes");
			
		
		}
			
	}while(esc != 7);
}
  
	
	
	
	
	
	
	

