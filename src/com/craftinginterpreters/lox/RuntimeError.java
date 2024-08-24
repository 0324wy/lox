/*
 * Copyright (C) 2024 Baidu, Inc. All Rights Reserved.
 */
package com.craftinginterpreters.lox;

/**
 * InterfaceDesc
 *
 * @author wangyan74
 * @version 1.0
 * @description
 * @date 8/23/24 17:43
 */
public class RuntimeError extends RuntimeException {

    final Token token;

    RuntimeError(Token token, String message) {
        super(message);
        this.token = token;
    }
}
