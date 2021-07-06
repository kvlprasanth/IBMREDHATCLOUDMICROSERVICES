const mongoose = require('mongoose');
 
mongoose.connect('mongodb://localhost/employee1')
  .then(() => console.log('Connected to MongoDB...'))
  .catch(err => console.error('Could not connect to MongoDB...', err));
 
const Employees = mongoose.model('Employees', new mongoose.Schema({
  firstName: String,
  lastName: String,
  email: String
}));
 
async function createEmployees(firstName, lastName, email) { 
  const employee = new Employees({
    firstName, 
    lastName, 
    email 
  });
 
  const result = await employee.save();
  console.log(result);
}
async function displayEmployees()
{
    return await Employees.find();
    
}
 
async function listEmployees() { 
    const employees = await Employees
      .find()
      .select('firstName');
      console.log(employees);
  }



 
createEmployees('kvl', 'prasanth', 'prasanth@email.com');
 
// createCourse('Node Course', 'authorId')
 
// listCourses();
listEmployees();