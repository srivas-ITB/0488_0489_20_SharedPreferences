package com.example.app20_SharedPreferences.domain.exemple2

import com.example.app20_SharedPreferences.data.exemple2.Student

class StudentProvider {
    private val students: MutableList<Student> = mutableListOf(
        Student("John Doe", "DAM2", "9"),
        Student("Darth Vader", "DAM1", "6"),
        Student("Frodo Bolsón", "DAM1", "4"),
        Student("Hermione Granger", "DAM2", "10"),
        Student("Diana Prince", "DAM1", "5"),
        Student("Mickey Mouse", "DAM2", "7"),
        Student("Leo Messi", "DAM1", "10")
        )

    fun getStudentsCount(): Int {
        return students.size
    }

    fun getStudentByPosition(position: Int): Student {
        return students[position]
    }

    fun updateStudent(position: Int, newStudent: Student) {
        students[position] = newStudent
    }
}
