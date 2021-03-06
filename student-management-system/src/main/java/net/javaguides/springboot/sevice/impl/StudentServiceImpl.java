package net.javaguides.springboot.sevice.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.entity.Student;
import net.javaguides.springboot.repository.StudentRepository;
import net.javaguides.springboot.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
	return	studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
	return	studentRepository.save(student);
		
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(long id) {
		studentRepository.deleteById(id);
	
	}


}
