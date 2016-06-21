package com.br.renato.samples.controller;

import com.br.renato.samples.exceptions.LibraryException;
import com.br.renato.samples.models.LibraryBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LibraryController {

    @Autowired
    private LibraryBusiness libraryBusiness;

    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addBook(@RequestBody Map<String, Object> input) throws LibraryException {
        int bookId = libraryBusiness.addBook(input);

        Map<String, Object> retMap = new HashMap<String, Object>();
        retMap.put("status", "success");
        retMap.put("id", bookId);

        ResponseEntity<Map<String, Object>> retValue = new ResponseEntity<Map<String, Object>>(retMap, HttpStatus.OK);

        return retValue;
    }
}
