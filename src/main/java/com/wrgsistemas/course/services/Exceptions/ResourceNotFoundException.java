package com.wrgsistemas.course.services.Exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		
		super("!Recurso not Encontrado. id " + id);
		
	}
}
