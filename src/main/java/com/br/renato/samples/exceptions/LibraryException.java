package com.br.renato.samples.exceptions;

import com.br.renato.samples.controller.LibraryController;

/**
 * Created by renato on 21/06/16.
 */
public class LibraryException extends Exception {

    private static final long serialVersionUID = -457531723818045056L;

    public LibraryException(String message, Throwable cause) {
        super(message, cause);
    }

    public LibraryException(String message) {
        super(message);
    }
}
