console.log('constructor class example');


class ErtigaConstructor {

	//variables
	type:String;
	prize:number;
	
	constructor(prize:number,carType:String) {
		console.log('constructor call started');
		this.type=carType;
		this.prize=prize;
	
	}
	
	//this is different than java. constructor keyword is used for defining constructor method
	/*
	constructor() {
		console.log('default constructor');
	}
	*/
	
	
	changeValue(ertigaObj:ErtigaConstructor):void {
	
	console.log(ertigaObj.prize+" is original value");
	
	ertigaObj.prize=101;
	console.log('value is changed='+ertigaObj.prize);
	
	
	}


}

//first instantiation wrong syntax
//var example:ErtigaConstructor=new ErtigaConstructor(10,'disel');


var example=new ErtigaConstructor(10,'disel');

example.changeValue(example);



var second=new ErtigaConstructor(20,'petrol');

second.changeValue(second);

/*
error record
error TS2393: Duplicate function implementation.
error TS2393: Duplicate function implementation.
 only one constructor is allowed
 
 
 Multiple constructor implementations are not allowed.

*/