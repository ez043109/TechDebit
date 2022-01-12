/*
 * Copyright (c) 2022 Bobby Hoang.  All rights reserved.
 */

plugins {
    id("kotlin-common-conventions")
    `java-library`
}

dependencies {

    testImplementation( "com.willowtreeapps.assertk:assertk-jvm:0.24")
    testImplementation("nl.jqno.equalsverifier:equalsverifier:3.8.2")
}