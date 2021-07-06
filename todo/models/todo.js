const Joi = require('joi');
const mongoose = require('mongoose');

const Todo = mongoose.model('Todo', new mongoose.Schema({
    todo: {
      type: String,
      required: true,
      minlength: 5,
      maxlength: 50
    },
    description: {
      type: String,
      required: true,
      minlength: 5,
      maxlength: 50
    },
    isCompleted: {
        type: Boolean,
        default: false
     
    }
  }));

  function validateTodo(todo) {
    const schema = {
      todo: Joi.string().min(5).max(50).required(),
      description: Joi.string().min(5).max(50).required(),
      isCompleted: Joi.boolean()
    };
  
    return Joi.validate(todo, schema);
  }

  exports.Todo = Todo; 
exports.validate = validateTodo;