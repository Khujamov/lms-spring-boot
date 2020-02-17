package com.restgo.lms.mapper;

import com.restgo.lms.dto.AuthorDTO;
import com.restgo.lms.entity.Author;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = BookMapper.class,injectionStrategy = InjectionStrategy.FIELD)
public interface AuthorMapper {
    AuthorDTO toDTO(Author author);

    Author toEntity(Author bookDTO);

    List<AuthorDTO> toDTOs(List<Author> authors);
}
