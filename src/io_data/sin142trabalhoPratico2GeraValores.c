// Para compilar:
// gcc sin142trabalhoPratico2GeraValores.c -o sin142trabalhoPratico2GeraValores.out

#include<stdio.h>
#include<stdlib.h>

# define sizeOfVet 1000

void printVet(int seed, int modifier, char fileName[], char openfile[]) {
    FILE *fp;
    fp = fopen(fileName, openfile);

    for(int i = 0; i < sizeOfVet; i++) {
        // views likes dislike
        fprintf(fp, "%d %d %d\n", modifier * (rand() % sizeOfVet), modifier * (rand() % sizeOfVet), modifier * (rand() % sizeOfVet));
    }

    fclose(fp);
}

int main() {
    int seed = 5153 + 5222 + 5155 + 5210 + 5188; // Alterar para a soma das matrículas dos integrantes
    srand(seed); // Inicializa a semente para gerar números pseudo alteatórios
    // modifier = 10 => atualizarValores
    printVet(seed, 10, "atualizarValores.txt", "w");
    // modifier = 1 => diminuirValores
    printVet(seed, 1, "diminuirValores.txt", "w");
    return 0;
}
