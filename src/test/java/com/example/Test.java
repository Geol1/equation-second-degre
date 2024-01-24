// checkstyle -c path/to/checkstyle.xml path/to/your/java/files
// findbugs -exclude path/to/findbugs-exclude.xml -sourcepath path/to/your/java/files -output findbugs-result.xml -xml
// pmd -d path/to/your/java/files -R path/to/pmd-ruleset.xml
// unzip pmd-dist-7.0.0-rc4-bin.zip
// $ alias pmd="$HOME/pmd-bin-7.0.0-rc4/bin/pmd"
// $ pmd check -d /usr/src -R rulesets/java/quickstart.xml -f text

// mvn pmd:pmd
// mvn checkstyle:checkstyle
// mvn findbugs:findbugs

//  mvn pmd:pmd checkstyle:checkstyle findbugs:findbugs
// mvn clean install site
// mvn clean install test site -Dmaven.test.failure.ignore=true

