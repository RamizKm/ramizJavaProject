console.log('first interface define');
var firExampleObj = {
    firstName: 'rkm example',
    email: 'rkm@abc.com',
    age: 34,
    helloWorld: function () {
        console.log('hello world started function started');
        return "welcome hello world msg";
    }
};
console.log('printing details');
console.log(firExampleObj.firstName);
console.log('email=' + firExampleObj.email);
console.log(firExampleObj.helloWorld());
