console.log('first interface define');

interface firstInterface {
	
	firstName:String,
	email:String,
	age:number,
	helloWorld:()=>String
	
	
	
}


	var firExampleObj:firstInterface= {
		firstName:'rkm example',
		email:'rkm@abc.com',
		age:34,
		helloWorld:()=> {
			console.log('hello world started function started');
			return "welcome hello world msg";
			
		}
		
	}
	
	
	console.log('printing details');
	console.log(firExampleObj.firstName);
	
	console.log('email='+firExampleObj.email);
	
	console.log(firExampleObj.helloWorld());