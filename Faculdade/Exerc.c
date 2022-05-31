#include <stdio.h>

/*
void linha(int n){
	int i;
	for( i=0;i<=n; i++){
		printf("*");
	}
}

int main(){
	int num;
	printf("Digite um numero: ");
	scanf("%d",&num);
	linha(num);
}
*/

/*
int Soma(int n1, int n2){
	int i=0,soma=0;
	for( i=n1+1;i<n2; i++){
		soma+=i;
	}
	return soma;
}

int main(){
	int num, num2, res;
	printf("Digite um numero: ");
	scanf("%d",&num);
	printf("Digite um outro numero: ");
	scanf("%d",&num2);
	res = Soma(num,num2);
	printf("Sooma entre eles: %d",res);
}
*/

/*
void aste(int n){
	int i,j;
	for(i=0;i<n;i++){
		for(j=0;j<=i;j++){
			printf("*");
		}
		printf("\n");
	}
}

int main(){
	int num;
	printf("Digite um numero ");
	scanf("%d",&num);
	aste(num);
}
*/

int pot(int x, int y){
	if(y==0){
		return 1;
	}else{
		return x * pot(x,y-1);
	}
}
int main(){
	int num,y;
	printf("Digite um numero ");
	scanf("%d",&num);
	printf("Digite a potencia ");
	scanf("%d",&y);
	printf("Resulatdo: %d",pot(num,y));
}

