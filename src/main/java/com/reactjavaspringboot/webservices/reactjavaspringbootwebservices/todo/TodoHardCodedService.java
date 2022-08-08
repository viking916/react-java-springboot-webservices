package com.reactjavaspringboot.webservices.reactjavaspringbootwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {
    private static List<Todo> todos = new ArrayList<>();
    private static long idCounter = 0;
    static {
        todos.add(new Todo(++idCounter, "vvp19", "Learn to Swim", new Date(), false));
        todos.add(new Todo(++idCounter, "vvp19", "Learn to Web3 dev", new Date(), false));
        todos.add(new Todo(++idCounter, "vvp19", "Visit Egypt", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Todo save(Todo todo) {
        if (todo.getId() == -1) {
            todo.setId(++idCounter);
            todos.add(todo);
        } else {
            deleteById(todo.getId());
            todos.add(todo);
        }
        return todo;
    }

    public Todo deleteById(long id) {
        Todo todo = findById(id);
        if (todo == null)
            return null;
        if (todos.remove(todo)) {
            return todo;
        }

        return null;

    }

    Todo findById(long id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }
}
