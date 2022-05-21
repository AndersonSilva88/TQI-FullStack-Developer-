//vetores
let array = ['string', 1, true];
console.log(array);

//varios elementos 
let array1 = ['string', true, ['array2'], ['array3'], ['array4']];
console.log(array1);

// forEach
array.forEach(function(item, index){console.log(item, index)});

//push
array.push([]);
console.log(array);

//pop
array.pop();
console.log(array);

//shift
array.shift();
console.log(array);

//unshift
array.unshift('novo item no inicio');
console.log(array);

//indexOf
console.log(array.indexOf(true));

//splice
array.splice(0, 3);
console.log(array);

//slice
let novoArray = array.slice(0, 3);
console.log(novoArray);

//objetos
let object = { string: 'string', Number: 1, Boolean: true, array: ['array'], objectInterno: {
    objectInterno: 'objeto interno'}};
console.log(object.objectInterno);

var string = object.string;
console.log(string);    

var arrayInterno = object.array;
console.log(arrayInterno);

var {string, Boolean, objectInterno} = object;
console.log(string, Boolean, objectInterno);