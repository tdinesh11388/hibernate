package com.app.BookMyShow;

import com.app.BookMyShow.dao.BookyMyShowRepository;
import com.app.BookMyShow.dto.BookMyShowDTO;
import com.app.BookMyShow.entity.BookMyShowEntity;

public class App 
{
    public static void main( String[] args )
    {
    	BookMyShowEntity bookMyShowEntity = new BookMyShowEntity();
    	bookMyShowEntity.setAltKey(202);
    	bookMyShowEntity.setMovieName("WAR2");
    	bookMyShowEntity.setActorName("NTR");
    	bookMyShowEntity.setActressName("Janvi Kapoor");
    	bookMyShowEntity.setMovieBudget("1000cr");
    	bookMyShowEntity.setMovieRating("9/10");
    	bookMyShowEntity.setReleaseDate("20/April/2024");
    	
    	BookyMyShowRepository repository = new BookyMyShowRepository();
    	
    	//repository.saveOrUpdate(bookMyShowEntity);
    	
    	//BookMyShowEntity movieById = repository.getMovieById(201);
    	//System.out.println(movieById);
    	
    	BookMyShowDTO bookMyShowDTO = new BookMyShowDTO();
    	bookMyShowDTO.setAltKey(201);
    	bookMyShowDTO.setMovieBudget("500cr");
    	bookMyShowDTO.setMovieRelease("27/april/2024");
    	
    	repository.updateData(bookMyShowDTO);
    	
    }
}
