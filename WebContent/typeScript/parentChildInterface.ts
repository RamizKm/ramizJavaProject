console.log('console log started');

interface parentInterface {
	
	
	firstParent:String,
	printParentDetails:()=>void
	
	
}


interface childInterface extends parentInterface {
	
	childParent:String,
	printChildDetails:()=>void
	
	
}


 var childobj=<childInterface>{};
 
 childobj.firstParent="rkm string child";
 childobj.childParent="child started";
 
 console.log('child object method member variables');
 console.log(childobj.firstParent);
 console.log(childobj.childParent);
 
 
 