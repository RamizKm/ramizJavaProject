var staticMemberFunctionClass = /** @class */ (function () {
    function staticMemberFunctionClass() {
    }
    staticMemberFunctionClass.printStatic = function () {
        console.log('print static started=' + staticMemberFunctionClass.agentValue);
        console.log('nubmer started =' + staticMemberFunctionClass.staticNumberex);
    };
    staticMemberFunctionClass.staticNumberex = 100;
    staticMemberFunctionClass.agentValue = "SUZUKICAR";
    return staticMemberFunctionClass;
}());
console.log('number value=' + staticMemberFunctionClass.staticNumberex);
staticMemberFunctionClass.printStatic();
console.log('console log avlue=' + staticMemberFunctionClass.agentValue);
