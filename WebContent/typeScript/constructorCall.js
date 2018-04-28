console.log('constructor class example');
var ErtigaConstructor = /** @class */ (function () {
    function ErtigaConstructor(prize, carType) {
        console.log('constructor call started');
        this.type = carType;
        this.prize = prize;
    }
    //this is different than java. constructor keyword is used for defining constructor method
    /*
    constructor() {
        console.log('default constructor');
    }
    */
    ErtigaConstructor.prototype.changeValue = function (ertigaObj) {
        console.log(ertigaObj.prize + " is original value");
        ertigaObj.prize = 101;
        console.log('value is changed=' + ertigaObj.prize);
    };
    return ErtigaConstructor;
}());
//first instantiation wrong syntax
//var example:ErtigaConstructor=new ErtigaConstructor(10,'disel');
var example = new ErtigaConstructor(10, 'disel');
example.changeValue(example);
var second = new ErtigaConstructor(20, 'petrol');
second.changeValue(second);
/*
error record
error TS2393: Duplicate function implementation.
error TS2393: Duplicate function implementation.
 only one constructor is allowed
 
 
 Multiple constructor implementations are not allowed.

*/ 
