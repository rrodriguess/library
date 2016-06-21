package com.br.renato.samples.models;

import com.br.renato.samples.exceptions.LibraryException;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by renato on 21/06/16.
 */

@Component
public class LibraryBusiness {

    public int addBook(Map<String, Object> book) throws LibraryException {
        return 1;
    }
}
