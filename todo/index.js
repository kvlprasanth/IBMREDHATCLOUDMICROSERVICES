const mongoose = require('mongoose');
const todo = require('./routes/todos');
const express = require('express');
const app = express();

mongoose.connect('mongodb://localhost/todo')
  .then(() => console.log('Connected to MongoDB...'))
  .catch(err => console.error('Could not connect to MongoDB...'));

  app.use(express.json());

app.use('/api/todo', todo);
app.listen(3000);