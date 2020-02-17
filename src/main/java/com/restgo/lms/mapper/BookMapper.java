package com.restgo.lms.mapper;

import com.restgo.lms.dto.BookDTO;
import com.restgo.lms.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        uses = {AuthorMapper.class,PublisherMapper.class})
public interface BookMapper {

    BookDTO toDTO(Book book);

    Book toEntity(BookDTO bookDTO);
}
