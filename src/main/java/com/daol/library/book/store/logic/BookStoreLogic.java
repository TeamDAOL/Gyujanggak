package com.daol.library.book.store.logic;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daol.library.book.domain.Book;
import com.daol.library.book.domain.Search;
import com.daol.library.book.store.BookStore;

@Repository
public class BookStoreLogic implements BookStore {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<Book> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> selectSearchSimple(Search search) {
		List<Book> bList = sqlSession.selectList("bookMapper.selectSearchSimple", search);
		return bList;
	}

	@Override
	public List<Book> selectSearchDetail(Search search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> selectSearchSub(Search search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> selectSearchNew() {
		// TODO Auto-generated method stub
		return null;
	}
	
}