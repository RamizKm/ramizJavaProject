console.log('parent class');
var ParentClass = /** @class */ (function () {
    function ParentClass() {
        console.log('default constructor');
    }
    ParentClass.prototype.printDetails = function (str) {
        console.log('call to functin str=' + str);
        var p = new ParentClass();
        p.parentString = str;
        console.log('constructor p value=' + p.parentString);
        return p;
    };
    return ParentClass;
}());
