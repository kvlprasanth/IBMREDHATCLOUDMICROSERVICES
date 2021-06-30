class Employee
{

    constructor(_firstName,_lastName,_employeeId,_email){
        this._firstName=_firstName;
        this._lastName=_lastName;
        this._employeeId=_employeeId;
        this._email=_email;
        console.log('within parameterized constructor');

    }
getDetails(){
    return 'Employee ID: '+this._employeeId+' First Name: '+this._firstName+' Last Name: '+this._lastName+' Email: '+this._email;

}
}
let e1=new Employee('kvl','prasanth',100,'kvl@mail.com');
console.log(e1.getDetails());