/*
 * Copyright (C) 2024 Baidu, Inc. All Rights Reserved.
 */
package com.craftinginterpreters.lox;

import java.util.HashMap;
import java.util.Map;

/**
 * InterfaceDesc
 *
 * @author wangyan74
 * @version 1.0
 * @description
 * @date 8/24/24 14:13
 */
public class Environment {
    private final Map<String, Object> values = new HashMap<>();

    Object get(Token name) {
        if (values.containsKey(name.lexeme)) {
            return values.get(name.lexeme);
        }

        throw new RuntimeError(name, "Undefined variable '" + name.lexeme + "'.");
    }

    void assign(Token name, Object value) {
        if (values.containsKey(name.lexeme)) {
            values.put(name.lexeme, value);
            return;
        }

        throw new RuntimeError(name, "Undefined variable '" + name.lexeme + "'.");
    }

    void define(String name, Object value) {
        values.put(name, value);
    }

}
