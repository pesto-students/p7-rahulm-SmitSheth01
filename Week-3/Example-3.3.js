function createIncrement() {
    let count = 0;
    function increment() {
        count++;
    }
    let message =`Count is ${count}`;
    function log() {
        console.log(message);
    }
    return[increment,log];
}
/*
  Explanation:
    When below assignment command will be executed the function block will be executed where 
        -> count is initialized to '0'
        -> function block increment() will be defined
        -> message variable will value "Count is 0" will be stored into memory
        -> function block log() will be defined
        -> const[increment,log] will have reference of increment() and log()
*/
const[increment,log] = createIncrement();
increment(); // count will be initialize to 1
increment(); // count will be initialize to 2
increment(); // count will be initialize to 3
log(); // will print console.log(message) -> 0 as message variable is already defined and it has 
       //value stored in its memory before hand itself.

/*
    Output :
    Count is 0
*/