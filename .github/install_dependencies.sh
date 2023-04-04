#!/bin/bash
    ./mvnw install:install-file -Dfile=./tntconcept-core/jars_to_install/jta-1.0.1B.jar -DgroupId=javax.transaction -DartifactId=jta -Dversion=1.0.1B -Dpackaging=jar
    ./mvnw install:install-file -Dfile=./tntconcept-web/jars_to_install/olap4j-0.9.6.jar -DgroupId=org.olap4j -DartifactId=olap4j -Dversion=0.9.6 -Dpackaging=jar
    ./mvnw install:install-file -Dfile=./tntconcept-web/jars_to_install/mondrian-3.0.0.jar -DgroupId=mondrian -DartifactId=mondrian -Dversion=3.0.0 -Dpackaging=jar
    ./mvnw install:install-file -Dfile=./tntconcept-web/jars_to_install/wcf-1.7.0.jar -DgroupId=com.tonbeller.wcf -DartifactId=wcf -Dversion=1.7.0 -Dpackaging=jar
    ./mvnw install:install-file -Dfile=./tntconcept-web/jars_to_install/jpivot-1.8.0.jar -DgroupId=com.tonbeller.jpivot -DartifactId=jpivot -Dversion=1.8.0 -Dpackaging=jar
    ./mvnw install:install-file -Dfile=./tntconcept-web/jars_to_install/tbutils-wcf-1.7.0.jar -DgroupId=com.tonbeller.tbutils -DartifactId=tbutils-wcf -Dversion=1.7.0 -Dpackaging=jar
    ./mvnw install:install-file -Dfile=./tntconcept-web/jars_to_install/javacup-0.10k.jar -DgroupId=java_cup -DartifactId=javacup -Dversion=0.10k -Dpackaging=jar
    ./mvnw install:install-file -Dfile=./tntconcept-web/jars_to_install/eigenbase-properties-1.0.jar -DgroupId=org.eigenbase.util.property -DartifactId=eigenbase-properties -Dversion=1.0 -Dpackaging=jar
    ./mvnw install:install-file -Dfile=./tntconcept-web/jars_to_install/eigenbase-resgen-1.0.jar -DgroupId=org.eigenbase.resgen -DartifactId=eigenbase-resgen -Dversion=1.0 -Dpackaging=jar
    ./mvnw install:install-file -Dfile=./tntconcept-web/jars_to_install/eigenbase-xom-1.0.jar -DgroupId=org.eigenbase.xom -DartifactId=eigenbase-xom -Dversion=1.0 -Dpackaging=jar