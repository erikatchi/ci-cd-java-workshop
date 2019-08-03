package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Exemplo básico de um comentário em JavaDoc.
 * com mais de uma linha.
 */

@RestController
@CrossOrigin
    public class TestController {
     /** Exemplo básico de um comentário em JavaDoc.
      * com mais de uma linha.
      */
      /** @return result of operation if log successful. */
         @GetMapping("/home")
         public String homeRequest() {
           /** Hello World */
           return "Hello World!";
      }
}
