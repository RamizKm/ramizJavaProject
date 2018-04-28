console.log('parent interface started');
var parentInteraceObj = {
    parentField: "parent field name value defined",
    printDetails: function () {
        console.log('print details started');
        console.log('print details ended');
    }
};
console.log('interface ended');
console.log('method call defined below');
parentInteraceObj.printDetails();
console.log(parentInteraceObj.printDetails());
