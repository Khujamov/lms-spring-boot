package com.restgo.lms.mapper;

import com.restgo.lms.dto.PublisherDTO;
import com.restgo.lms.entity.Publisher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = BookMapper.class)
public interface PublisherMapper {

    PublisherDTO toDTO(Publisher publisher);

    Publisher toEntity(PublisherDTO publisherDTO);
}
