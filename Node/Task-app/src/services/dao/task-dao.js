let Task = require('../../models/task')

async function getAllTask() {
  return await Task.find().exec();
}

async function getTask(id) {
  try {
    return await Task.findById(id).exec();
  } catch (error) {
    return { Error: "Task not found" }
  }
}

async function insertTask(task) {
  let tempTask = new Task(task)
  console.log(tempTask)
  try {
    return await tempTask.save()
  } catch (error) {
    return {
      error: "Task already Exists"
    }
  }
}

async function deleteTask(id) {
  return await Task.findByIdAndDelete(id).exec();
}


async function updateTask(task) {

  try {

    const tempTask = await Task.findById(task._id);

    let allowedUpdate = ['description', 'completed']

    // user not found
    if (!tempTask) {
      return { error: "Task is not Exist" }

    } else {

      let updatedFields = Object.keys(task)

      updatedFields.forEach(
        key => {
          if (allowedUpdate.indexOf(key) > -1) {
            console.log(key);
            tempTask[key] = task[key]
          }
          task['description']
        })
      console.log(tempTask)
      return await tempTask.save();

    }

  } catch (err) { console.log(err) }

}


module.exports = {
  getAllTask,
  getTask,
  deleteTask,
  updateTask,
  insertTask
}