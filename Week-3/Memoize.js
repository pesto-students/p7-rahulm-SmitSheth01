/*
Here 
*/
function memoizeAdd(...args)
{
    let strArgs1 = args.map(function(e){return e.toString()});
    let numkey = strArgs1.reduce((acc,value) => {return acc+value});
    let addMap = new Map();
    if (addMap.has(numkey))
    {
        return addMap.get(numkey);
    }
    else{
        let addnum=args.reduce((acc,value)=>{return acc+value});
        addMap.set(numkey,addnum);
        return addnum;
    }
}
console.log(memoizeAdd(10,20));
console.log(memoizeAdd(10,20,30));
console.log(memoizeAdd(10,20,30,40));
console.log(memoizeAdd(10,20));