var Person = function() {};
Person.prototype.initialize=function(name,age){
    this.name=name;
    this.age=age;
}

var Teacher = function(){};
Teacher.prototype.teach=function(subject){
    this.subject = subject;
    console.log(this.name+" is now teaching "+this.subject);
}

Object.setPrototypeOf(Teacher.prototype, Person.prototype);
// TODO: create the class Teacher and a method teach
var him = new Teacher();
him.initialize("Adam",45);
him.teach("Inheritance");
