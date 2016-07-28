package grails.services

class StudentController {

    def studentService
//OR  StudentService studentService

    def index() {
        println "inside create Student"
        Student savedStudent= studentService.serviceMethod()
        render savedStudent.toString()
    }
}
