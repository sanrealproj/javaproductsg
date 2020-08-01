package com.tds.data.sg.javaecommsg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tds.data.sg.javaecommsg.model.Product;
import com.tds.data.sg.javaecommsg.repository.ProductRepository;

@Service
public class ProductService implements ProductRepository {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public <S extends Product> List<S> saveAll(Iterable<S> entities) {
		return productRepository.saveAll(entities);
	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> findAll(Sort sort) {
		return null;
	}

	@Override
	public <S extends Product> S insert(S entity) {
		return productRepository.insert(entity);
	}

	@Override
	public <S extends Product> List<S> insert(Iterable<S> entities) {
		return productRepository.insert(entities);
	}

	@Override
	public <S extends Product> List<S> findAll(Example<S> example) {

		return productRepository.findAll(example);
	}

	@Override
	public <S extends Product> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Override
	public Page<Product> findAll(Pageable pageable) {

		return productRepository.findAll(pageable);
	}

	@Override
	public <S extends Product> S save(S entity) {
		
		return productRepository.save(entity);
	}

	@Override
	public Optional<Product> findById(Integer id) {

		return productRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {

		return false;
	}

	@Override
	public Iterable<Product> findAllById(Iterable<Integer> ids) {

		return productRepository.findAllById(ids);
	}

	@Override
	public long count() {

		return 0;
	}

	@Override
	public void deleteById(Integer id) {

	}

	@Override
	public void delete(Product entity) {

	}

	@Override
	public void deleteAll(Iterable<? extends Product> entities) {

	}

	@Override
	public void deleteAll() {

	}

	@Override
	public <S extends Product> Optional<S> findOne(Example<S> example) {

		return null;
	}

	@Override
	public <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable) {

		return productRepository.findAll(example, pageable);
	}

	@Override
	public <S extends Product> long count(Example<S> example) {

		return productRepository.count();
	}

	@Override
	public <S extends Product> boolean exists(Example<S> example) {

		return productRepository.exists(example);
	}

}
