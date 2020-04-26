package io.kimjinwook.lgcns.springboot.service;

import java.util.Optional;

import io.kimjinwook.lgcns.springboot.domain.Book;

public interface BookService {
	
	Optional<Book> findById(Long id) ;
}
