console.log('parent class');


class ParentClass {

  parentString:String;
  pareintInt:number;
  
  
  constructor() {
  	console.log('default constructor');
  
  }
  
  
  printDetails(str:String):ParentClass
   {
   console.log('call to functin str='+str);
   
   var p=new ParentClass();
   p.parentString=str;
   console.log('constructor p value='+p.parentString);
   return p;
  }

}


class ChildClass extends ParentClass {

	childStr:String;
	
	constructor() {
		super();
		console.log('child constructor');
		
	
	}



}


var chil=new ChildClass();
//var out=chil.printDetails(); //arugment missing  Expected 1 arguments, but got 0. syntax erro
var out=chil.printDetails('inutstrvaluddddk');
console.log('output ='+out);

console.log(out.parentString);
console.log(chil.childStr+"child string  printed");

var childObjInstance=new ChildClass();

console.log('inst obj started='+childObjInstance);

var a=childObjInstance instanceof ChildClass;
var ab=childObjInstance instanceof ParentClass;

console.log(' a value='+a);

console.log('b value='+ab);


