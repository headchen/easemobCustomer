var exec = require('cordova/exec');

exports.callEaseUICustomer = function(kfInfo, success, error) {
    exec(success, error, "EasemobCustomer", "callCustomer", [kfInfo]);
};
