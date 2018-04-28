console.log('parent interface started');


interface parentInterface {
	
	parentField:String,
	printDetails:()=>void
	
	
}


 var parentInteraceObj:parentInterface={
	 
	 parentField:"parent field name value defined",
	 printDetails:()=> {
		 console.log('print details started');
		 
		 console.log('print details ended');
		 
	 }
	 
 }
 
 
 console.log('interface ended');
 
 
 console.log('method call defined below');
 parentInteraceObj.printDetails();
 
 console.log(parentInteraceObj.printDetails());