#include <stdio.h>

int fatorial(int n){
	if(n==0){
		return 1;
	}else{
		return n* fatorial(n-1);
	}
}

int main(){
	int num;
	
	printf("Digite um numero: ");
	scanf("%d",&num);
	
	
	printf("Fatorial de %d! = %d",num,fatorial(num));
}
