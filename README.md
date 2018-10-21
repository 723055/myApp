# course-system-application

/api/courses/{name} deleteCourse - удаление курса

/api/courses/{name}/{dateStart}/{dateFinish} createCourse - создание курса

/api/courses/course_list courseList - список курсов

/api/courses/get/{id} getCourseById - список студентов с оценками по датам у конкретного курса (по id курса)

/api/students/{name}/{phone}/{email} createStudent - добавление студента


/api/students/create createData - сделано для быстрого заполнения тестовыми данными в бд, запустить его в swagger перед началом тестирования

/api/students/student/{id}/{name}/{phone} changeStudentData - изменение данных студента

/api/students/{id} deleteStudent - удаление студента из бд
