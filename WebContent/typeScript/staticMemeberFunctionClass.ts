class staticMemberFunctionClass {

static staticNumberex:number=100;

static agentValue:String="SUZUKICAR";


	static printStatic():void {
		console.log('print static started='+staticMemberFunctionClass.agentValue);
		console.log('nubmer started ='+staticMemberFunctionClass.staticNumberex);
	}

}
console.log('number value='+staticMemberFunctionClass.staticNumberex);

staticMemberFunctionClass.printStatic();

console.log('console log avlue='+staticMemberFunctionClass.agentValue);