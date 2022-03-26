package com.portfolio.backend;

import com.portfolio.backend.service.FilesStorageService;
import javax.annotation.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {
    @Resource
        FilesStorageService storageService;
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
    
  public void run(String... arg) throws Exception {
    storageService.deleteAll();
    storageService.init();
  }   
}
