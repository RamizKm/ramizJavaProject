/**
 * 
 */
console.log('readfile content js started');

var fd=require("fs");

var fdcontent=fd.readFileSync('sampleInput.txt');

console.log(fdcontent.toString());

console.log('program has ended');