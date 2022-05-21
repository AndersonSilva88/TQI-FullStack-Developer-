

//boolean
var vOuf = false;
console.log(typeof(vOuf));

//number
var numeroQualquer = 1;
console.log(typeof(numeroQualquer));

//string
var nome = 'anderson';
console.log(typeof(nome));

//declarando variaveis
var variavel = 'anderson';
variavel = 'oliveira';
console.log(variavel);

//constante
const constante = 'ola';
//constante = 'oi'
console.log(constante);

//escopo global
var escopoglobal = 'global';
console.log(escopoglobal);

function escopolocal() {
    let escopoLocalInterno = 'local';
    console.log(escopoLocalInterno);
}

escopolocal();

//atribuição
var atribuição = 'Olá mundo';
console.log(atribuição);

//comparacao
var comparacao = '0' == 0;
console.log(comparacao);

//comparacao iguais
var comparacaoIgual = '0' === 0;
console.log(comparacaoIgual);

//adicao
var adicao = 1+1;
console.log(adicao);

//subtracao
var subtracao = 2 - 1;
console.log(subtracao);

//multiplicacao
var multiplicacao = 2 * 3;
console.log(multiplicacao);

//divisao
var divisao = 6 / 2;
console.log(divisao);

//divisao inteira 
var divisaoInteira = 6 % 2;
console.log(divisaoInteira);

//potenciacao
var potenciacao = 2 ** 15;
console.log(potenciacao);
