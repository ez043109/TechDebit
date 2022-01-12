/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package server.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {

    @GetMapping("/hello")
    fun index(): String {
        return "Greetings from Bobby Hoang!"
    }
}