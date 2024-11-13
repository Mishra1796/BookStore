package com.fmg.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.fmg.entity.FMGNBookStoreEntity;
@EnableJpaRepositories
public interface FMGNBookStoreRepo extends JpaRepository<FMGNBookStoreEntity, Long>{
     
	@Query(value="select * from fmg_bookstore where book_id= :BookId ",nativeQuery = true)
	List<FMGNBookStoreEntity> finByBookId(@Param("BookId") long BookId);

	@Query(value = "UPDATE fmg_bookstore SET status ='sold' WHERE book_id= :BookId", nativeQuery = true)
	@Modifying
	long updateBookStatus(@Param("BookId") long BookId);

}
