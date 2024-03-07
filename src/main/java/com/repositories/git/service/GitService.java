package com.repositories.git.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.repositories.git.dto.GitDTO;
@Service
public class GitService {

    @Autowired
    private RestTemplate restTemplate;

    public GitDTO[] getRepositories(String username) {
        String url = "https://api.github.com/users/" + username + "/repos";
        return restTemplate.getForObject(url, GitDTO[].class);
    }
}