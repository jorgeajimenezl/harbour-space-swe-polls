package com.harbourspace.cs308.controller;

import org.springframework.web.bind.annotation.RestController;

import com.harbourspace.cs308.service.GithubService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class GithubApiController {
    @Autowired
    private GithubService githubService;

    @PostMapping("/api/github/subscribe")
    public ResponseEntity<Void> subscribe(@PathVariable String owner, @PathVariable String repo) {
        githubService.subscribe(owner, repo);
        return ResponseEntity.ok().build();
    }    
}
