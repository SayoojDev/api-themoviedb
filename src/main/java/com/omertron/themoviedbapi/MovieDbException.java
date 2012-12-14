/*
 *      Copyright (c) 2004-2012 Stuart Boston
 *
 *      This software is licensed under a Creative Commons License
 *      See the LICENCE.txt file included in this package
 *
 *      For any reuse or distribution, you must make clear to others the
 *      license terms of this work.
 */
package com.omertron.themoviedbapi;

public class MovieDbException extends Exception {

    private static final long serialVersionUID = -8952129102483143278L;

    public enum MovieDbExceptionType {
        UNKNOWN_CAUSE, INVALID_URL, HTTP_404_ERROR, MOVIE_ID_NOT_FOUND, MAPPING_FAILED, CONNECTION_ERROR, INVALID_IMAGE, AUTHORISATION_FAILURE;
    }

    private final MovieDbExceptionType exceptionType;
    private final String response;

    public MovieDbException(final MovieDbExceptionType exceptionType, final String response) {
        super();
        this.exceptionType = exceptionType;
        this.response = response;
    }

    public MovieDbException(final MovieDbExceptionType exceptionType, final String response, final Throwable cause) {
        super(cause);
        this.exceptionType = exceptionType;
        this.response = response;
    }

    public MovieDbExceptionType getExceptionType() {
        return exceptionType;
    }

    public String getResponse() {
        return response;
    }
}