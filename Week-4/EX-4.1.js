/** Generates a random number */
function getRandNumber(){
    return Math.random();
}

/**
 * Functions validates a number via promise if number is divisible by 5 it will be rejected else resolved
 * @param {*} callback function 
 * @returns promise
 */
function checkNumber(num){

    let check = Math.round(num()*100);
    console.log(check);
    let promise = new Promise(function (resolve, reject){
        if(check%5 != 0){
            resolve("Promise is resolved");
        }
        else{
            reject("Promise is rejected");
        }
    });
    return promise;
}

let promise = checkNumber(getRandNumber);

promise.then((result)=>{console.log(result)})
.catch((error)=>{console.log(error)});