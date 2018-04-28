console.log('first class');
var firstClass = /** @class */ (function () {
    function firstClass() {
    }
    firstClass.prototype.printClassDetails = function () {
        console.log('method started');
        var id;
        console.log("id started=" + id);
        this.firstname = id;
        console.log("first name started=" + this.firstname);
    };
    return firstClass;
}());
var fobj = new firstClass();
fobj.printClassDetails();
console.log('method call ended');
