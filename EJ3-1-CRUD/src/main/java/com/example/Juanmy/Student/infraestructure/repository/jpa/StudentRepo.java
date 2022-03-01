package com.example.Juanmy.Student.infraestructure.repository.jpa;


import com.example.Juanmy.Student.domain.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,String> {

}
