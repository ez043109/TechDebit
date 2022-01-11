/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

plugins {
    id("kotlin-common-conventions")
    `java-library`
}

dependencies {

    testImplementation("nl.jqno.equalsverifier", "equalsverifier", "3.8.2")
}