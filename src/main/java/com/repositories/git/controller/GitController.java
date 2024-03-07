package com.repositories.git.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.repositories.git.service.GitService;
import com.repositories.git.dto.GitDTO;

@RestController
public class GitController {

    @Autowired
    private GitService gitService;

    @GetMapping("/repositories/{username}")
    public GitDTO[] getRepositories(@PathVariable String username) {
        return gitService.getRepositories(username);
    }
}
