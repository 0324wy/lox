/*
 * Copyright (C) 2024 Baidu, Inc. All Rights Reserved.
 */
package com.craftinginterpreters.lox;/**
 * InterfaceDesc
 *
 * @author wangyan74
 * @version 1.0
 * @description
 * @date 2024/8/19 20:23
 */
public class Token {

    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    public Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}
