package com.geezylucas.springforgraphqlexample.controller;

import com.geezylucas.springforgraphqlexample.exception.NotFoundException;
import graphql.GraphQLError;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.graphql.data.method.annotation.GraphQlExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GeneralControllerAdvice {

    @GraphQlExceptionHandler
    public GraphQLError handlerNotFound(NotFoundException e) {
        return GraphQLError.newError()
                .message(e.getMessage())
                .errorType(ErrorType.NOT_FOUND)
                .build();
    }
}
