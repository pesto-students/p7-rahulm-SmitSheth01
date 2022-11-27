function createStack(){
    items = [];

    /* Object.freeze stops extension or manipulation of properties of object */
    return Object.freeze({
        push(item) {
            items.push(item);
        },
        pop() {
            return items.pop();
        },
        print() {
            console.log(items);
        },
    });
};

const stack = createStack();
stack.push(10);
stack.push(5);
stack.pop()
stack.items;
console.log(stack.items);
stack.items = [10, 100, 1000];
console.log(stack.items);