package com.sfa.azuredemoapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AzureDemoAppApplication

fun main(args: Array<String>) {
    runApplication<AzureDemoAppApplication>(*args)
}
