var jogador1 = 0;
var jogador2 = 1;
var placar;

//if ternário
if (jogador1 != -1 || jogador2 != -1 ? console.log('os jogadores são válidos') : console.log('jogadores invalidos')) {
    //if
    if (jogador1 > 0) {
        console.log('Jogador 1 marcou ponto!');
    //else if    
    }else if (jogador2 > 0) {
        console.log('Jogador 2 marcou ponto!');
    //usando else    
    } else {
        console.log('Ninguém marcou ponto!');
    }
}

//switch
switch (placar) {
    case placar = jogador1 > jogador2:
        console.log('jogador 1 ganhou');
        break;
    case placar = jogador2 > jogador1:
        console.log('jogador 2 ganhou');
        break;
    default:
        console.log('Ninguém ganhou')           
}

let array = ['valor1', 'valor2', 'valor3', 'valor4', 'valor5',];

let object = {propriedade1: 'valor1', propriedade2: 'valor2', propriedade3: 'valor3'}

//for
for (let indice = 0; indice < array.length; indice++) {
    console.log(indice);
} 
//for c/ array
for (let i in array) {
    console.log(i);
}
//for c/ objeto
for (i in object) {
    console.log(i);
}

for(i of array) {
    console.log(i);
}

for (i of object.propriedade1) {
    console.log(i);
}

//while
var a = 0;
while (a < 10 ) {
    a++;
    console.log(a);
}

//do while
do {
    a++;
    console.log(a);
} while(a < 10);