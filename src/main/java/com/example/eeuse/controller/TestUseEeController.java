package com.example.eeuse.controller;

import cn.easyes.core.conditions.LambdaEsQueryWrapper;
import com.example.eeuse.mapper.DocumentMapper;
import com.example.eeuse.model.Document;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Test use Easy-ES in spring boot
 * <p>
 * Copyright © 2021 xpc1024 All Rights Reserved
 **/
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestUseEeController {
    // we use the lombok(https://github.com/projectlombok/lombok) to inject beans
    private final DocumentMapper documentMapper;

    @GetMapping("/insert")
    public Integer insert() {
        // init-> create data
        Document document = new Document();
        document.setTitle("Hi");
        document.setContent("Nice to meet you");
        document.setCreator("Guy");
        return documentMapper.insert(document);
    }

    @GetMapping("/search")
    public List<Document> search() {
        // Query all documents with title equals "Hi" and author equals "Guy"
        LambdaEsQueryWrapper<Document> wrapper = new LambdaEsQueryWrapper<>();
        wrapper.eq(Document::getTitle, "Hi")
                .eq(Document::getCreator, "Guy");
        return documentMapper.selectList(wrapper);
    }
}
