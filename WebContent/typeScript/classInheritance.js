var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
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
var ChildClass = /** @class */ (function (_super) {
    __extends(ChildClass, _super);
    function ChildClass() {
        var _this = _super.call(this) || this;
        console.log('child constructor');
        return _this;
    }
    return ChildClass;
}(ParentClass));
var chil = new ChildClass();
//var out=chil.printDetails(); //arugment missing  Expected 1 arguments, but got 0. syntax erro
var out = chil.printDetails('inutstrvaluddddk');
console.log('output =' + out);
console.log(out.parentString);
console.log(chil.childStr + "child string  printed");
