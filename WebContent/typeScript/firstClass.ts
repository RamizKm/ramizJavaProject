console.log('first class');

class firstClass {

	firstname:String;
	printClassDetails():void {
		
		console.log('method started');
		
		var id:"ramiz id started";
		
		console.log("id started="+id);
		this.firstname=id;
		
		console.log("first name started="+this.firstname);
		
		
	}



}

var fobj=new firstClass();

fobj.printClassDetails();

console.log('method call ended');