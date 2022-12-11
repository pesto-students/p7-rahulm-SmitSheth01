function getRandNumber(){
    return Math.random();
}


function getPromise(num){

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

let promise = getPromise(getRandNumber);

promise.then((result)=>{console.log(result)})
.catch((error)=>{console.log(error)});