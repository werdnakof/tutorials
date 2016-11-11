package com.smdev.hib.domain;

import com.smdev.hib.AppException;
import com.smdev.hib.core.CrudObject;
import com.smdev.hib.entity.StudentEntity;

/**
 * @author Ireth
 */
public class Student extends CrudObject<StudentEntity> {

	public Student(Integer id) throws AppException {
		super(StudentEntity.class, id);
	}

	public Student(StudentEntity entity) {
		super(entity);
	}

}
