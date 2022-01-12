/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

package server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServerApp

fun main(args: Array<String>) {
    runApplication<ServerApp>(*args)
}