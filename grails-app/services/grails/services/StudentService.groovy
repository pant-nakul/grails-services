package grails.services

import grails.transaction.NotTransactional
import grails.transaction.Transactional


class StudentService {

    static transactional = false

    @Transactional
    Student serviceMethod() {
        Student student = new Student(name: "Student", age: 19)
        student=student.save(flush: true,failOnError: true)
        1/0
        return student
    }
}
