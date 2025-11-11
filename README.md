# DNPM:DIP MTB Data-Transfer-Objects for Java

Serialization and deserialization of DNPM:DIP MTB DTOs for the Java programming language.

This library provides DNPM:DIP data model for use with "Modellvorhaben gem. §64e SGB V"

## Usage notices

Since this library is also intended to be used with Onkostar, the default Java version is limited to Java 11
and all date-time objects do not use JSR 310 types but `java.util.Date`.

JSON (de)serialization includes format conversion for patients birthdate and date of death as introduced in
https://github.com/dnpm-dip/backend-core/commit/97c44aa8bbd6ba4ac81824c5178db23fd08f9068

