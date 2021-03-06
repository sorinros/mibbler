# Mibbler

## Introduction
Mibbler is a utility for generating Java representations of entities described in SNMP MIB files.  

At a high level it parses a set of SNMP MIBs and in conjunction with some supplied metadata generates a Jar file 
that provides JavaBeans and Helper classes for interacting with SNMP Devices that conform to the MIB definitions supplied.

To leverage the Java Classes generated by Mibbler an additional jar file is required containing common SNMP code, further information
on this jar can be found at [snmp-core](https://github.com/btisystems/snmp-core).

## Mibble Jar
Mibble is currently not available through a Maven Repository, to simplify its use i've created a local repository and installed the jar on the filesystem to be 
used at build time.  The command used to do this is outlined below.

     $ mvn deploy:deploy-file -Durl=file:./repo -Dfile=mibble-parser-2.9.3.jar -DgroupId=net.percederberg -DartifactId=mibble-parser -Dpackaging=jar -Dversion=2.9.3
     $ mvn deploy:deploy-file -Durl=file:./repo -Dfile=mibble-mibs-2.9.3.jar -DgroupId=net.percederberg -DartifactId=mibble-mibs -Dpackaging=jar -Dversion=2.9.3

For those wishing to download the full version of the software its available [here](http://www.mibble.org/download/stable/index.html).

## Getting Started
The project includes an Hello World, this is located [here](./helloworld).  Third parties wishing to generate jars from 
SNMP Mibs should use this project as a starter. 

The project also includes support for the following standard mibs:

* RFCs
* NET-SNMP
* BTI 7000 Series 

For parties wishing to use the common [MIBS RFC](./mibs/rfc/src/main/resources/mibs) or 
[NET-SNMP](mibs/net-snmp/src/main/resources/mibs) they should include the dependencies generated by these projects
rather than creating the output themselves separately. 

For e.g. 

`````
    <dependency>
        <groupId>com.btisystems.mibbler.mibs</groupId>
        <artifactId>rfc</artifactId>
    <dependency>
`````

Or 

`````
    <dependency>
        <groupId>com.btisystems.mibbler.mibs</groupId>
        <artifactId>net-snmp</artifactId>
    <dependency>
`````

## License
The utility itself uses the brilliant SNMP Mib Parser, [Mibble](https://github.com/cederberg/mibble) developed by Per Cederberg.
 This parsing library is GPL code and as such the Mibbler generator code (used only at compile time, located in the autogen directory) is provided following the GPL License model.
 
 
The output generated by the utility has no dependency on Mibble and as such is Licensed separately following the Apache License, 
[Apache 2.0](http://opensource.org/licenses/Apache-2.0).  
