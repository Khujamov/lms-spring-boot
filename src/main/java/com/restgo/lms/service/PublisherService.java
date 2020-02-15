package com.restgo.lms.service;

import com.restgo.lms.dto.Response;
import com.restgo.lms.entity.Publisher;
import com.restgo.lms.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository repository;

    public List<Publisher> getAll(){
        return repository.findAll();
    }

    // Add publisher
    public Publisher addPublisher(Publisher publisher){
        return repository.save(publisher);
    }

    // Update publisher Details
    public Publisher updatePublisher(int id,Publisher publisher){
        Publisher oldPublisher = repository.findById(id).get();
        oldPublisher.setName(publisher.getName());
        oldPublisher.setEstablishedDate(publisher.getEstablishedDate());
        return repository.save(oldPublisher);
    }

    // delete a publisher
    public Response deletPublisher(int id){
        Response response = new Response();
        repository.deleteById(id);
        response.setMessage("Successfully deleted");
        response.setSuccess(true);
        return response;
    }

}
