console.log('json object example');
var jsonCity = {
    cityid: 'pune12',
    cityName: 'pune',
    cityCouncil: 'Pune Muncipal Corporation Pune',
    cityArea: 234,
    cityLeader: 'Ajitdada Pawar',
    printCity: function () { }
};
console.log('ccityid=' + jsonCity.cityid);
console.log('city anme=' + jsonCity.cityName);
console.log('area=' + jsonCity.cityArea);
console.log('leader=' + jsonCity.cityLeader);
jsonCity.printCity = function () {
    console.log('printcity started');
    console.log('city area=' + jsonCity.cityid);
    //console.log('ccityname startded=='+cityName); syntax error
};
jsonCity.printCity();
